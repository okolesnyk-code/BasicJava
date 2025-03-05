package edu.ntudp.bit.lr_3.model;

import java.util.List;
import java.util.Objects;

public class Faculty {
    private String name;
    private List<Department> departments; // Список департаментів

    // Конструктор, який приймає ім'я факультету та список департаментів
    public Faculty(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tFaculty: ").append(name).append("\n");
        sb.append("\tDepartments:\n");

        for (Department department : departments) {
            sb.append(department.toString()).append("\n");
        }

        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) &&
                Objects.equals(departments, faculty.departments); // порівнюйте усі поля
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departments); // використовуйте всі поля для обчислення hashCode
    }


}


