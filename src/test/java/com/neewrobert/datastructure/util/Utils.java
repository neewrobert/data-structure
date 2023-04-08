package com.neewrobert.datastructure.util;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;


public class Utils {

    public static List<Integer> generateListOfIntegers(int max) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        IntStream.range(0, max)
                .parallel()
                .forEach(list::add);
        return list;
    }
}
