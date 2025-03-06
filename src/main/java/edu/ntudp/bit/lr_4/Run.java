package edu.ntudp.bit.lr_4;

import edu.ntudp.bit.lr_4.controller.StudentService;

import java.sql.SQLException;

public class Run {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        try {
            // Вивести студентів, народжених у лютому (місяць 2)
            studentService.printStudentsByBirthMonth(2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
