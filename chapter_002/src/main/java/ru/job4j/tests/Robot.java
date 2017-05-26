package ru.job4j.tests;

/**
 * Created by pro on 20.05.2017.
 */
public class Robot {
    /**
     * Counter of moves.
     */
    private int numOfMoves = 0;

    /**
     * Method to count moves.
     * @param x - length of matrix
     * @param y - width of matrix
     * @param maze - matrix
     * @return num of moves
     */
    public int moveToEnd(int x, int y, int[][] maze) {
        if (!(x == maze.length - 1 && y == maze.length - 1)) {
            if (x == maze.length - 1 && maze[x][y + 1] == 0) {
                moveToEnd(x, y + 1, maze);
            } else if (y == maze.length - 1 && maze[x + 1][y] == 0) {
                moveToEnd(x + 1, y, maze);
            } else if (maze[x + 1][y] == 0 && maze[x][y + 1] == 0) {
                if (moveToEnd(x + 1, y, maze) < moveToEnd(x, y + 1, maze)) {
                    numOfMoves = numOfMoves - 2 * moveToEnd(x, y + 1, maze);
                    moveToEnd(x + 1, y, maze);
                } else {
                    numOfMoves = numOfMoves - 2 * moveToEnd(x + 1, y, maze);
                    moveToEnd(x, y + 1, maze);
                }
            } else if (maze[x + 1][y] == 0) {
                moveToEnd(x + 1, y, maze);
            } else if (maze[x][y + 1] == 0) {
                moveToEnd(x, y + 1, maze);
            }
            numOfMoves += 1;
        }
        return numOfMoves;
    }
}
