package io.codelex.codilityexercises;

class MinAbsSumOfTwo {
    int absoluteSumOfTwoElements(int[] elements) {
        int sum = -1;
        int i;
        int j;
        int currentElement1;
        int currentElement2;
        for (i = 0; i < elements.length; i++) {
            currentElement1 = elements[i];
            for (j = 0; j < elements.length; j++) {
                if (i <= j) {
                    currentElement2 = elements[j];
                    int currentSum = Math.abs(elements[i] + elements[j]);
                    if (sum <= currentSum) {
                        sum = currentSum;
                        System.out.println(sum);
                    } else {
                        System.out.println(currentSum);
                    }
                }
            }
        }
        return sum;
    }

}

