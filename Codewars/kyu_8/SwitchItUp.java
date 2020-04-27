// Switch it Up!

/*
When provided with a number between 0-9, return it in words.

Input :: 1

Output :: "One".

If your language supports it, try using a switch statement.
FUNDAMENTALS
 */

//package kyu_8;

public class Kata
{
    public static String switchItUp(int number)
    {
        String[] arr = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        return arr[number];
    }
}
