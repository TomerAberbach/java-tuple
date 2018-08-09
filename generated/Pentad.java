import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a five-tuple.
 */
public final class Pentad<A, B, C, D, E> {
    /**
     * Element at position one of this {@link Pentad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Pentad}.
     */
    private final B two;
    /**
     * Element at position three of this {@link Pentad}.
     */
    private final C three;
    /**
     * Element at position four of this {@link Pentad}.
     */
    private final D four;
    /**
     * Element at position five of this {@link Pentad}.
     */
    private final E five;


    /**
     * Sets all fields to null.
     */
    public Pentad() {
        this(null, null, null, null, null);
    }

    /**
     * @param one {@link Pentad#one}.
     */
    public Pentad(A one) {
        this(one, null, null, null, null);
    }

    /**
     * @param one {@link Pentad#one}.
     * @param two {@link Pentad#two}.
     */
    public Pentad(A one, B two) {
        this(one, two, null, null, null);
    }

    /**
     * @param one   {@link Pentad#one}.
     * @param two   {@link Pentad#two}.
     * @param three {@link Pentad#three}.
     */
    public Pentad(A one, B two, C three) {
        this(one, two, three, null, null);
    }

    /**
     * @param one   {@link Pentad#one}.
     * @param two   {@link Pentad#two}.
     * @param three {@link Pentad#three}.
     * @param four  {@link Pentad#four}.
     */
    public Pentad(A one, B two, C three, D four) {
        this(one, two, three, four, null);
    }

    /**
     * @param one   {@link Pentad#one}.
     * @param two   {@link Pentad#two}.
     * @param three {@link Pentad#three}.
     * @param four  {@link Pentad#four}.
     * @param five  {@link Pentad#five}.
     */
    public Pentad(A one, B two, C three, D four, E five) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }


    /**
     * @return {@link Pentad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Pentad#two}.
     */
    public B two() {
        return two;
    }

    /**
     * @return {@link Pentad#three}.
     */
    public C three() {
        return three;
    }

    /**
     * @return {@link Pentad#four}.
     */
    public D four() {
        return four;
    }

    /**
     * @return {@link Pentad#five}.
     */
    public E five() {
        return five;
    }


    /**
     * @return {@link List} containing the elements of this {@link Pentad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two, three, four, five);
    }

    /**
     * @return A {@link Pentad} consisting of the results of applying the given functions to the elements of this {@link Pentad}.
     */
    public <AA, BB, CC, DD, EE> Pentad<AA, BB, CC, DD, EE> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper, Function<? super C, ? extends CC> threeMapper, Function<? super D, ? extends DD> fourMapper, Function<? super E, ? extends EE> fiveMapper) {
        return new Pentad<>(oneMapper.apply(one), twoMapper.apply(two), threeMapper.apply(three), fourMapper.apply(four), fiveMapper.apply(five));
    }

    /**
     * Performs the given actions to the elements of this {@link Pentad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer, Consumer<? super C> threeConsumer, Consumer<? super D> fourConsumer, Consumer<? super E> fiveConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
        threeConsumer.accept(three);
        fourConsumer.accept(four);
        fiveConsumer.accept(five);
    }

    /**
     * Performs the given action for each element of this {@link Pentad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Pentad}.
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


        Pentad<?, ?, ?, ?, ?> pentad = (Pentad<?, ?, ?, ?, ?>)o;

        return (one == null ? pentad.one == null : one.equals(pentad.one)) && (two == null ? pentad.two == null : two.equals(pentad.two)) && (three == null ? pentad.three == null : three.equals(pentad.three)) && (four == null ? pentad.four == null : four.equals(pentad.four)) && (five == null ? pentad.five == null : five.equals(pentad.five));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (one == null ? 0 : one.hashCode());
        hash = 31 * hash + (two == null ? 0 : two.hashCode());
        hash = 31 * hash + (three == null ? 0 : three.hashCode());
        hash = 31 * hash + (four == null ? 0 : four.hashCode());
        hash = 31 * hash + (five == null ? 0 : five.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ", " + three + ", " + four + ", " + five + ")";
    }
}
