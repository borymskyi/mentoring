package com.borymskyi.oop.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class FirstRunner {
    public static void main(String[] args) {
//        Driver driver = new Driver(41, "Edward", "Borymskyi", "Tadeushevuch", true, 60);
//        Engine engine = new Engine(80, "Volkswagen");
//        Car car = new Lorry("volkswagen", "Lineup", 100, driver, engine, 200);
//        System.out.println(car);
//        car.start();
//        car.turnLeft();
//        car.turnRight();
//        car.stop();

//        int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i : arr1) {
//            System.out.print(" " + i);
//        }
//
//        int[] arr2 = new int[arr1.length];
//        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//        System.out.println();
//
//        for (int i : arr2) {
//            System.out.print(" " + i);
//        }

        Integer[] array = new Integer[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }

//        Integer[] list2 = Arrays.copyOf(list1, list1.length);
//        Arrays.stream(list2).forEach(i -> System.out.print(i + " "));
//
//        System.out.println();

        List<Integer> list3 = new ArrayList<>(Arrays.asList(Arrays.copyOf(array, array.length)));
        list3.stream().forEach(i -> System.out.print(i + " "));
    }
}
