package task2.service;

import task2.models.Student;

import java.util.ArrayList;

public interface StudentService {
    void adddStudent(Student student);
    ArrayList<Student> displayStudents();
    ArrayList<Student> sortByName();
    ArrayList<Student> sortByGradestoUp();
    ArrayList<Student> sortByGradestoLow();
}
