import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a ten-tuple.
 */
public final class Decad<A, B, C, D, E, F, G, H, I, J> {
    /**
     * Element at position one of this {@link Decad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Decad}.
     */
    private final B two;
    /**
     * Element at position three of this {@link Decad}.
     */
    private final C three;
    /**
     * Element at position four of this {@link Decad}.
     */
    private final D four;
    /**
     * Element at position five of this {@link Decad}.
     */
    private final E five;
    /**
     * Element at position six of this {@link Decad}.
     */
    private final F six;
    /**
     * Element at position seven of this {@link Decad}.
     */
    private final G seven;
    /**
     * Element at position eight of this {@link Decad}.
     */
    private final H eight;
    /**
     * Element at position nine of this {@link Decad}.
     */
    private final I nine;
    /**
     * Element at position ten of this {@link Decad}.
     */
    private final J ten;


    /**
     * Sets all fields to null.
     */
    public Decad() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    /**
     * @param one {@link Decad#one}.
     */
    public Decad(A one) {
        this(one, null, null, null, null, null, null, null, null, null);
    }

    /**
     * @param one {@link Decad#one}.
     * @param two {@link Decad#two}.
     */
    public Decad(A one, B two) {
        this(one, two, null, null, null, null, null, null, null, null);
    }

    /**
     * @param one   {@link Decad#one}.
     * @param two   {@link Decad#two}.
     * @param three {@link Decad#three}.
     */
    public Decad(A one, B two, C three) {
        this(one, two, three, null, null, null, null, null, null, null);
    }

    /**
     * @param one   {@link Decad#one}.
     * @param two   {@link Decad#two}.
     * @param three {@link Decad#three}.
     * @param four  {@link Decad#four}.
     */
    public Decad(A one, B two, C three, D four) {
        this(one, two, three, four, null, null, null, null, null, null);
    }

    /**
     * @param one   {@link Decad#one}.
     * @param two   {@link Decad#two}.
     * @param three {@link Decad#three}.
     * @param four  {@link Decad#four}.
     * @param five  {@link Decad#five}.
     */
    public Decad(A one, B two, C three, D four, E five) {
        this(one, two, three, four, five, null, null, null, null, null);
    }

    /**
     * @param one   {@link Decad#one}.
     * @param two   {@link Decad#two}.
     * @param three {@link Decad#three}.
     * @param four  {@link Decad#four}.
     * @param five  {@link Decad#five}.
     * @param six   {@link Decad#six}.
     */
    public Decad(A one, B two, C three, D four, E five, F six) {
        this(one, two, three, four, five, six, null, null, null, null);
    }

    /**
     * @param one   {@link Decad#one}.
     * @param two   {@link Decad#two}.
     * @param three {@link Decad#three}.
     * @param four  {@link Decad#four}.
     * @param five  {@link Decad#five}.
     * @param six   {@link Decad#six}.
     * @param seven {@link Decad#seven}.
     */
    public Decad(A one, B two, C three, D four, E five, F six, G seven) {
        this(one, two, three, four, five, six, seven, null, null, null);
    }

    /**
     * @param one   {@link Decad#one}.
     * @param two   {@link Decad#two}.
     * @param three {@link Decad#three}.
     * @param four  {@link Decad#four}.
     * @param five  {@link Decad#five}.
     * @param six   {@link Decad#six}.
     * @param seven {@link Decad#seven}.
     * @param eight {@link Decad#eight}.
     */
    public Decad(A one, B two, C three, D four, E five, F six, G seven, H eight) {
        this(one, two, three, four, five, six, seven, eight, null, null);
    }

    /**
     * @param one   {@link Decad#one}.
     * @param two   {@link Decad#two}.
     * @param three {@link Decad#three}.
     * @param four  {@link Decad#four}.
     * @param five  {@link Decad#five}.
     * @param six   {@link Decad#six}.
     * @param seven {@link Decad#seven}.
     * @param eight {@link Decad#eight}.
     * @param nine  {@link Decad#nine}.
     */
    public Decad(A one, B two, C three, D four, E five, F six, G seven, H eight, I nine) {
        this(one, two, three, four, five, six, seven, eight, nine, null);
    }

    /**
     * @param one   {@link Decad#one}.
     * @param two   {@link Decad#two}.
     * @param three {@link Decad#three}.
     * @param four  {@link Decad#four}.
     * @param five  {@link Decad#five}.
     * @param six   {@link Decad#six}.
     * @param seven {@link Decad#seven}.
     * @param eight {@link Decad#eight}.
     * @param nine  {@link Decad#nine}.
     * @param ten   {@link Decad#ten}.
     */
    public Decad(A one, B two, C three, D four, E five, F six, G seven, H eight, I nine, J ten) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
        this.nine = nine;
        this.ten = ten;
    }


    /**
     * @return {@link Decad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Decad#two}.
     */
    public B two() {
        return two;
    }

    /**
     * @return {@link Decad#three}.
     */
    public C three() {
        return three;
    }

    /**
     * @return {@link Decad#four}.
     */
    public D four() {
        return four;
    }

    /**
     * @return {@link Decad#five}.
     */
    public E five() {
        return five;
    }

    /**
     * @return {@link Decad#six}.
     */
    public F six() {
        return six;
    }

    /**
     * @return {@link Decad#seven}.
     */
    public G seven() {
        return seven;
    }

    /**
     * @return {@link Decad#eight}.
     */
    public H eight() {
        return eight;
    }

    /**
     * @return {@link Decad#nine}.
     */
    public I nine() {
        return nine;
    }

    /**
     * @return {@link Decad#ten}.
     */
    public J ten() {
        return ten;
    }


    /**
     * @return {@link List} containing the elements of this {@link Decad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two, three, four, five, six, seven, eight, nine, ten);
    }

    /**
     * @return A {@link Decad} consisting of the results of applying the given functions to the elements of this {@link Decad}.
     */
    public <AA, BB, CC, DD, EE, FF, GG, HH, II, JJ> Decad<AA, BB, CC, DD, EE, FF, GG, HH, II, JJ> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper, Function<? super C, ? extends CC> threeMapper, Function<? super D, ? extends DD> fourMapper, Function<? super E, ? extends EE> fiveMapper, Function<? super F, ? extends FF> sixMapper, Function<? super G, ? extends GG> sevenMapper, Function<? super H, ? extends HH> eightMapper, Function<? super I, ? extends II> nineMapper, Function<? super J, ? extends JJ> tenMapper) {
        return new Decad<>(oneMapper.apply(one), twoMapper.apply(two), threeMapper.apply(three), fourMapper.apply(four), fiveMapper.apply(five), sixMapper.apply(six), sevenMapper.apply(seven), eightMapper.apply(eight), nineMapper.apply(nine), tenMapper.apply(ten));
    }

    /**
     * Performs the given actions to the elements of this {@link Decad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer, Consumer<? super C> threeConsumer, Consumer<? super D> fourConsumer, Consumer<? super E> fiveConsumer, Consumer<? super F> sixConsumer, Consumer<? super G> sevenConsumer, Consumer<? super H> eightConsumer, Consumer<? super I> nineConsumer, Consumer<? super J> tenConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
        threeConsumer.accept(three);
        fourConsumer.accept(four);
        fiveConsumer.accept(five);
        sixConsumer.accept(six);
        sevenConsumer.accept(seven);
        eightConsumer.accept(eight);
        nineConsumer.accept(nine);
        tenConsumer.accept(ten);
    }

    /**
     * Performs the given action for each element of this {@link Decad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Decad}.
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


        Decad<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> decad = (Decad<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)o;

        return (one == null ? decad.one == null : one.equals(decad.one)) && (two == null ? decad.two == null : two.equals(decad.two)) && (three == null ? decad.three == null : three.equals(decad.three)) && (four == null ? decad.four == null : four.equals(decad.four)) && (five == null ? decad.five == null : five.equals(decad.five)) && (six == null ? decad.six == null : six.equals(decad.six)) && (seven == null ? decad.seven == null : seven.equals(decad.seven)) && (eight == null ? decad.eight == null : eight.equals(decad.eight)) && (nine == null ? decad.nine == null : nine.equals(decad.nine)) && (ten == null ? decad.ten == null : ten.equals(decad.ten));
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
        hash = 31 * hash + (ten == null ? 0 : ten.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ", " + three + ", " + four + ", " + five + ", " + six + ", " + seven + ", " + eight + ", " + nine + ", " + ten + ")";
    }
}
