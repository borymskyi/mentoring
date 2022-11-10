package com.borymskyi.patterns.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory javaFactory = createDeveloperBySpecialty("c++");
        Developer javaDeveloper = javaFactory.huntNewDeveloper();
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
