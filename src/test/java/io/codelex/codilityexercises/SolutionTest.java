package io.codelex.codilityexercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void should_not_check_if_string_is_empty() {
        //when
        int symmetry = solution.findSymmetryPoint("");
        //then
        Assertions.assertEquals(-1, symmetry);
    }

    @Test
    public void should_check_if_both_substrings_are_empty() {
        //when 
        int symmetry = solution.findSymmetryPoint("x");
        //then
        Assertions.assertEquals(0, symmetry);
    }

    @Test
    public void should_return_index_on_valid_palindrome() {
        //when 
        int symmetry = solution.findSymmetryPoint("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!");
        //then
        Assertions.assertEquals(20, symmetry);
    }

}