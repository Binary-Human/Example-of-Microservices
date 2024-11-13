package fr.insa.StudentsListService.controller;

import fr.insa.StudentsListService.model.Evaluation;
import fr.insa.StudentsListService.model.Student;
import fr.insa.StudentsListService.model.StudentIDList;
import fr.insa.StudentsListService.model.StudentInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentListResource {

    @GetMapping("ids/{specialityId}")
    public StudentIDList getIdStudents(@PathVariable("specialityId") String specialityId) {
        StudentIDList studentIDList = new StudentIDList();
        studentIDList.addStudentToList(0);
        studentIDList.addStudentToList(1);
        studentIDList.addStudentToList(2);
        studentIDList.addStudentToList(3);
        return studentIDList;
    }

    @GetMapping("all/{specialtyId}")
    public List<Student> getAllStudents(@PathVariable("specialtyId") String specialityId) {
        // Simulate DB
        StudentIDList students = new StudentIDList();
        students.addStudentToList(0);
        students.addStudentToList(1);
        students.addStudentToList(2);
        students.addStudentToList(3);

        RestTemplate restTemplate = new RestTemplate();
        int i = 0;
        List<Student> listStudents = new ArrayList<Student>();

        for (int studentId : students.getStudentIDList()) {
            StudentInfo studentInfo = restTemplate.getForObject("http://localhost:8081/student/" + studentId , StudentInfo.class);
            Evaluation evaluation = restTemplate.getForObject("http://localhost:8082/evaluation/" + studentId , Evaluation.class);
            listStudents.add(new Student(studentId, studentInfo.getFirstName(), studentInfo.getLastName(), evaluation.getAverage()));
        }
        return listStudents;
    }
}
