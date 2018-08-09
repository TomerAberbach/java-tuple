import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class representing a four-tuple.
 */
public final class Tetrad<A, B, C, D> {
    /**
     * Element at position one of this {@link Tetrad}.
     */
    private final A one;
    /**
     * Element at position two of this {@link Tetrad}.
     */
    private final B two;
    /**
     * Element at position three of this {@link Tetrad}.
     */
    private final C three;
    /**
     * Element at position four of this {@link Tetrad}.
     */
    private final D four;


    /**
     * Sets all fields to null.
     */
    public Tetrad() {
        this(null, null, null, null);
    }

    /**
     * @param one {@link Tetrad#one}.
     */
    public Tetrad(A one) {
        this(one, null, null, null);
    }

    /**
     * @param one {@link Tetrad#one}.
     * @param two {@link Tetrad#two}.
     */
    public Tetrad(A one, B two) {
        this(one, two, null, null);
    }

    /**
     * @param one   {@link Tetrad#one}.
     * @param two   {@link Tetrad#two}.
     * @param three {@link Tetrad#three}.
     */
    public Tetrad(A one, B two, C three) {
        this(one, two, three, null);
    }

    /**
     * @param one   {@link Tetrad#one}.
     * @param two   {@link Tetrad#two}.
     * @param three {@link Tetrad#three}.
     * @param four  {@link Tetrad#four}.
     */
    public Tetrad(A one, B two, C three, D four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }


    /**
     * @return {@link Tetrad#one}.
     */
    public A one() {
        return one;
    }

    /**
     * @return {@link Tetrad#two}.
     */
    public B two() {
        return two;
    }

    /**
     * @return {@link Tetrad#three}.
     */
    public C three() {
        return three;
    }

    /**
     * @return {@link Tetrad#four}.
     */
    public D four() {
        return four;
    }


    /**
     * @return {@link List} containing the elements of this {@link Tetrad}.
     */
    public List<Object> asList() {
        return Arrays.asList(one, two, three, four);
    }

    /**
     * @return A {@link Tetrad} consisting of the results of applying the given functions to the elements of this {@link Tetrad}.
     */
    public <AA, BB, CC, DD> Tetrad<AA, BB, CC, DD> map(Function<? super A, ? extends AA> oneMapper, Function<? super B, ? extends BB> twoMapper, Function<? super C, ? extends CC> threeMapper, Function<? super D, ? extends DD> fourMapper) {
        return new Tetrad<>(oneMapper.apply(one), twoMapper.apply(two), threeMapper.apply(three), fourMapper.apply(four));
    }

    /**
     * Performs the given actions to the elements of this {@link Tetrad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super A> oneConsumer, Consumer<? super B> twoConsumer, Consumer<? super C> threeConsumer, Consumer<? super D> fourConsumer) {
        oneConsumer.accept(one);
        twoConsumer.accept(two);
        threeConsumer.accept(three);
        fourConsumer.accept(four);
    }

    /**
     * Performs the given action for each element of this {@link Tetrad} until all elements have been processed or the action throws an exception.
     */
    public void forEach(Consumer<? super Object> consumer) {
        asList().forEach(consumer);
    }

    /**
     * @return {@link Stream} containing the elements of this {@link Tetrad}.
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


        Tetrad<?, ?, ?, ?> tetrad = (Tetrad<?, ?, ?, ?>)o;

        return (one == null ? tetrad.one == null : one.equals(tetrad.one)) && (two == null ? tetrad.two == null : two.equals(tetrad.two)) && (three == null ? tetrad.three == null : three.equals(tetrad.three)) && (four == null ? tetrad.four == null : four.equals(tetrad.four));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (one == null ? 0 : one.hashCode());
        hash = 31 * hash + (two == null ? 0 : two.hashCode());
        hash = 31 * hash + (three == null ? 0 : three.hashCode());
        hash = 31 * hash + (four == null ? 0 : four.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "(" + one + ", " + two + ", " + three + ", " + four + ")";
    }
}
