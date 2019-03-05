package io.codelex.codilityexercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void should_check_if_function_returns_unpaired_element() {
        //when
        int unpairedElement = oddOccurrencesInArray.findUnpairedElement(new int[]{1, 3, 5, 1, 5});
        //then
        Assertions.assertEquals(3, unpairedElement);
    }
}