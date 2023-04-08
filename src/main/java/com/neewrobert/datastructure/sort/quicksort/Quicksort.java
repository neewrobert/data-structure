package com.neewrobert.datastructure.sort.quicksort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quicksort {

    public static List<Integer> sortIntegers(List<Integer> toOrder) {

        if(toOrder == null) return Collections.emptyList();
        if(toOrder.size() <= 1){
            return toOrder;
        }

        int pivotIndex = toOrder.size() / 2;
        Integer pivotValue = toOrder.get(pivotIndex);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < toOrder.size(); i++) {
            if (i == pivotIndex) {
                continue;
            }

            int currentValue = toOrder.get(i);

            if(currentValue < pivotValue){
                left.add(currentValue);
            }else {
                right.add(currentValue);
            }
        }

        List<Integer> sortedLeft = sortIntegers(left);
        List<Integer> sortedRight = sortIntegers(right);
        sortedLeft.add(pivotValue);
        sortedLeft.addAll(sortedRight);

        return sortedLeft;
    }
}
