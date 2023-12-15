package task2.service.impl;

import task2.models.Database;
import task2.models.Student;
import task2.service.StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManagementSystem implements StudentService {
    Database database = new Database();

    @Override
    public void adddStudent(Student student) {
        database.student.add(student);
        System.out.println("Successfully added student " + student.getName() + "!");
    }

    @Override
    public ArrayList<Student> displayStudents() {
        return database.student;
    }

    @Override
    public ArrayList<Student> sortByName() {
        database.student.sort(Student.studentComparator);
        return database.student;
    }

    @Override
    public ArrayList<Student> sortByGradestoUp() {
        database.student.sort(Student.compareWithGrade);
        return database.student;
    }

    @Override
    public ArrayList<Student> sortByGradestoLow() {
        Collections.sort(database.student);
        ArrayList<Student> students = new ArrayList<>();
        for (int i = database.student.size()-1; i >= 0; i--) {
            students.add(database.student.get(i));
        }
        return students;
    }
}
