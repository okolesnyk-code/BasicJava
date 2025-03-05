package edu.ntudp.bit.lr_2.controller;

import edu.ntudp.bit.lr_2.model.Group;
import edu.ntudp.bit.lr_2.model.Sex;
import edu.ntudp.bit.lr_2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {
    private final StudentCreator studentCreator = new StudentCreator();

    public Group create(String groupName) {
        List<Student> students = new ArrayList<>();

        students.add(studentCreator.create("Валентин", "Баранік", "Янович", Sex.MALE, "S001"));
        students.add(studentCreator.create("Назар", "Бережний", "Романович", Sex.MALE, "S002"));
        students.add(studentCreator.create("Гліб", "Венцковський", "Олегович", Sex.MALE, "S003"));
        students.add(studentCreator.create("Богдан", "Герега", "Віталійович", Sex.MALE, "S004"));
        students.add(studentCreator.create("Роман", "Єрмілін", "Андрійович", Sex.MALE, "S005"));
        students.add(studentCreator.create("Ярослав", "Захарченко", "Романович", Sex.MALE, "S006"));
        students.add(studentCreator.create("Микита", "Зінкевич", "Вячеславович", Sex.MALE, "S007"));
        students.add(studentCreator.create("Марія", "Іванькова", "Сергіївна", Sex.FEMALE, "S008")); // Голова групи
        students.add(studentCreator.create("Михайло", "Козловський", "В’ячеславович", Sex.MALE, "S009"));
        students.add(studentCreator.create("Олексій", "Колесник", "Олександрович", Sex.MALE, "S010"));
        students.add(studentCreator.create("Олексій", "Корнєєв", "Юрійович", Sex.MALE, "S011"));
        students.add(studentCreator.create("Олександр", "Куць", "Андрійович", Sex.MALE, "S012"));
        students.add(studentCreator.create("Вадим", "Магдєєв", "Станіславович", Sex.MALE, "S013"));
        students.add(studentCreator.create("Олександр", "Маслов", "Олександрович", Sex.MALE, "S014"));
        students.add(studentCreator.create("Антон", "Рябошапка", "Сергійович", Sex.MALE, "S015"));
        students.add(studentCreator.create("Ярослава", "Сисоєва", "Михайлівна", Sex.FEMALE, "S016"));
        students.add(studentCreator.create("Микита", "Тутов", "Андрійович", Sex.MALE, "S017"));
        students.add(studentCreator.create("Андрій", "Шаповал", "Олександрович", Sex.MALE, "S018"));
        students.add(studentCreator.create("Ольга", "Яненко", "Володимирівна", Sex.FEMALE, "S019"));

        // Вибираємо голову (Марія Іванькова, яка в списку під індексом 7)
        Student head = students.get(7);

        return new Group(groupName, head, students);
    }
}
