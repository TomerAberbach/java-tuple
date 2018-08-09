import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a seven-tuple.
 */
public final class Heptad<A, B, C, D, E, F, G> {
    /**
     * Element at position one of this {@link Heptad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Heptad}.
     */
    private final B two;
    /**
     * Element at position three of this {@link Heptad}.
     */
    private final C three;
    /**
     * Element at position four of this {@link Heptad}.
     */
    private final D four;
    /**
     * Element at position five of this {@link Heptad}.
     */
    private final E five;
    /**
     * Element at position six of this {@link Heptad}.
     */
    private final F six;
    /**
     * Element at position seven of this {@link Heptad}.
     */
    private final G seven;


    /**
     * Sets all fields to null.
     */
    public Heptad() {
        this(null, null, null, null, null, null, null);
    }

    /**
     * @param one {@link Heptad#one}.
     */
    public Heptad(A one) {
        this(one, null, null, null, null, null, null);
    }

    /**
     * @param one {@link Heptad#one}.
     * @param two {@link Heptad#two}.
     */
    public Heptad(A one, B two) {
        this(one, two, null, null, null, null, null);
    }

    /**
     * @param one   {@link Heptad#one}.
     * @param two   {@link Heptad#two}.
     * @param three {@link Heptad#three}.
     */
    public Heptad(A one, B two, C three) {
        this(one, two, three, null, null, null, null);
    }

    /**
     * @param one   {@link Heptad#one}.
     * @param two   {@link Heptad#two}.
     * @param three {@link Heptad#three}.
     * @param four  {@link Heptad#four}.
     */
    public Heptad(A one, B two, C three, D four) {
        this(one, two, three, four, null, null, null);
    }

    /**
     * @param one   {@link Heptad#one}.
     * @param two   {@link Heptad#two}.
     * @param three {@link Heptad#three}.
     * @param four  {@link Heptad#four}.
     * @param five  {@link Heptad#five}.
     */
    public Heptad(A one, B two, C three, D four, E five) {
        this(one, two, three, four, five, null, null);
    }

    /**
     * @param one   {@link Heptad#one}.
     * @param two   {@link Heptad#two}.
     * @param three {@link Heptad#three}.
     * @param four  {@link Heptad#four}.
     * @param five  {@link Heptad#five}.
     * @param six   {@link Heptad#six}.
     */
    public Heptad(A one, B two, C three, D four, E five, F six) {
        this(one, two, three, four, five, six, null);
    }

    /**
     * @param one   {@link Heptad#one}.
     * @param two   {@link Heptad#two}.
     * @param three {@link Heptad#three}.
     * @param four  {@link Heptad#four}.
     * @param five  {@link Heptad#five}.
     * @param six   {@link Heptad#six}.
     * @param seven {@link Heptad#seven}.
     */
    public Heptad(A one, B two, C three, D four, E five, F six, G seven) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
    }


    /**
     * @return {@link Heptad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Heptad#two}.
     */
    public B two() {
        return two;
    }

    /**
     * @return {@link Heptad#three}.
     */
    public C three() {
        return three;
    }

    /**
     * @return {@link Heptad#four}.
     */
    public D four() {
        return four;
    }

    /**
     * @return {@link Heptad#five}.
     */
    public E five() {
        return five;
    }

    /**
     * @return {@link Heptad#six}.
     */
    public F six() {
        return six;
    }

    /**
     * @return {@link Heptad#seven}.
     */
    public G seven() {
        return seven;
    }


    /**
     * @return {@link List} containing the elements of this {@link Heptad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two, three, four, five, six, seven);
    }

    /**
     * @return A {@link Heptad} consisting of the results of applying the given functions to the elements of this {@link Heptad}.
     */
    public <AA, BB, CC, DD, EE, FF, GG> Heptad<AA, BB, CC, DD, EE, FF, GG> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper, Function<? super C, ? extends CC> threeMapper, Function<? super D, ? extends DD> fourMapper, Function<? super E, ? extends EE> fiveMapper, Function<? super F, ? extends FF> sixMapper, Function<? super G, ? extends GG> sevenMapper) {
        return new Heptad<>(oneMapper.apply(one), twoMapper.apply(two), threeMapper.apply(three), fourMapper.apply(four), fiveMapper.apply(five), sixMapper.apply(six), sevenMapper.apply(seven));
    }

    /**
     * Performs the given actions to the elements of this {@link Heptad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer, Consumer<? super C> threeConsumer, Consumer<? super D> fourConsumer, Consumer<? super E> fiveConsumer, Consumer<? super F> sixConsumer, Consumer<? super G> sevenConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
        threeConsumer.accept(three);
        fourConsumer.accept(four);
        fiveConsumer.accept(five);
        sixConsumer.accept(six);
        sevenConsumer.accept(seven);
    }

    /**
     * Performs the given action for each element of this {@link Heptad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Heptad}.
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


        Heptad<?, ?, ?, ?, ?, ?, ?> heptad = (Heptad<?, ?, ?, ?, ?, ?, ?>)o;

        return (one == null ? heptad.one == null : one.equals(heptad.one)) && (two == null ? heptad.two == null : two.equals(heptad.two)) && (three == null ? heptad.three == null : three.equals(heptad.three)) && (four == null ? heptad.four == null : four.equals(heptad.four)) && (five == null ? heptad.five == null : five.equals(heptad.five)) && (six == null ? heptad.six == null : six.equals(heptad.six)) && (seven == null ? heptad.seven == null : seven.equals(heptad.seven));
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
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ", " + three + ", " + four + ", " + five + ", " + six + ", " + seven + ")";
    }
}
