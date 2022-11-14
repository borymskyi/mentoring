package com.borymskyi.solid.good;

/**
 * Single Responsibility: Теперь каждый класс несет ответственность только за одну зону и есть только одна причина для его изменения.
 *
 * Open Closed: Ошибка, допустим нам необходимо кроме отправки на мыло еще отправка по смс. И мы дописываем функционал
 * в уже существующий код... Это ошибка, нарушает 2 принцип Открыт для расширения, закрыт для изменения.
 * Нужно = Сделать интерфейс + реализовывать его с необходимыми методами.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BadNotificationService {
//    public void sendMessage(String typeMessage, String message) {
//        if (typeMessage.equals("email")) {
//            System.out.println("\n====");
//            System.out.println("\n Admin@gmain.com, you have new email");
//            System.out.println(message);
//            System.out.println("\n====");
//        }
//        else if (typeMessage.equals("sms")) {
//            System.out.println("\n====");
//            System.out.println(message);
//            System.out.println("\n====");
//        }
//    }
}
