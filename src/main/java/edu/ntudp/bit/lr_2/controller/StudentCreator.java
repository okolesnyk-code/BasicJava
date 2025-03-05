package edu.ntudp.bit.lr_2.controller;

import edu.ntudp.bit.lr_2.model.Sex;
import edu.ntudp.bit.lr_2.model.Student;

public class StudentCreator {

    public Student create(String firstName, String lastName, String middleName, Sex sex, String id) {
        return new Student(firstName, lastName, middleName, sex, id);
    }
}

