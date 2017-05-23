package ru.job4j.tests;

/**
 * Created by pro on 20.05.2017.
 */
public class Robot {

    private int numOfMoves = 0;

    public int moveToEnd(int x, int y, int[][] maze) {
        if (!(x == maze.length - 1 && y == maze.length - 1) && numOfMoves != -1) {
            if (x == maze.length - 1 && maze[x][y + 1] == 0) {
                numOfMoves++;
                moveToEnd(x, y + 1, maze);
            } else if (y == maze.length - 1 && maze[x + 1][y] == 0) {
                numOfMoves++;
                moveToEnd(x + 1, y, maze);
            } else if (maze[x + 1][y] == 0 && maze[x][y + 1] == 0){
                if (moveToEnd(x + 1, y, maze) < moveToEnd(x, y + 1, maze) && moveToEnd(x + 1, y, maze) != -1){
                    numOfMoves += moveToEnd(x + 1, y, maze);
                } else {
                    numOfMoves += moveToEnd(x, y + 1, maze);
                }
            } else if (maze[x + 1][y] == 0) {
                numOfMoves++;
                moveToEnd(x + 1, y, maze);
            } else if (maze[x][y + 1] == 0) {
                numOfMoves++;
                moveToEnd(x, y + 1, maze);
            } else {
                numOfMoves = -1;
            }
        }
        return numOfMoves;
    }
}
