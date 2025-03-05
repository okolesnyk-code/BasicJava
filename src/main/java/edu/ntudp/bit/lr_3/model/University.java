package edu.ntudp.bit.lr_3.model;
import java.util.Objects;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;  // Список факультетів

    // Конструктор, який приймає ім'я університету та список факультетів
    public University(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("University: ").append(name).append("\n");
        sb.append("Faculties:\n");

        for (Faculty faculty : faculties) {
            sb.append(faculty.toString()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculties);
    }



}

