package com.nubari.sorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sort(){
        var a = new Comparable[]{5, 7, 2, 11, 23, -1, 0, 1, 16};
        Sort selectionSort = new SelectionSort();

        selectionSort.sort(a);
        assertEquals(-1, a[0]);
        assertEquals(0, a[1]);
        assertEquals(1, a[2]);
        assertEquals(23, a[a.length - 1]);
        assertEquals(16, a[a.length - 2]);
        System.out.println(Arrays.toString(a));

    }

}