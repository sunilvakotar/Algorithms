package com.sunil.daily;

import java.util.LinkedList;
import java.util.Queue;

/*
    BFS for 2D array
 */

class RowCol{
    int row;
    int col;

    public RowCol(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class BFSArray2d {

    public static void main(String[] args) {
        //1 2 4 3 5 7 6 8 9
        int array[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        new BFSArray2d().bfsTraversal(array);
        System.out.println();
        //1 2 5 3 6 9 4 7 10 13 8 11 14 12 15 16
        int [][] grid = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        new BFSArray2d().bfsTraversal(grid);
        //System.out.println(""+new BFSArray2d().bfsTraversal(array));
    }

    private void bfsTraversal(int[][] array) {
        String search = "";

        int height = array.length;
        if(height == 0){
            return;
        }
        int length = array[0].length;

        boolean[][] visited = new boolean[height][length];

        int row = 0, col = 0;
        Queue<RowCol> queue = new LinkedList<>();
        queue.add(new RowCol(row, col));
        while(!queue.isEmpty()){
            RowCol current = queue.remove();

            if(visited[current.row][current.col])
                continue;

            visited[current.row][current.col] = true;
            System.out.print(" "+array[current.row][current.col]);

            if (current.col - 1 >= 0 && !visited[current.row][current.col - 1])
                queue.add(new RowCol(current.row, current.col - 1));
            if (current.col + 1 < height && !visited[current.row][current.col + 1])
                queue.add(new RowCol(current.row, current.col + 1));
            if (current.row - 1 >= 0 && !visited[current.row - 1][current.col])
                queue.add(new RowCol(current.row - 1, current.col));
            if (current.row + 1 < length && !visited[current.row + 1][current.col])
                queue.add(new RowCol(current.row + 1, current.col));

        }
    }
}
