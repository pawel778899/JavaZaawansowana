public class Main {

    public static void main(String[] args) {

        Person student = new Student("Pawel","Katowice","IT",3,5000f);
        Person staff = new Staff("Computer Programming", 1000);
        Staff staff1 = new Staff("Computer Programming", 1000);


        System.out.println(student);
        System.out.println(staff);
        System.out.println(staff1);

    }
}
