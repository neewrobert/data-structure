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

        List<Integer> searchable = generateListOfIntegers(size).stream().sorted().toList();
        Assertions.assertEquals(BinarySearch.binarySearch(searchable, searchable.get(target)), target);
    }

    @Test
    public void binarySearchFailedForUnorderedListTest() {

        int size = 25_000;
        int target = new Random().nextInt(size - 1);

        List<Integer> searchable = generateListOfIntegers(size);
        Assertions.assertEquals(BinarySearch.binarySearch(searchable, searchable.get(target)), -1);
    }

    private List<Integer> generateListOfIntegers(int max) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        IntStream.range(0, max)
                .parallel()
                .forEach(list::add);
        return list.stream().toList();
    }
}
