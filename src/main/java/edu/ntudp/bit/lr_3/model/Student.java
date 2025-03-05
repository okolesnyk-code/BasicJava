package edu.ntudp.bit.lr_3.model;

import java.util.Objects;

public class Student extends Human {
    private String studentID;

    public Student(String studentID, String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "\t\t\t\tStudent{" +
                "ID='" + studentID + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Middle Name='" + middleName + '\'' +
                ", Sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentID, student.studentID) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(middleName, student.middleName) &&
                sex == student.sex; // Порівнюємо всі поля
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, firstName, lastName, middleName, sex); // Використовуємо всі поля для обчислення hashCode
    }


}


