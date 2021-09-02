package calculator;

@FunctionalInterface
public interface Subtraction<T> {
    T sub(T a, T b);
}
