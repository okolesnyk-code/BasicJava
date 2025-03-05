package edu.ntudp.bit.lr_3.model;


import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private List<Group> groups;  // Замість Human ми використовуємо список груп

    public Department(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\tDepartment: ").append(name).append("\n");
        sb.append("\t\tGroups:\n");

        for (Group group : groups) {
            sb.append(group.toString()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department department = (Department) o;
        return Objects.equals(name, department.name) &&
                Objects.equals(groups, department.groups); // порівнюйте усі поля
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, groups); // використовуйте всі поля для обчислення hashCode
    }




}

