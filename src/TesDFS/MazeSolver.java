package TesDFS;

import java.util.Stack;

public class MazeSolver {
    // Representasi maze: 0 = jalan, 1 = dinding, 2 = tujuan
    private static final int[][] maze = {
            {0, 1, 0, 0, 1},
            {0, 1, 0, 1, 2},
            {0, 0, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 1, 0}
    };

    // Arah gerakan: kanan, bawah, kiri, atas
    private static final int[][] directions = {
            {0, 1},  // kanan
            {1, 0},  // bawah
            {0, -1}, // kiri
            {-1, 0}  // atas
    };

    static class Position {
        int row, col;

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static boolean solveMaze(int startRow, int startCol) {
        Stack<Position> stack = new Stack<>();
        stack.push(new Position(startRow, startCol));

        while (!stack.isEmpty()) {
            Position current = stack.pop();
            int row = current.row;
            int col = current.col;

            // Jika sampai di tujuan (2), return true
            if (maze[row][col] == 2) {
                System.out.println("Maze solved!");
                return true;
            }

            // Tandai posisi sebagai dikunjungi (misalnya ubah menjadi -1)
            maze[row][col] = -1;

            // Periksa arah yang mungkin
            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (isValidMove(newRow, newCol)) {
                    stack.push(new Position(newRow, newCol));
                }
            }
        }

        // Jika tidak ada solusi
        System.out.println("No solution found.");
        return false;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && (maze[row][col] == 0 || maze[row][col] == 2);
    }

    public static void main(String[] args) {
        int startRow = 0, startCol = 0; // Mulai dari (0, 0)
        solveMaze(startRow, startCol);
    }
}
