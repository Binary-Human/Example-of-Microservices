package fr.insa.StudentsListService.model;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private float average;

    public Student(int studentID, String firstName, String lastName, float average) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.average = average;
    }

    public Student() {}

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
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
    public float getAverage() { return average; }
    public void setAverage(float average) { this.average = average; }

}
