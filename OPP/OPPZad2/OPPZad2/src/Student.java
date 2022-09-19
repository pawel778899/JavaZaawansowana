public class Student extends Person{

    private String typeOfStudies;
    private int yearOfStudy;
    private float studiesPrice;

    public Student(String name, String address, String typeOfStudies, int yearOfStudy, float studiesPrice) {
        super(name, address);
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudy = yearOfStudy;
        this.studiesPrice = studiesPrice;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public float getStudiesPrice() {
        return studiesPrice;
    }

    public void setStudiesPrice(float studiesPrice) {
        this.studiesPrice = studiesPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudies='" + typeOfStudies + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", studiesPrice=" + studiesPrice +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
