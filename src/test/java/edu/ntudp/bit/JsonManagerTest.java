package edu.ntudp.bit;

import edu.ntudp.bit.lr_3.model.University;
import edu.ntudp.bit.lr_3.utils.JsonManager;
import edu.ntudp.bit.lr_3.controller.UniversityCreator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

public class JsonManagerTest {

    @Test
    public void testUniversityJsonSerialization() {
        // Створення об'єкта UniversityCreator
        UniversityCreator universityCreator = new UniversityCreator();

        // Створення університету через UniversityCreator
        University oldUniversity = universityCreator.createUniversity();

        // Запис університету у файл
        String fileName = "university.json";
        JsonManager.writeUniversityToJsonFile(oldUniversity, fileName);

        // Читання університету з файлу
        University newUniversity = JsonManager.readUniversityFromJsonFile(fileName);

        // Перевірка, чи університети однакові
        assertNotNull(newUniversity);
        assertEquals(oldUniversity, newUniversity);

        // Видалення тестового файлу після тесту
        new File(fileName).delete();
    }
}
