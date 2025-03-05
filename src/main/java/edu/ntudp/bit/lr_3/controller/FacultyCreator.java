package edu.ntudp.bit.lr_3.controller;

import edu.ntudp.bit.lr_3.model.*;

import java.util.List;
import java.util.ArrayList;

public class FacultyCreator {

    private final DepartmentCreator departmentCreator = new DepartmentCreator();

    public List<Faculty> createFaculties() {
        List<Faculty> faculties = new ArrayList<>();

        // Створюємо всі департаменти
        List<Department> allDepartments = departmentCreator.createDepartments();

        // Створюємо факультети, додаючи по 2 департаменти до кожного
        for (int i = 0; i < 2; i++) {
            List<Department> departments = new ArrayList<>();

            // Додаємо 2 департаменти до факультету
            departments.add(allDepartments.get(i * 2));  // Перший департамент
            departments.add(allDepartments.get(i * 2 + 1));  // Другий департамент

            // Створюємо факультет та додаємо його в список факультетів
            Faculty faculty = new Faculty("Faculty " + (i + 1), departments);
            faculties.add(faculty);
        }

        return faculties;
    }
}

