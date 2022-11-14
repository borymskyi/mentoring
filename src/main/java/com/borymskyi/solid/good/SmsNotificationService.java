package com.borymskyi.solid.good;

/**
 * Исправил ошибку по второму принципу, где модифицировал код, а нужно было расширять.
 * = создал Интерфейс + реализовал его.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class SmsNotificationService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("\n====");
        System.out.println("Your sms message: " + message);
        System.out.println("\n====");
    }
}
