public class Main {
    public static void main(String[] args) throws CannotDivideByθException {

        MathUtils.divide(10, 0);
    }
}
class CannotDivideByθException extends Exception {
    public CannotDivideByθException() {
    super("Can't divide by 0!");
}
}
class MathUtils {
    public static float divide(int a, int b) throws CannotDivideByθException {
        if (b == 0) {
            throw new CannotDivideByθException();
        }
        return a / b;
    }
}