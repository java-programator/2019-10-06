package pl.altkom.equals.i.hashcode;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(firstName, student.firstName) &&
                // (firstName == student.firstName ||
                // (firstName != null && firstName.equals(student.firstName))
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gpa);
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

    public static void main(String[] args) {
        Student s1 = new Student("Paweł", "Bogdan", 30);
        Student s2 = null;
        System.out.println(s1.equals(s2));
        System.out.println(s1);
    }
}
