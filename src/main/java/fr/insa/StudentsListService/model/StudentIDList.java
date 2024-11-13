package fr.insa.StudentsListService.model;

import java.util.ArrayList;
import java.util.List;

public class StudentIDList {
    List<Integer> studentIDList;

    public StudentIDList() {
        this.studentIDList = new ArrayList<Integer>();
    }
    public List<Integer> getStudentIDList() {
        return studentIDList;
    }
    public void addStudentToList(Integer studentId) {
        this.studentIDList.add(studentId);
    }
}
