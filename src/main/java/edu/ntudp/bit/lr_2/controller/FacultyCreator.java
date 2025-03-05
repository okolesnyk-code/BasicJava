package edu.ntudp.bit.lr_2.controller;

import edu.ntudp.bit.lr_2.model.Faculty;
import edu.ntudp.bit.lr_2.model.Department;
import edu.ntudp.bit.lr_2.model.Human;
import edu.ntudp.bit.lr_2.model.Sex;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {
    private final DepartmentCreator departmentCreator = new DepartmentCreator();

    public Faculty create(String name, Human dean) {
        List<Department> departments = new ArrayList<>();

        // Створюємо голову кафедри (іншу людину)
        Human departmentHead = new Human("Валерій", "Корнієнко", "Іванович", Sex.MALE);

        departments.add(departmentCreator.create("Кафедра безпеки інформації та комунікації", departmentHead));

        return new Faculty(name, dean, departments);
    }
}

