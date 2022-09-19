public class NumberBox<T extends Number> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NumberBox{" +
                "value=" + value +
                '}';
    }
}