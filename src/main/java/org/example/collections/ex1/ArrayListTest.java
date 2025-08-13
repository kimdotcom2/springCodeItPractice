package org.example.collections.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println(list);
        list.remove(Integer.valueOf(20));

        for (Integer i : list) {
            System.out.println(i);
        }

    }

}
