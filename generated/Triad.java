import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a three-tuple.
 */
public final class Triad<A, B, C> {
    /**
     * Element at position one of this {@link Triad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Triad}.
     */
    private final B two;
    /**
     * Element at position three of this {@link Triad}.
     */
    private final C three;


    /**
     * Sets all fields to null.
     */
    public Triad() {
        this(null, null, null);
    }

    /**
     * @param one {@link Triad#one}.
     */
    public Triad(A one) {
        this(one, null, null);
    }

    /**
     * @param one {@link Triad#one}.
     * @param two {@link Triad#two}.
     */
    public Triad(A one, B two) {
        this(one, two, null);
    }

    /**
     * @param one   {@link Triad#one}.
     * @param two   {@link Triad#two}.
     * @param three {@link Triad#three}.
     */
    public Triad(A one, B two, C three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }


    /**
     * @return {@link Triad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Triad#two}.
     */
    public B two() {
        return two;
    }

    /**
     * @return {@link Triad#three}.
     */
    public C three() {
        return three;
    }


    /**
     * @return {@link List} containing the elements of this {@link Triad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two, three);
    }

    /**
     * @return A {@link Triad} consisting of the results of applying the given functions to the elements of this {@link Triad}.
     */
    public <AA, BB, CC> Triad<AA, BB, CC> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper, Function<? super C, ? extends CC> threeMapper) {
        return new Triad<>(oneMapper.apply(one), twoMapper.apply(two), threeMapper.apply(three));
    }

    /**
     * Performs the given actions to the elements of this {@link Triad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer, Consumer<? super C> threeConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
        threeConsumer.accept(three);
    }

    /**
     * Performs the given action for each element of this {@link Triad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Triad}.
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


        Triad<?, ?, ?> triad = (Triad<?, ?, ?>)o;

        return (one == null ? triad.one == null : one.equals(triad.one)) && (two == null ? triad.two == null : two.equals(triad.two)) && (three == null ? triad.three == null : three.equals(triad.three));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (one == null ? 0 : one.hashCode());
        hash = 31 * hash + (two == null ? 0 : two.hashCode());
        hash = 31 * hash + (three == null ? 0 : three.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ", " + three + ")";
    }
}
