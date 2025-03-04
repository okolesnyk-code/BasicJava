package edu.ntudp.bit.lr_2;

import edu.ntudp.bit.lr_2.controller.UniversityCreator;
import edu.ntudp.bit.lr_2.model.University;

public class Run {
    public static void main(String[] args) {
        // Створюємо університет
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.create("Національний технічний університет");

        // Виводимо структуру університету
        System.out.println(university);
    }
}
