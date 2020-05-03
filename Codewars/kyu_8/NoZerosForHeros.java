// No zeros for heros

/*
Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450 -> 145
960000 -> 96
1050 -> 105
-1050 -> -105
Zero alone is fine, don't worry about it. Poor guy anyway
FUNDAMENTALS   NUMBERS
 */

//package kyu_8;

public class NoBoring {
    public static int noBoringZeros(int n) {
        if (n == 0) return n;
        while ( n % 10 == 0) {
            n /=10;
        }
        return n;
    }
}

// or

public class NoBoring {
    public static int noBoringZeros(int n) {
        return n == 0 ? 0 : Integer.parseInt(String.valueOf(n).replaceAll("0*$", ""));
    }
}
