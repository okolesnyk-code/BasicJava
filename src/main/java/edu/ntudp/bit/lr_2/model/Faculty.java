package edu.ntudp.bit.lr_2.model;

import java.util.List;

public class Faculty {
    private String name;  // Назва факультету
    private Human head;   // Декан
    private List<Department> departments; // Список кафедр

    public Faculty(String name, Human head, List<Department> departments) {
        this.name = name;
        this.head = head;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human newHead) {  // Додав метод для зміни голови факультету
        this.head = newHead;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  Faculty: ").append(name).append("\n");
        sb.append("  Head: ").append(head).append("\n");
        sb.append("  Departments: \n");

        for (Department department : departments) {
            sb.append(department.toString().replace("\n", "\n    "));
        }

        return sb.toString();
    }
}

