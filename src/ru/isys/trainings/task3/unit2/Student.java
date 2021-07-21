package ru.isys.trainings.task3.unit2;

import java.util.Objects;

public class Student {

    private Integer identificator;
    private String name;

    public Student(Integer identificator, String name, Double stipend) {
        this.identificator = identificator;
        this.name = name;
        this.stipend = stipend;
    }

    private Double stipend = null;

    public Integer getIdentificator() {
        return identificator;
    }

    public void setIdentificator(Integer identificator) {
        this.identificator = identificator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getStipend() {
        return stipend;
    }

    public void setStipend(Double stipend) {
        this.stipend = stipend;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Student student = (Student) object;

        return identificator.equals(student.identificator) &&
                name.equals(student.name) &&
                Objects.equals(stipend, student.stipend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificator);
    }

    @Override
    public String toString() {
        return "Student{" +
                "identificator=" + identificator +
                ", name='" + name + '\'' +
                ", stipend=" + stipend +
                '}';
    }
}
