package edu.ntudp.bit.lr_3.model;

import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private Student head;  // Голова групи
    private List<Student> students;

    public Group(String name, Student head) {
        this.name = name;
        this.head = head;
    }

    public void addStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student getHead() {
        return head;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t\tGroup: ").append(name).append("\n");
        sb.append("\t\t\tHead: ").append(head).append("\n");
        sb.append("\t\t\tStudents:\n");

        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }

        return sb.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) &&
                Objects.equals(students, group.students); // порівнюйте усі поля
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students); // використовуйте всі поля для обчислення hashCode
    }


}
