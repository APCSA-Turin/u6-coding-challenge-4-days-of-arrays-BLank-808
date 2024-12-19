
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String arr[][]= new String[2][names.length];
        int a=0;
        int b=0;
        for (int index = 0; index < names.length; index++) {
            int r =(int) (Math.random() *2);
            if (r==1){
            arr[1][a]=names[index];
            a++;
            } else{
            arr[0][b]=names[index];
            b++;
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j]+" ");
              System.out.println();
    }
    return arr; //you must return a two dimensional string array
}

    public static void main(String[] args) {

        String n[]={"bob", "mike", "jenny"};
        Day2.nameSort(n);
    }
}