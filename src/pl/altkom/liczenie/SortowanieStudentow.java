package pl.altkom.liczenie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;

    public Student(String firstName, String lastName, int age, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return - this.lastName.compareTo(o.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        return student.getLastName().compareTo(t1.getLastName());
    }
}

public class SortowanieStudentow {
    public static void main(String[] args) {
        Student s1 = new Student("Paweł", "Bogdan", 30, 5.0);
        Student s2 = new Student("Adam", "Mickiewicz", 44, 3.0);
        Student s3 = new Student("Jan", "Kowalski", 50, 4.0);
        Student s4 = new Student("Anna", "Nowak", 25, 6.0);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        students.sort(new StudentComparator());

//        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
