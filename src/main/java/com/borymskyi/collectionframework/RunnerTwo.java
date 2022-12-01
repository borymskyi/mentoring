package com.borymskyi.collectionframework;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1. Написать метод, который принимает целочисленный список и возвращает
 * целочисленный список только с нечетными значениями.
 *
 * 2. Написать метод countUnique, который принимает целочисленный
 * список в качестве параметра и возвращает количество уникальных
 * целых чисел в этом списке.
 * При получении пустого списка метод должен возвращать 0.
 *
 * 3. Написать метод isUnique, который принимает Map&lt;String, String&gt;
 * и возвращает true,
 * если каждому ключу соответствуют свое уникальне значение.
 * Например, в данном случае вернётся true:
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
 * Hal=Perkins}
 * А в данном false:
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,
 * Hal=Perkins}
 *
 * 4. Сделать HashSet из ключей HashMap. Одной строкой преобразовать HashSet в ArrayList и наоборот.
 * 5. Iterate over HashMap.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class RunnerTwo {

    public static boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();
    }

    public static List<Integer> removeEven(List<Integer> list) {
        List<Integer> nechetnie = list.stream()
                .filter(integer -> integer % 2 != 0)
                .toList();

        return nechetnie;
    }

    public static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 7, 3, -1, 2, 3, 7, 2 ,15, 15);
//        System.out.println(RunnerTwo.removeEven(list));
//        System.out.println(countUnique(list));
        Map<String, String> map = Map.of(
//                "Kendric", "Perkins",
                "Stuart", "Reges",
                "Jessica", "Miller",
//                "Bruce", "Reges",
                "Hal", "Perkins"
        );
        System.out.println(isUnique(map));

        Set<String> set = new HashSet<>(map.keySet());
        System.out.println(set);
    }
}
