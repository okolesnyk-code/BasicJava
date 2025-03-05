package edu.ntudp.bit.lr_3;

import edu.ntudp.bit.lr_3.controller.UniversityCreator;
import edu.ntudp.bit.lr_3.model.University;

public class Run {

    public static void main(String[] args) {
        // Створюємо університет
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity();

        // Виводимо інформацію про університет
        System.out.println(university);
    }
}
