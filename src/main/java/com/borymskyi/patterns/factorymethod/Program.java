package com.borymskyi.patterns.factorymethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperBySpecialty("java");
        Developer developer = factory.createDeveloper();
        developer.writeSomeCode();
    }

    public static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactoryImpl();
        }
        else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactoryImpl();
        }
        else {
            throw new RuntimeException(specialty + " is not exist");
        }
    }
}
