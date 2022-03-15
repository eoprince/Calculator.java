package com.company;

public class MagicCalculator {
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double sine(double num) {
        return Math.sin(num);
    }

    public static double cosine(double num) {
        return Math.cos(num);
    }

    public static double tangent(double num) {
        return Math.tan(num);
    }

    public static int factorial(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
