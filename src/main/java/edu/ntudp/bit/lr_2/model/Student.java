package edu.ntudp.bit.lr_2.model;

public class Student extends Human {
    private String id;

    public Student(String firstName, String lastName, String middleName, Sex sex, String id) {
        super(firstName, lastName, middleName, sex);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id;
    }

}
