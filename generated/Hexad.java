import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a six-tuple.
 */
public final class Hexad<A, B, C, D, E, F> {
    /**
     * Element at position one of this {@link Hexad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Hexad}.
     */
    private final B two;
    /**
     * Element at position three of this {@link Hexad}.
     */
    private final C three;
    /**
     * Element at position four of this {@link Hexad}.
     */
    private final D four;
    /**
     * Element at position five of this {@link Hexad}.
     */
    private final E five;
    /**
     * Element at position six of this {@link Hexad}.
     */
    private final F six;


    /**
     * Sets all fields to null.
     */
    public Hexad() {
        this(null, null, null, null, null, null);
    }

    /**
     * @param one {@link Hexad#one}.
     */
    public Hexad(A one) {
        this(one, null, null, null, null, null);
    }

    /**
     * @param one {@link Hexad#one}.
     * @param two {@link Hexad#two}.
     */
    public Hexad(A one, B two) {
        this(one, two, null, null, null, null);
    }

    /**
     * @param one   {@link Hexad#one}.
     * @param two   {@link Hexad#two}.
     * @param three {@link Hexad#three}.
     */
    public Hexad(A one, B two, C three) {
        this(one, two, three, null, null, null);
    }

    /**
     * @param one   {@link Hexad#one}.
     * @param two   {@link Hexad#two}.
     * @param three {@link Hexad#three}.
     * @param four  {@link Hexad#four}.
     */
    public Hexad(A one, B two, C three, D four) {
        this(one, two, three, four, null, null);
    }

    /**
     * @param one   {@link Hexad#one}.
     * @param two   {@link Hexad#two}.
     * @param three {@link Hexad#three}.
     * @param four  {@link Hexad#four}.
     * @param five  {@link Hexad#five}.
     */
    public Hexad(A one, B two, C three, D four, E five) {
        this(one, two, three, four, five, null);
    }

    /**
     * @param one   {@link Hexad#one}.
     * @param two   {@link Hexad#two}.
     * @param three {@link Hexad#three}.
     * @param four  {@link Hexad#four}.
     * @param five  {@link Hexad#five}.
     * @param six   {@link Hexad#six}.
     */
    public Hexad(A one, B two, C three, D four, E five, F six) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
    }


    /**
     * @return {@link Hexad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Hexad#two}.
     */
    public B two() {
        return two;
    }

    /**
     * @return {@link Hexad#three}.
     */
    public C three() {
        return three;
    }

    /**
     * @return {@link Hexad#four}.
     */
    public D four() {
        return four;
    }

    /**
     * @return {@link Hexad#five}.
     */
    public E five() {
        return five;
    }

    /**
     * @return {@link Hexad#six}.
     */
    public F six() {
        return six;
    }


    /**
     * @return {@link List} containing the elements of this {@link Hexad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two, three, four, five, six);
    }

    /**
     * @return A {@link Hexad} consisting of the results of applying the given functions to the elements of this {@link Hexad}.
     */
    public <AA, BB, CC, DD, EE, FF> Hexad<AA, BB, CC, DD, EE, FF> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper, Function<? super C, ? extends CC> threeMapper, Function<? super D, ? extends DD> fourMapper, Function<? super E, ? extends EE> fiveMapper, Function<? super F, ? extends FF> sixMapper) {
        return new Hexad<>(oneMapper.apply(one), twoMapper.apply(two), threeMapper.apply(three), fourMapper.apply(four), fiveMapper.apply(five), sixMapper.apply(six));
    }

    /**
     * Performs the given actions to the elements of this {@link Hexad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer, Consumer<? super C> threeConsumer, Consumer<? super D> fourConsumer, Consumer<? super E> fiveConsumer, Consumer<? super F> sixConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
        threeConsumer.accept(three);
        fourConsumer.accept(four);
        fiveConsumer.accept(five);
        sixConsumer.accept(six);
    }

    /**
     * Performs the given action for each element of this {@link Hexad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Hexad}.
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


        Hexad<?, ?, ?, ?, ?, ?> hexad = (Hexad<?, ?, ?, ?, ?, ?>)o;

        return (one == null ? hexad.one == null : one.equals(hexad.one)) && (two == null ? hexad.two == null : two.equals(hexad.two)) && (three == null ? hexad.three == null : three.equals(hexad.three)) && (four == null ? hexad.four == null : four.equals(hexad.four)) && (five == null ? hexad.five == null : five.equals(hexad.five)) && (six == null ? hexad.six == null : six.equals(hexad.six));
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
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ", " + three + ", " + four + ", " + five + ", " + six + ")";
    }
}
