package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i = 0; i < cathetusLength; i++){
            for(int j = 0; j<cathetusLength-1-i;j++){
                System.out.print(" ");
            }
            int k = i+1;
            while(k>0){
                System.out.print("*");
                k--;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
