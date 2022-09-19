import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        StudentExt studentExt = (StudentExt) Class.forName("StudentExt")
                .getConstructor(String.class, String.class,String.class)
                .newInstance("John","Smith","IT");
        System.out.println(studentExt);




        Field nameField = studentExt.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(studentExt,  "Johnson");
        System.out.println(nameField);

        Field lastNameField = studentExt.getClass().getDeclaredField("lastName");
        lastNameField.setAccessible(true);
        lastNameField.set(studentExt,  "Spring");
        System.out.println(lastNameField);

        Field typeOfStudiesField = studentExt.getClass().getDeclaredField("typeOfStudies");
        typeOfStudiesField.setAccessible(true);
        typeOfStudiesField.set(studentExt, "Math");
        System.out.println(typeOfStudiesField);


        String name = (String) studentExt.getClass().getMethod("getName").invoke(studentExt);
        System.out.println(name);

        String lastName = (String) studentExt.getClass().getMethod("getLastName").invoke(studentExt);
        System.out.println(lastName);

        String typeOfStudies = (String) studentExt.getClass().getMethod("getTypeOfStudies").invoke(studentExt);
        System.out.println(typeOfStudies);

        int index = (Integer) studentExt.getClass().getMethod("getIndex").invoke(studentExt);
        System.out.println(index);


    }
}
