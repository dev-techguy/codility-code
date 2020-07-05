package com.company;

import java.util.Arrays;

public class Main {
    public int solution(int[] array) {
        Arrays.sort(array);
        int j, i = 1;
        for (j = 0; j < array.length; j++) {
            if (array[j] == i) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] A = {
                1, 3, 6, 4, 1, 2
        };
        System.out.println("The smallest positive missing integer is " + new Main().solution(A));
    }
}
