package com.neewrobert.datastructure.search.binary;

import com.neewrobert.datastructure.util.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;


public class BinarySearchTest {

    @Test
    public void binarySearchSuccessTest() {
        int size = 25_000;
        Integer target = new Random().nextInt(size - 1);

        List<Integer> searchable = Utils.generateListOfIntegers(size).stream().sorted().toList();
        Assertions.assertEquals(BinarySearch.binarySearch(searchable, searchable.get(target)), target);
    }

    @Test
    public void binarySearchFailedForUnorderedListTest() {

        int size = 25_000;
        int target = new Random().nextInt(size - 1);

        List<Integer> searchable = Utils.generateListOfIntegers(size);
        Assertions.assertEquals(BinarySearch.binarySearch(searchable, searchable.get(target)), -1);
    }
}
