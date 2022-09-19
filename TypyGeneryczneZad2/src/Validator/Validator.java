package Validator;

public interface Validator<T> {
    boolean validate(T value);
}
