package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("ccc", "bbb", "aaa"));
        list.add(null);
        ListSort.sort(list);
        System.out.println(list);
    }
}