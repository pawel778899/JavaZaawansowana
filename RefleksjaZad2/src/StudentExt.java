public class StudentExt {

    private String name;
    private String lastName;
    private int index;
    private String typeOfStudies;

    public StudentExt(String name, String lastName, int index, String typeOfStudies) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
        this.typeOfStudies = typeOfStudies;
    }

    public StudentExt(String name, String lastName, String typeOfStudies) {
        this.name = name;
        this.lastName = lastName;
        this.typeOfStudies = typeOfStudies;
    }

    public StudentExt(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public StudentExt() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    @Override
    public String toString() {
        return "StudentExt{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", index=" + index +
                ", typeOfStudies='" + typeOfStudies + '\'' +
                '}';
    }
}
