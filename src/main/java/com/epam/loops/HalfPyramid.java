package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int numbOfSpaces = cathetusLength - 1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = numbOfSpaces; j > 0; j--) {
                System.out.print(" ");
            }
            numbOfSpaces -= 1;
            for (int k = i; k > 0; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
