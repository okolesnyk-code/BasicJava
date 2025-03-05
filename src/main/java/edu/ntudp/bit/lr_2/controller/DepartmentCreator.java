package edu.ntudp.bit.lr_2.controller;

import edu.ntudp.bit.lr_2.model.Department;
import edu.ntudp.bit.lr_2.model.Group;
import edu.ntudp.bit.lr_2.model.Human;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator {
    private final GroupCreator groupCreator = new GroupCreator();

    public Department create(String name, Human head) {
        List<Group> groups = new ArrayList<>();
        groups.add(groupCreator.create("Група 125-21-5"));

        return new Department(name, head, groups);
    }
}

