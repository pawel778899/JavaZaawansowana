class Student{
private String name;
private String lastName;
private int index;
private String typeOfStudies;



    public Student() {
    }

    public Student(String name, String lastName, int index, String typeOfStudies) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
        this.typeOfStudies = typeOfStudies;
    }

    public Student(String name, String lastName, int index) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
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
    private void pawel(){
        System.out.println("pawel");
    }


}