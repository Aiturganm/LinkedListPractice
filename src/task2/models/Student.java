package task2.models;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private String group;
    private double grade;

    public static Comparator<Student> studentComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };
    public static Comparator<Student> compareWithGrade = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.compareTo(o2);
        }
    };
    public Student() {
    }
    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.grade-o.grade);
    }
}
