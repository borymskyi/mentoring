package com.borymskyi.patterns.bihavioral.observer;

/**
 * Клиентский код
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("src/main/java/com/borymskyi/patterns/bihavioral/observer/file.txt"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("admin@gmil.com"));

        try {
            editor.openFile("src/main/java/com/borymskyi/patterns/bihavioral/observer/file.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
