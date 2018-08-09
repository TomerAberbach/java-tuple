import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a nine-tuple.
 */
public final class Nonad<A, B, C, D, E, F, G, H, I> {
    /**
     * Element at position one of this {@link Nonad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Nonad}.
     */
    private final B two;
    /**
     * Element at position three of this {@link Nonad}.
     */
    private final C three;
    /**
     * Element at position four of this {@link Nonad}.
     */
    private final D four;
    /**
     * Element at position five of this {@link Nonad}.
     */
    private final E five;
    /**
     * Element at position six of this {@link Nonad}.
     */
    private final F six;
    /**
     * Element at position seven of this {@link Nonad}.
     */
    private final G seven;
    /**
     * Element at position eight of this {@link Nonad}.
     */
    private final H eight;
    /**
     * Element at position nine of this {@link Nonad}.
     */
    private final I nine;


    /**
     * Sets all fields to null.
     */
    public Nonad() {
        this(null, null, null, null, null, null, null, null, null);
    }

    /**
     * @param one {@link Nonad#one}.
     */
    public Nonad(A one) {
        this(one, null, null, null, null, null, null, null, null);
    }

    /**
     * @param one {@link Nonad#one}.
     * @param two {@link Nonad#two}.
     */
    public Nonad(A one, B two) {
        this(one, two, null, null, null, null, null, null, null);
    }

    /**
     * @param one   {@link Nonad#one}.
     * @param two   {@link Nonad#two}.
     * @param three {@link Nonad#three}.
     */
    public Nonad(A one, B two, C three) {
        this(one, two, three, null, null, null, null, null, null);
    }

    /**
     * @param one   {@link Nonad#one}.
     * @param two   {@link Nonad#two}.
     * @param three {@link Nonad#three}.
     * @param four  {@link Nonad#four}.
     */
    public Nonad(A one, B two, C three, D four) {
        this(one, two, three, four, null, null, null, null, null);
    }

    /**
     * @param one   {@link Nonad#one}.
     * @param two   {@link Nonad#two}.
     * @param three {@link Nonad#three}.
     * @param four  {@link Nonad#four}.
     * @param five  {@link Nonad#five}.
     */
    public Nonad(A one, B two, C three, D four, E five) {
        this(one, two, three, four, five, null, null, null, null);
    }

    /**
     * @param one   {@link Nonad#one}.
     * @param two   {@link Nonad#two}.
     * @param three {@link Nonad#three}.
     * @param four  {@link Nonad#four}.
     * @param five  {@link Nonad#five}.
     * @param six   {@link Nonad#six}.
     */
    public Nonad(A one, B two, C three, D four, E five, F six) {
        this(one, two, three, four, five, six, null, null, null);
    }

    /**
     * @param one   {@link Nonad#one}.
     * @param two   {@link Nonad#two}.
     * @param three {@link Nonad#three}.
     * @param four  {@link Nonad#four}.
     * @param five  {@link Nonad#five}.
     * @param six   {@link Nonad#six}.
     * @param seven {@link Nonad#seven}.
     */
    public Nonad(A one, B two, C three, D four, E five, F six, G seven) {
        this(one, two, three, four, five, six, seven, null, null);
    }

    /**
     * @param one   {@link Nonad#one}.
     * @param two   {@link Nonad#two}.
     * @param three {@link Nonad#three}.
     * @param four  {@link Nonad#four}.
     * @param five  {@link Nonad#five}.
     * @param six   {@link Nonad#six}.
     * @param seven {@link Nonad#seven}.
     * @param eight {@link Nonad#eight}.
     */
    public Nonad(A one, B two, C three, D four, E five, F six, G seven, H eight) {
        this(one, two, three, four, five, six, seven, eight, null);
    }

    /**
     * @param one   {@link Nonad#one}.
     * @param two   {@link Nonad#two}.
     * @param three {@link Nonad#three}.
     * @param four  {@link Nonad#four}.
     * @param five  {@link Nonad#five}.
     * @param six   {@link Nonad#six}.
     * @param seven {@link Nonad#seven}.
     * @param eight {@link Nonad#eight}.
     * @param nine  {@link Nonad#nine}.
     */
    public Nonad(A one, B two, C three, D four, E five, F six, G seven, H eight, I nine) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
        this.nine = nine;
    }


    /**
     * @return {@link Nonad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Nonad#two}.
     */
    public B two() {
        return two;
    }

    /**
     * @return {@link Nonad#three}.
     */
    public C three() {
        return three;
    }

    /**
     * @return {@link Nonad#four}.
     */
    public D four() {
        return four;
    }

    /**
     * @return {@link Nonad#five}.
     */
    public E five() {
        return five;
    }

    /**
     * @return {@link Nonad#six}.
     */
    public F six() {
        return six;
    }

    /**
     * @return {@link Nonad#seven}.
     */
    public G seven() {
        return seven;
    }

    /**
     * @return {@link Nonad#eight}.
     */
    public H eight() {
        return eight;
    }

    /**
     * @return {@link Nonad#nine}.
     */
    public I nine() {
        return nine;
    }


    /**
     * @return {@link List} containing the elements of this {@link Nonad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two, three, four, five, six, seven, eight, nine);
    }

    /**
     * @return A {@link Nonad} consisting of the results of applying the given functions to the elements of this {@link Nonad}.
     */
    public <AA, BB, CC, DD, EE, FF, GG, HH, II> Nonad<AA, BB, CC, DD, EE, FF, GG, HH, II> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper, Function<? super C, ? extends CC> threeMapper, Function<? super D, ? extends DD> fourMapper, Function<? super E, ? extends EE> fiveMapper, Function<? super F, ? extends FF> sixMapper, Function<? super G, ? extends GG> sevenMapper, Function<? super H, ? extends HH> eightMapper, Function<? super I, ? extends II> nineMapper) {
        return new Nonad<>(oneMapper.apply(one), twoMapper.apply(two), threeMapper.apply(three), fourMapper.apply(four), fiveMapper.apply(five), sixMapper.apply(six), sevenMapper.apply(seven), eightMapper.apply(eight), nineMapper.apply(nine));
    }

    /**
     * Performs the given actions to the elements of this {@link Nonad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer, Consumer<? super C> threeConsumer, Consumer<? super D> fourConsumer, Consumer<? super E> fiveConsumer, Consumer<? super F> sixConsumer, Consumer<? super G> sevenConsumer, Consumer<? super H> eightConsumer, Consumer<? super I> nineConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
        threeConsumer.accept(three);
        fourConsumer.accept(four);
        fiveConsumer.accept(five);
        sixConsumer.accept(six);
        sevenConsumer.accept(seven);
        eightConsumer.accept(eight);
        nineConsumer.accept(nine);
    }

    /**
     * Performs the given action for each element of this {@link Nonad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Nonad}.
     */
    public Stream<Object> stream() {
        return asList().stream();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }


        Nonad<?, ?, ?, ?, ?, ?, ?, ?, ?> nonad = (Nonad<?, ?, ?, ?, ?, ?, ?, ?, ?>)o;

        return (one == null ? nonad.one == null : one.equals(nonad.one)) && (two == null ? nonad.two == null : two.equals(nonad.two)) && (three == null ? nonad.three == null : three.equals(nonad.three)) && (four == null ? nonad.four == null : four.equals(nonad.four)) && (five == null ? nonad.five == null : five.equals(nonad.five)) && (six == null ? nonad.six == null : six.equals(nonad.six)) && (seven == null ? nonad.seven == null : seven.equals(nonad.seven)) && (eight == null ? nonad.eight == null : eight.equals(nonad.eight)) && (nine == null ? nonad.nine == null : nine.equals(nonad.nine));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (one == null ? 0 : one.hashCode());
        hash = 31 * hash + (two == null ? 0 : two.hashCode());
        hash = 31 * hash + (three == null ? 0 : three.hashCode());
        hash = 31 * hash + (four == null ? 0 : four.hashCode());
        hash = 31 * hash + (five == null ? 0 : five.hashCode());
        hash = 31 * hash + (six == null ? 0 : six.hashCode());
        hash = 31 * hash + (seven == null ? 0 : seven.hashCode());
        hash = 31 * hash + (eight == null ? 0 : eight.hashCode());
        hash = 31 * hash + (nine == null ? 0 : nine.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ", " + three + ", " + four + ", " + five + ", " + six + ", " + seven + ", " + eight + ", " + nine + ")";
    }
}
