package edu.ntudp.bit.lr_3.model;

public abstract class Human {
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected Sex sex;

    // Конструктор
    public Human(String firstName, String lastName, String middleName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }

    // Геттери
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Sex getSex() {
        return sex;
    }

    // toString метод для зручного виведення інформації про людину
    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", sex=" + sex +
                '}';
    }
}