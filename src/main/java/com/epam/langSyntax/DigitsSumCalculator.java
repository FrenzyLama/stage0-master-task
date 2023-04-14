package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String numbers = String.valueOf(number);
        char[] charArray = numbers.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(sum);
    }

}
