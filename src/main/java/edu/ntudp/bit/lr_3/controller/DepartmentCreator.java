package edu.ntudp.bit.lr_3.controller;

import edu.ntudp.bit.lr_3.model.*;

import java.util.List;
import java.util.ArrayList;

public class DepartmentCreator {

    private final GroupCreator groupCreator = new GroupCreator();

    public List<Department> createDepartments() {
        List<Department> departments = new ArrayList<>();

        // Створюємо всі 8 груп
        List<Group> allGroups = groupCreator.createUniversityGroups();

        // Створюємо департаменти, додаючи по 2 групи до кожного
        for (int i = 0; i < 4; i++) {
            List<Group> groups = new ArrayList<>();

            // Додаємо 2 групи для кожного департаменту
            groups.add(allGroups.get(i * 2));  // Перша група
            groups.add(allGroups.get(i * 2 + 1));  // Друга група

            // Створюємо департамент і додаємо його до списку департаментів
            Department department = new Department("Department " + (i + 1), groups);
            departments.add(department);
        }

        return departments;
    }
}



