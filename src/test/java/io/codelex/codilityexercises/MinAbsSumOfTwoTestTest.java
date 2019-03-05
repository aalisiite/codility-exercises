package io.codelex.codilityexercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class MinAbsSumOfTwoTestTest {

    private MinAbsSumOfTwo minAbsSumOfTwo = new MinAbsSumOfTwo();

    @Test
    public void should_return_smallest_absolute_value() {
        //when
        int sum = minAbsSumOfTwo.absoluteSumOfTwoElements(new int[]{1, 4, -3});
        //then
        Assertions.assertEquals(1, sum);
    }

}