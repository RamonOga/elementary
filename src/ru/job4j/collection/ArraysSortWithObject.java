package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
//Ваша задача отсортировать массив строк в убывающем порядке и вернуть его. Среди строк не null элементов
public class ArraysSortWithObject {
    public static String[] sort(String[] data) {
        Comparator<String> comp = (left, right) -> right.compareTo(left);
        Arrays.sort(data, comp);
       return data;
    }
}