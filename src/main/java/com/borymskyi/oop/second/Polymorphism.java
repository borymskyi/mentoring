package com.borymskyi.oop.second;

/**
 * Огромный проект, где используется часто метод printPersonName,
 * Задача: нужно вывести в админ панеле не просто имя пользователя, а выводить вместе с Mr.
 *
 * Результат: Лучше всего не править уже существующий код, и добавлять в getName "Mr.", а
 * унаследоватся от Person и переопределяем getName(применить полиморфизм).
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Polymorphism {
    public static void main(String[] args) {
        //print on admin page
        printPersonName(new MrPerson("Dmytrii"));

        //print on html page
        printPersonName(new Person("Dmytrii"));

        //print on html page
        printPersonName(new Person("Dmytrii"));
    }

    private static void printPersonName(Person person) {
        System.out.println(person.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
//        return "Mr. " + name;
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MrPerson extends Person {

    public MrPerson(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Mr. " + super.getName();
    }
}