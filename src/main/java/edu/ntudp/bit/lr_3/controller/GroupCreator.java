package edu.ntudp.bit.lr_3.controller;

import edu.ntudp.bit.lr_3.model.*;

import java.util.List;
import java.util.ArrayList;

public class GroupCreator {

    private final StudentCreator studentCreator = new StudentCreator();

    public List<Group> createUniversityGroups() {
        List<Group> groups = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        // Додаємо студентів
        students.add(studentCreator.createStudent("Валентин", "Баранік", "Янович", Sex.MALE, "S001"));
        students.add(studentCreator.createStudent("Назар", "Бережний", "Романович", Sex.MALE, "S002"));
        students.add(studentCreator.createStudent("Гліб", "Венцковський", "Олегович", Sex.MALE, "S003"));
        students.add(studentCreator.createStudent("Богдан", "Герега", "Віталійович", Sex.MALE, "S004"));
        students.add(studentCreator.createStudent("Роман", "Єрмілін", "Андрійович", Sex.MALE, "S005"));
        students.add(studentCreator.createStudent("Ярослав", "Захарченко", "Романович", Sex.MALE, "S006"));
        students.add(studentCreator.createStudent("Микита", "Зінкевич", "Вячеславович", Sex.MALE, "S007"));
        students.add(studentCreator.createStudent("Марія", "Іванькова", "Сергіївна", Sex.FEMALE, "S008"));
        students.add(studentCreator.createStudent("Михайло", "Козловський", "В’ячеславович", Sex.MALE, "S009"));
        students.add(studentCreator.createStudent("Олексій", "Колесник", "Олександрович", Sex.MALE, "S010"));
        students.add(studentCreator.createStudent("Олексій", "Корнєєв", "Юрійович", Sex.MALE, "S011"));
        students.add(studentCreator.createStudent("Олександр", "Куць", "Андрійович", Sex.MALE, "S012"));
        students.add(studentCreator.createStudent("Вадим", "Магдєєв", "Станіславович", Sex.MALE, "S013"));
        students.add(studentCreator.createStudent("Олександр", "Маслов", "Олександрович", Sex.MALE, "S014"));
        students.add(studentCreator.createStudent("Антон", "Рябошапка", "Сергійович", Sex.MALE, "S015"));
        students.add(studentCreator.createStudent("Ярослава", "Сисоєва", "Михайлівна", Sex.FEMALE, "S016"));

        // Розподіляємо студентів на 8 груп по 2 студенти в кожній
        int groupCount = 8;
        int studentsPerGroup = 2;

        for (int i = 0; i < groupCount; i++) {
            List<Student> groupStudents = new ArrayList<>();

            // Додаємо студентів у групу
            for (int j = 0; j < studentsPerGroup; j++) {
                groupStudents.add(students.get(i * studentsPerGroup + j));
            }

            // Створюємо групу та додаємо її в список груп
            Group group = new Group("Group " + (i + 1), groupStudents.get(0));  // перший студент може бути головою
            group.addStudents(groupStudents);
            groups.add(group);
        }

        return groups;
    }
}

