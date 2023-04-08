package com.neewrobert.datastructure.sort.quicksort;

import com.neewrobert.datastructure.util.Utils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuicksortTest {

    @Test
    public void shouldReturnEmptyListForEmptyList() {
        assertTrue(Quicksort.sortIntegers(List.of()).isEmpty());
    }

    @Test
    public void shouldOrderAListWithSingleElement() {
        assertIterableEquals(List.of(1), Quicksort.sortIntegers(List.of(1)));
    }

    @Test
    public void shouldOrderAListWithTwoElements() {
        assertIterableEquals(List.of(1, 2), Quicksort.sortIntegers(List.of(2, 1)));
    }

    @Test
    public void shouldOrderAListWithZero() {
        assertIterableEquals(List.of(0, 3, 4, 5), Quicksort.sortIntegers(List.of(4, 3, 0, 5)));
    }

    @Test
    public void shouldReturnEmptyListForNullParameter() {
        assertTrue(Quicksort.sortIntegers(null).isEmpty());
    }

    @Test
    public void shouldOrderAListWithSizeOf10000() {
        List<Integer> toOrder = Utils.generateListOfIntegers(10_000);
        assertIterableEquals(toOrder.stream().sorted().toList(), Quicksort.sortIntegers(toOrder));
    }


}
