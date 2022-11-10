package com.borymskyi.patterns.creational.adapter;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database{
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
