import Validator.Validator;
class Utils {
    public static <T> int countIf(T[] tab, Validator<T> validator)
    {
        int counter = 0;
        for (T element : tab) {
            if (validator.validate(element)) {
                counter++;
            }
        }
        return counter;
    }
}