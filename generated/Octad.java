import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a eight-tuple.
 */
public final class Octad<A, B, C, D, E, F, G, H> {
    /**
     * Element at position one of this {@link Octad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Octad}.
     */
    private final B two;
    /**
     * Element at position three of this {@link Octad}.
     */
    private final C three;
    /**
     * Element at position four of this {@link Octad}.
     */
    private final D four;
    /**
     * Element at position five of this {@link Octad}.
     */
    private final E five;
    /**
     * Element at position six of this {@link Octad}.
     */
    private final F six;
    /**
     * Element at position seven of this {@link Octad}.
     */
    private final G seven;
    /**
     * Element at position eight of this {@link Octad}.
     */
    private final H eight;


    /**
     * Sets all fields to null.
     */
    public Octad() {
        this(null, null, null, null, null, null, null, null);
    }

    /**
     * @param one {@link Octad#one}.
     */
    public Octad(A one) {
        this(one, null, null, null, null, null, null, null);
    }

    /**
     * @param one {@link Octad#one}.
     * @param two {@link Octad#two}.
     */
    public Octad(A one, B two) {
        this(one, two, null, null, null, null, null, null);
    }

    /**
     * @param one   {@link Octad#one}.
     * @param two   {@link Octad#two}.
     * @param three {@link Octad#three}.
     */
    public Octad(A one, B two, C three) {
        this(one, two, three, null, null, null, null, null);
    }

    /**
     * @param one   {@link Octad#one}.
     * @param two   {@link Octad#two}.
     * @param three {@link Octad#three}.
     * @param four  {@link Octad#four}.
     */
    public Octad(A one, B two, C three, D four) {
        this(one, two, three, four, null, null, null, null);
    }

    /**
     * @param one   {@link Octad#one}.
     * @param two   {@link Octad#two}.
     * @param three {@link Octad#three}.
     * @param four  {@link Octad#four}.
     * @param five  {@link Octad#five}.
     */
    public Octad(A one, B two, C three, D four, E five) {
        this(one, two, three, four, five, null, null, null);
    }

    /**
     * @param one   {@link Octad#one}.
     * @param two   {@link Octad#two}.
     * @param three {@link Octad#three}.
     * @param four  {@link Octad#four}.
     * @param five  {@link Octad#five}.
     * @param six   {@link Octad#six}.
     */
    public Octad(A one, B two, C three, D four, E five, F six) {
        this(one, two, three, four, five, six, null, null);
    }

    /**
     * @param one   {@link Octad#one}.
     * @param two   {@link Octad#two}.
     * @param three {@link Octad#three}.
     * @param four  {@link Octad#four}.
     * @param five  {@link Octad#five}.
     * @param six   {@link Octad#six}.
     * @param seven {@link Octad#seven}.
     */
    public Octad(A one, B two, C three, D four, E five, F six, G seven) {
        this(one, two, three, four, five, six, seven, null);
    }

    /**
     * @param one   {@link Octad#one}.
     * @param two   {@link Octad#two}.
     * @param three {@link Octad#three}.
     * @param four  {@link Octad#four}.
     * @param five  {@link Octad#five}.
     * @param six   {@link Octad#six}.
     * @param seven {@link Octad#seven}.
     * @param eight {@link Octad#eight}.
     */
    public Octad(A one, B two, C three, D four, E five, F six, G seven, H eight) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
    }


    /**
     * @return {@link Octad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Octad#two}.
     */
    public B two() {
        return two;
    }

    /**
     * @return {@link Octad#three}.
     */
    public C three() {
        return three;
    }

    /**
     * @return {@link Octad#four}.
     */
    public D four() {
        return four;
    }

    /**
     * @return {@link Octad#five}.
     */
    public E five() {
        return five;
    }

    /**
     * @return {@link Octad#six}.
     */
    public F six() {
        return six;
    }

    /**
     * @return {@link Octad#seven}.
     */
    public G seven() {
        return seven;
    }

    /**
     * @return {@link Octad#eight}.
     */
    public H eight() {
        return eight;
    }


    /**
     * @return {@link List} containing the elements of this {@link Octad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two, three, four, five, six, seven, eight);
    }

    /**
     * @return A {@link Octad} consisting of the results of applying the given functions to the elements of this {@link Octad}.
     */
    public <AA, BB, CC, DD, EE, FF, GG, HH> Octad<AA, BB, CC, DD, EE, FF, GG, HH> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper, Function<? super C, ? extends CC> threeMapper, Function<? super D, ? extends DD> fourMapper, Function<? super E, ? extends EE> fiveMapper, Function<? super F, ? extends FF> sixMapper, Function<? super G, ? extends GG> sevenMapper, Function<? super H, ? extends HH> eightMapper) {
        return new Octad<>(oneMapper.apply(one), twoMapper.apply(two), threeMapper.apply(three), fourMapper.apply(four), fiveMapper.apply(five), sixMapper.apply(six), sevenMapper.apply(seven), eightMapper.apply(eight));
    }

    /**
     * Performs the given actions to the elements of this {@link Octad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer, Consumer<? super C> threeConsumer, Consumer<? super D> fourConsumer, Consumer<? super E> fiveConsumer, Consumer<? super F> sixConsumer, Consumer<? super G> sevenConsumer, Consumer<? super H> eightConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
        threeConsumer.accept(three);
        fourConsumer.accept(four);
        fiveConsumer.accept(five);
        sixConsumer.accept(six);
        sevenConsumer.accept(seven);
        eightConsumer.accept(eight);
    }

    /**
     * Performs the given action for each element of this {@link Octad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Octad}.
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


        Octad<?, ?, ?, ?, ?, ?, ?, ?> octad = (Octad<?, ?, ?, ?, ?, ?, ?, ?>)o;

        return (one == null ? octad.one == null : one.equals(octad.one)) && (two == null ? octad.two == null : two.equals(octad.two)) && (three == null ? octad.three == null : three.equals(octad.three)) && (four == null ? octad.four == null : four.equals(octad.four)) && (five == null ? octad.five == null : five.equals(octad.five)) && (six == null ? octad.six == null : six.equals(octad.six)) && (seven == null ? octad.seven == null : seven.equals(octad.seven)) && (eight == null ? octad.eight == null : eight.equals(octad.eight));
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
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ", " + three + ", " + four + ", " + five + ", " + six + ", " + seven + ", " + eight + ")";
    }
}
