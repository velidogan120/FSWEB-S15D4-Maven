package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        String clean = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                clean += Character.toLowerCase(c);
            }
        }

        String reverse = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse += clean.charAt(i);
        }

        return clean.equals(reverse);
    }
    public static String convertDecimalToBinary(int number) {
        List<Integer> list = new ArrayList<>();
        while (number > 0) {
            list.add(number % 2);
            number /= 2;
        }
        Collections.reverse(list);
        StringBuilder result = new StringBuilder();

        for (int digit : list) {
            result.append(digit);
        }

        return result.toString();
    }
}