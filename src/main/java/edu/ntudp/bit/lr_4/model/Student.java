package edu.ntudp.bit.lr_4.model;

import java.sql.Date;

public class Student {

    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;
    private String studentCardNumber;

    // Конструктор
    public Student(int id, String lastName, String firstName, String middleName, Date birthDate, String studentCardNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.studentCardNumber = studentCardNumber;
    }

    // Геттери та сеттери
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(String studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    // Переоприділений метод toString для зручного виведення інформації про студента
    @Override
    public String toString() {
        return "Student {\n" +
                "  id = " + id + ",\n" +
                "  lastName = '" + lastName + "',\n" +
                "  firstName = '" + firstName + "',\n" +
                "  middleName = '" + middleName + "',\n" +
                "  birthDate = " + birthDate + ",\n" +
                "  studentCardNumber = '" + studentCardNumber + "'\n" +
                "}";
    }
}
