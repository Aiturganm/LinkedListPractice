package task2;

import task2.models.Student;
import task2.service.StudentService;
import task2.service.impl.StudentManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem managementSystem = new StudentManagementSystem();
        System.out.println("Add student to ArrayList: ");
        managementSystem.adddStudent(new Student("Aliya", "Java", 95));
        managementSystem.adddStudent(new Student("Asel", "Js", 100));
        managementSystem.adddStudent(new Student("Nurjigit", "Java", 87));
        managementSystem.adddStudent(new Student("Beksultan", "Java", 92));
        managementSystem.adddStudent(new Student("Dastan", "Js", 79));
        managementSystem.adddStudent(new Student("Aigerim", "Java", 89));
        managementSystem.adddStudent(new Student("Cholpnay", "Js", 100));;
        System.out.println();
        System.out.println("Displaying all students: ");
        ArrayList<Student> students = managementSystem.displayStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSort by name: ");
        for (Student student : managementSystem.sortByName()) {
            System.out.println(student);
        }
        System.out.println("\nSort by grades to Low: ");
        for (Student student : managementSystem.sortByGradestoLow()) {
            System.out.println(student);
        }
        System.out.println("\nSort by grades to Up: ");
        for (Student student : managementSystem.sortByGradestoUp()) {
            System.out.println(student);
        }
    }
}
