package io.codelex.codilityexercises;

import java.util.Arrays;
import java.util.List;

class OddOccurrencesInArray {

    int findUnpairedElement(int[] arr) {
        int size = arr.length;
        int i;
        int j;

        if (size == 0) {
            return 0;
        }

        if (size % 2 == 0) {
            return 0;
        }

        int currentElement;
        int currentElement2;

        for (i = 0; i < size; i++) {
            currentElement = arr[i];
            for (j = 0; j < size; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        //System.out.println("i= " + i + ". j = " + j);
                        currentElement2 = arr[j];
                        System.out.println(arr[i]);
                    }
                }
            }
        }
       // System.out.println(arr[i]);
        return arr[i];

    }
}
