package com.sunil.daily;

import java.util.LinkedList;
import java.util.Queue;

public class Array2DFlip {

    public static void main(String[] args) {
        int array[][] = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 1, 1}
        };
        System.out.println(""+new Array2DFlip().countFlip(array));
    }

    private int countFlip(int[][] array) {
        int totalFlip = 0;

        int height = array.length;
        if(height == 0){
            return 0;
        }
        int length = array[0].length;

        boolean[][] visited = new boolean[height][length];

        int row = 0, col = 0;
        Queue<RowCol> queue = new LinkedList<>();
        queue.add(new RowCol(row, col));
        while(!queue.isEmpty()){
            RowCol current = queue.remove();

            if (visited[current.row][current.col])
                continue;

            visited[current.row][current.col] = true;
            boolean flip = false;
            //left
            if (current.col - 1 >= 0) {
                if (array[current.row][current.col - 1] == 1)
                    flip = true;
                queue.add(new RowCol(current.row, current.col - 1));
            }

            //right
            if (current.col + 1 < height) {
                if (array[current.row][current.col + 1] == 1)
                    flip = true;
                queue.add(new RowCol(current.row, current.col + 1));
            }

            //Up
            if (current.row - 1 >= 0) {
                if (array[current.row - 1][current.col] == 1)
                    flip = true;
                queue.add(new RowCol(current.row - 1, current.col));
            }

            //Down
            if (current.row + 1 < length) {
                if (array[current.row + 1][current.col] == 1)
                    flip = true;
                queue.add(new RowCol(current.row + 1, current.col));
            }

            if (flip && array[current.row][current.col] == 0) {
                array[current.row][current.col] = 1;
                totalFlip++;
            }
        }
        return totalFlip;
    }


}
