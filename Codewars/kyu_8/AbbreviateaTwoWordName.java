// Abbreviate a Two Word Name

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

Patrick Feeney => P.F
FUNDAMENTALS   STRINGS   ARRAYS
 */

package kyu_8;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        name = name.toUpperCase();
        return  name.charAt(0) + "." + name.charAt(name.indexOf(' ')+1);
    }
}