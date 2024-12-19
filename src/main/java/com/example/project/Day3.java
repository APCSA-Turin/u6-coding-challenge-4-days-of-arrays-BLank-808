package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        int a= ((size/2)-1);
        int countDown = a+1;
        int g=0;
        int d=0;
        int spaceCount= 0;
        int turns;
        int starC=0;
        boolean mode=true;
        System.out.println(a-countDown);
       for (int index = 0; index < grid.length; index++) {
        g=0;
      if (countDown>1){
        while (d<a+1) {
            for (int x=0; x<(a-(countDown-1)) && g<grid.length && spaceCount<a; x++){
              grid[index][g]= " " ;
              g++;
              spaceCount++;
            }
            spaceCount=a-(countDown-1);
            if(g<grid.length && starC<3){
            grid[index][g]= "*";
            starC++;
            g++;
            }
            for (int x=0; x<(countDown) && g<grid.length && spaceCount<a; x++){
              grid[index][g]= " " ;
              g++;
              spaceCount++;
            }
            d++;
       }
       d=0;
       spaceCount=0;
       starC=0;
      } else if (countDown==1) {
        turns=Math.abs(a-(countDown-1));
        for (int x=0; x<turns&& g<grid.length; x++){
          grid[index][g]= " " ;
          g++;
        }
        for (int x=0; x<3;x++){
        grid[index][g]= "*";
        g++;
        }
        for (int x=0; x<turns && g<grid.length; x++){
          grid[index][g]= " " ;
          g++;
        }
      } else {
        for (int i = 0; i < grid[index].length; i++) {
          grid[index][i]="*";
          mode=false;
        }
      }
      if (mode){
       countDown--;
      } else {countDown++;}
      }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      for (int index = 0; index < snowflake.length; index++) {
        for (int g = 0; g < snowflake[index].length; g++) {
          System.out.print(snowflake[index][g]);
        }
        System.out.println();
      }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      String[][] n=Day3.generateSnowflake(13);
      Day3.printSnowflake(n);
    }
}
