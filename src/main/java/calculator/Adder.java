package calculator;

@FunctionalInterface
public interface Adder<T> {

    T add( T a, T b);
}
