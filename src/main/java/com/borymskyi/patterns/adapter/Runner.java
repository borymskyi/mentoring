package com.borymskyi.patterns.adapter;

/**
 * This is an implementation of the structure pattern: "Adapter"
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
