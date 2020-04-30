// Array plus array

/*
I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.

P.S. Each array includes only integer numbers. Output is a number too.
BUGS   FUNDAMENTALS   ARRAYS   NUMBERS   BASIC LANGUAGE FEATURES
 */
// package kyu_8;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 +=arr1[i];
            sum2 +=arr2[i];
        };
        return sum1 + sum2;
    }

}

// or

import java.util.stream.*;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

}

// or

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int arrSum = 0;
        for(int num : arr1) {arrSum += num;}
        for(int num : arr2) {arrSum += num;}
        return arrSum;
    }

}

// or

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
    }

}
