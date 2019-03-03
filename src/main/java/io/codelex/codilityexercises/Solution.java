package io.codelex.codilityexercises;

class Solution {

    int findSymmetryPoint(String s) {

        String newS = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");

        if (newS.length() == 0) {
            return -1;
        }
        if (newS.length() == 1) {
            return 0;
        }

        int i = 0;
        int j = 0;
        for (i = 0, j = newS.length() - 1; i < j; i++, j--) {
            char c = newS.charAt(i);
            char x = newS.charAt(j);
            if (c != x) {
                return i;
            }
        }
        return i;
    }
}
