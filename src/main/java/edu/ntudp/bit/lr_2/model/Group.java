package edu.ntudp.bit.lr_2.model;

import java.util.stream.Collectors;

import java.util.List;

public class Group {
    private String name;
    private Human head;
    private List<Student> students;

    public Group(String name, Human head, List<Student> students) {
        this.name = name;
        this.head = head;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group: " + name + "\n" +
                "Head: " + head + "\n" +
                "Students:\n" + students.stream()
                .map(student -> "  " + student.toString().replace("\n", "\n  "))
                .collect(Collectors.joining("\n"));
    }





}
