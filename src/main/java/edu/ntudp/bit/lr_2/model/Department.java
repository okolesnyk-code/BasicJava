package edu.ntudp.bit.lr_2.model;

import java.util.List;

public class Department {
    private String name;  // Назва кафедри
    private Human head;   // Завідувач кафедри
    private List<Group> groups; // Список груп

    public Department(String name, Human head, List<Group> groups) {
        this.name = name;
        this.head = head;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void removeGroup(Group group) {
        groups.remove(group);
    }

    @Override
    public String toString() {
        return "    Department: " + name + "\n" +
                "    Head: " + head + "\n" +
                "    Groups: \n" + groups;
    }

}
