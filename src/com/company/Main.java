package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.printf("add 1 + 3: %d\n", Calculator.add(1, 3));
        System.out.printf("subtract 1 - 3: %d\n", Calculator.subtract(1, 3));
        System.out.printf("multiply 2 * 7: %d\n", Calculator.multiply(2, 7));
        System.out.printf("divide 10.0 / 3.0: %f\n", Calculator.divide(10, 3));
        System.out.printf("square 4: %d\n", Calculator.square(4));

        char piSymbol = '\u03C0';

        System.out.printf("square root of 64: %f\n", MagicCalculator.squareRoot(64.0));
        System.out.printf("sine of %c: %f\n", piSymbol, MagicCalculator.sine(Math.PI));
        System.out.printf("cosine of %c: %f\n", piSymbol, MagicCalculator.cosine(Math.PI));
        System.out.printf("tangent of %c: %f\n", piSymbol, MagicCalculator.tangent(Math.PI));
        System.out.printf("factorial of 4: %d\n", MagicCalculator.factorial(4));

    }
}
