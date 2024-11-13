package fr.insa.StudentsListService.model;

public class StudentInfo {
    private int id;
    private String birthDate;
    private String firstName;
    private String lastName;

    public StudentInfo(int id, String birthDate, String firstName, String lastName) {
        this.id = id;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public StudentInfo() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
