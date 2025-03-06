package edu.ntudp.bit.lr_4.controller;

import edu.ntudp.bit.lr_4.model.Student;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Calendar;

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService() {
        studentRepository = new StudentRepository();
    }

    // Фільтрація студентів за місяцем народження
    public List<Student> getStudentsByBirthMonth(int month) throws SQLException {
        List<Student> allStudents = studentRepository.getAllStudents();

        // Фільтрація студентів, що народилися в заданому місяці
        return allStudents.stream()
                .filter(student -> {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(student.getBirthDate());
                    return calendar.get(Calendar.MONTH) + 1 == month; // Місяці в Calendar починаються з 0
                })
                .collect(Collectors.toList());
    }

    // Фільтрація студентів за місяцем народження і виведення на екран
    public void printStudentsByBirthMonth(int month) throws SQLException {
        List<Student> studentsByMonth = getStudentsByBirthMonth(month);

        if (studentsByMonth.isEmpty()) {
            System.out.println("Немає студентів, народжених у цьому місяці.");
        } else {
            for (Student student : studentsByMonth) {
                System.out.println(student);  // Виводимо студента у форматі, визначеному в методі toString()
            }
        }
    }
}
