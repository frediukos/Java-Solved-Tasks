//Reversed Strings

/*
Kata.solution("world") //returns "dlrow"
FUNDAMENTALS   STRINGS
 */

//package kyu_8;

public class Kata {

    public static String solution(String str) {

        return new StringBuilder(str).reverse().toString();
    }

}

// or

public class Kata {

    public static String solution(String str) {
        String out = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            out +=str.charAt(i);
        }
        return out;
    }

}
