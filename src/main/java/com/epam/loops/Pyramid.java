package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int numbOfSpaces = cathetusLength - 1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = numbOfSpaces; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }
            for (int n = 2; n <= i; n++) {
                System.out.print(n);
            }
            numbOfSpaces -= 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
