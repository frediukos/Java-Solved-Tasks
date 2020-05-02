// altERnaTIng cAsE <=> ALTerNAtiNG CaSe

/*
altERnaTIng cAsE <=> ALTerNAtiNG CaSe

Define String.prototype.toAlternatingCase
(or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language;
see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes
lowercase. For example:

StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"
As usual, your function/method should be pure, i.e. it should not mutate the original string.
FUNDAMENTALS
 */

//package kyu_8;

public class StringUtils {

    public static String toAlternativeString(String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (c == Character.toLowerCase(c)) {
                out += Character.toUpperCase(c);
            } else {
                out += Character.toLowerCase(c);
            }
            System.out.println(out);
        }
        return out;
    }

}

// or

/*public class StringUtils {

    public static String toAlternativeString(String string) {
        String[] arr = string.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i].toLowerCase()) {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
        }

        return String.join("", arr);
    }
}

 */