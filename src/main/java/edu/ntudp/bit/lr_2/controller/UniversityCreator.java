package edu.ntudp.bit.lr_2.controller;

import edu.ntudp.bit.lr_2.model.University;
import edu.ntudp.bit.lr_2.model.Faculty;
import edu.ntudp.bit.lr_2.model.Human;
import edu.ntudp.bit.lr_2.model.Sex;

import java.util.List;
import java.util.ArrayList;

public class UniversityCreator {
    private final FacultyCreator facultyCreator = new FacultyCreator();

    public University create(String name) {
        // Створюємо ректора університету
        Human rector = new Human("Олександр", "Олександрович", "Азюковський", Sex.MALE);

        // Створюємо список факультетів
        List<Faculty> faculties = new ArrayList<>();
        Faculty faculty = facultyCreator.create("Факультет інформаційних технологій", rector);
        faculties.add(faculty);

        // Створюємо нового декана
        Human newDean = new Human("Удовик", "Ірина", "Михайлівна", Sex.FEMALE);

        // Змінюємо голову факультету
        faculty.setHead(newDean);

        return new University(name, rector, faculties);
    }
}

