package com.neewrobert.datastructure.search.binary;

import java.util.List;

public class BinarySearch {


    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T target) {

        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (list.get(mid).compareTo(target) == 0) {
                return mid;
            }

            if (list.get(mid).compareTo(target) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
