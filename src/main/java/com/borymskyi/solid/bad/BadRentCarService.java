package com.borymskyi.solid.bad;

import com.borymskyi.solid.*;

/**
 * У данного класса есть несколько зон ответственности, что является нарушением
 * первого принципа Single responsibility.
 * Если заказчик получит новый тип транспорта, нап прийдется изменять код.
 * Если у нас появится новы вид отправки сообщения, нам прийдется изменять код.
 *
 * = необходимо разделить данный класс на несколько, тем самым следуя принципу единой ответственности.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BadRentCarService {
    private CarCompany carShop = new CarCompany();

//    public Car findCar(String carNo) {
//        return carShop.getCars().get(carNo);
//    }

//    public Order orderCar(String carNo, Client client) {
//        return new Order(1L, carShop.getCars().get(carNo), client);
//    }

//    public void printOrder(Order order) {
//        System.out.println("The company " + carShop.getNameCompany() + " create the order " +
//                "\n Order number: " + order.getNumberOrder() +
//                "\n Client: " + order.getClient().getFirstName() +
//                "\n Type Car: " + order.getCar().getCarType());
//    }

//    public void getCarInterestInfo(CarType carType) {
//        List<Car> cars = carShop.findCarsByType(carType);
//
//        System.out.println("The company have some a cars for your type request");
//        if (carType.equals(CarType.SEDAN)) {
//            System.out.println("In 2022, we received sedans mainly from Europe." +
//                    "\nHere is our list of possible purchases:");
//            cars.stream().forEach(System.out::println);
//        }
//        else if (carType.equals(CarType.VAN)) {
//            System.out.println("In 2022, we received vans mainly from America." +
//                    "\nHere is our list of possible purchases:");
//        }
//        else if (carType.equals(CarType.PICKUP)) {
//            System.out.println("In 2022, we received pickups mainly from China." +
//                    "\nHere is our list of possible purchases.");
//        }
//    }

//    public void sendMessage(String typeMessage, String message) {
//        if (typeMessage.equals("admin@gmail.com")) {
//            System.out.println("\n====");
//            System.out.println("\n Admin@gmain.com, you have new email");
//            System.out.println(message);
//            System.out.println("\n====");
//        }
//    }
}
