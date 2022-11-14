package com.borymskyi.solid.good;

/**
 * Исправил ошибку по второму принципу, где модифицировал код, а нужно было расширять.
 *  * = создал Интерфейс + реализовал его.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class EmailNotitfactionService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("\n====");
        System.out.println("\n Admin@gmain.com, you have new email");
        System.out.println(message);
        System.out.println("\n====");
    }
}
