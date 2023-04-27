package com.oocode;

public class RomanConverter {
    public static String convertToRoman(int i) {
        if (i < 10) {
            return convertSingleDigit(i);
        }

        return "X" + convertSingleDigit(i % 10);
    }

    private static String convertSingleDigit(int i) {
        switch (i % 5) {
            case 0: return i == 0 ? "" : "V";
            case 1:
            case 2:
            case 3:
                return convertSingleDigit(i - i%5) + "I".repeat(i%5);
            case 4: return "I" + convertToRoman(i+1);
        }
        return "";
    }
}
