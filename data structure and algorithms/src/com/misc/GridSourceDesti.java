package com.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridSourceDesti {
private static final char grid [][] = new char[][]{{'a','b','c'},{'d','e','f'},{'g','h','i'}};

    public static void main(String[] args) {
        printGrid(grid);
        int noOfWay = countWay(grid, 0, 0, 'i', 0, new HashMap<>(), new StringBuilder());
        System.out.print(noOfWay);

    }

    public static void printGrid(char[] [] grid){
        for(int i=0; i<grid.length; i++){
            for(int j =0; j< grid[0].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    public static int countWay(char [][] grid, int col, int row, char destination, int count, Map<Integer, StringBuilder> memo, StringBuilder string){
        if(Character.compare(grid [row][col], destination) ==0) {
            memo.put(count, string);
            System.out.println(memo);
            count+=1;
        }
        if(row+1 < grid.length) {
            string.append(grid[row][col]);
            return countWay(grid, col , row+1, destination, count,memo, string);
        }
        if(col+1 < grid[0].length) {
            string.append(grid[row][col]);
             return countWay(grid,col+1 , row, destination, count, memo, string);
        }
        return count;
    }
}
