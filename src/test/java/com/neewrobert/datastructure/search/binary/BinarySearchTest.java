package com.neewrobert.datastructure.search.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;


public class BinarySearchTest {


    @Test
    public void binarySearchSuccessTest() {

        int size = 25_000;
        Integer target = new Random().nextInt(size - 1);

        Assertions.assertEquals(BinarySearch.binarySearch(generateSortedListOfIntegers(size), target), target);

    }


    private List<Integer> generateSortedListOfIntegers(int max) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        IntStream.range(0, max)
                .parallel()
                .forEach(list::add);
        return list.stream().sorted().toList();

    }
}
