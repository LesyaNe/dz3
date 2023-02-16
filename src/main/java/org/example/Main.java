package org.example;
//1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int val = rnd.nextInt(-10, 10);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
//        int i = 0;
//        while (i < list1.size()) {
//            if (list1.get(i) % 2 == 0) {
//                list1.remove(i);
//            } else {
//                i++;
//            }
//        }
//        System.out.printf("Удалили четные числа %s", list1);
//    }
//}
//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка
        int max = max(list1);
        int min = min(list1);
        int sumItems = 0;
        for (int item : list1) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/list1.size();
        System.out.printf("Максимальный элемент %s\n", max);
        System.out.printf("Минимальный элемент %s\n", min);
//        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);


    }
}
