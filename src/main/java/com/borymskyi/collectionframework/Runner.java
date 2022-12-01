package com.borymskyi.collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Положил две пары ключ-значение с одинаковым хеш-кодом в один бакет.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Dmytrii", "Borymskyi");
        Student st2 = new Student(550, "Iman", "Gadzhi");
        Map<Student, Double> hashMap = new HashMap<>();
        hashMap.put(st1, 5.20);
        hashMap.put(st2, 9.20);
        System.out.println(hashMap);

        for (Student s : hashMap.keySet()) {
            s.setId(20);
        }

        for (Map.Entry<Student, Double> entry : hashMap.entrySet()) {
            entry.getKey().setId(50);
        }

        System.out.println(hashMap);
    }
}

class Student implements Comparable {
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(id, firstName, lastName);
    return 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return id - ((Student)o).id;
    }
}
