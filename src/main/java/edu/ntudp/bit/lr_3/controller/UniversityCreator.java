package edu.ntudp.bit.lr_3.controller;

import edu.ntudp.bit.lr_3.model.*;

import java.util.List;
import java.util.ArrayList;

public class UniversityCreator {

    private final FacultyCreator facultyCreator = new FacultyCreator();

    public  University createUniversity() {
        List<Faculty> faculties = facultyCreator.createFaculties();

        // Створюємо університет і додаємо факультети
        return new University("Університет", faculties);
    }
}



