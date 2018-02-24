import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a two-tuple.
 */
public final class Dyad<A, B> {
    /**
     * Element at position one of this {@link Dyad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Dyad}.
     */
    private final B two;


    /**
     * Sets all fields to null.
     */
    public Dyad() {
        this(null, null);
    }

    /**
     * @param one {@link Dyad#one}.
     */
    public Dyad(A one) {
        this(one, null);
    }

    /**
     * @param one {@link Dyad#one}.
     * @param two {@link Dyad#two}.
     */
    public Dyad(A one, B two) {
        this.one = one;
        this.two = two;
    }


    /**
     * @return {@link Dyad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Dyad#two}.
     */
    public B two() {
        return two;
    }


    /**
     * @return {@link List} containing the elements of this {@link Dyad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two);
    }

    /**
     * @return A {@link Dyad} consisting of the results of applying the given functions to the elements of this {@link Dyad}.
     */
    public <AA, BB> Dyad<AA, BB> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper) {
        return new Dyad<>(oneMapper.apply(one), twoMapper.apply(two));
    }

    /**
     * Performs the given actions to the elements of this {@link Dyad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
    }

    /**
     * Performs the given action for each element of this {@link Dyad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Dyad}.
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


        Dyad<?, ?> dyad = (Dyad<?, ?>)o;

        return (one == null ? dyad.one == null : one.equals(dyad.one)) && (two == null ? dyad.two == null : two.equals(dyad.two));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (one == null ? 0 : one.hashCode());
        hash = 31 * hash + (two == null ? 0 : two.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ")";
    }
}
