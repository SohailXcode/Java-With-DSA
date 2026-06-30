public class NQueens {

    static int N = 4;

    static boolean isSafe(int[][] board, int row, int col) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Upper Left Diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 1)
                return false;
        }

        // Upper Right Diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < N;
             i--, j++) {

            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    static boolean solve(int[][] board, int row) {

        if (row == N)
            return true;

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                // Make Choice
                board[row][col] = 1;

                // Explore
                if (solve(board, row + 1))
                    return true;

                // Undo Choice (Backtrack)
                board[row][col] = 0;
            }
        }

        return false;
    }

    static void printBoard(int[][] board) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = new int[N][N];

        if (solve(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No Solution Exists");
        }
    }
}