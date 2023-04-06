package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++){
            int k = 0;
            while(k < cathetusLength -i){
                System.out.print(" ");
                k++;
            }
            for(int j = 0;j <= i -1; j++){
                if(i == 1){
                    System.out.println(i-j);
                }else
                    System.out.print(i-j);
            }
            for(int j = 1;j <= i -1; j++){
                if(j == i-1){
                    System.out.println(j+1);
                } else
                    System.out.print(j+1);
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
