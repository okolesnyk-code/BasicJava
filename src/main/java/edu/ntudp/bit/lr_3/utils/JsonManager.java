package edu.ntudp.bit.lr_3.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import edu.ntudp.bit.lr_3.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {

    private static final Gson gson = new Gson();

    // Метод для запису університету у файл у форматі JSON
    public static void writeUniversityToJsonFile(University university, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(university, writer);  // Перетворення університету в JSON та запис у файл
            System.out.println("Університет успішно записано у файл: " + fileName);
        } catch (IOException e) {
            System.err.println("Помилка при запису в файл: " + e.getMessage());
        }
    }

    // Метод для зчитування університету з файлу у форматі JSON
    public static University readUniversityFromJsonFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, University.class);  // Зчитуємо JSON і перетворюємо в об'єкт університету
        } catch (IOException | JsonSyntaxException e) {
            System.err.println("Помилка при зчитуванні з файлу: " + e.getMessage());
            return null;
        }
    }
}

