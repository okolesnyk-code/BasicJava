package edu.ntudp.bit.lr_3.controller;

import edu.ntudp.bit.lr_3.model.Sex;
import edu.ntudp.bit.lr_3.model.Student;

public class StudentCreator {

    // Метод для створення студента
    public Student createStudent(String firstName, String lastName, String middleName, Sex sex, String studentID) {
        return new Student(studentID, firstName, lastName, middleName, sex);
    }
}

