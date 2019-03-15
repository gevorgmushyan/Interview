public class Problem2 {

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];

        for(int s = 1; s <= (n+1)/2; s++) {
            for(int i = s-1; i < n-(s-1); i++) {
                matrix[i][s-1] = s;
                matrix[i][n-s] = s;
                matrix[s-1][i] = s;
                matrix[n-s][i] = s;
            }
        }
        return matrix;
    }

    public static void printMatrix(int [][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMatrix(createMatrix(7));
    }
}
