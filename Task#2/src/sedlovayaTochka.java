public class sedlovayaTochka {
    public static void main(String[] args) {
        int ccolumns=3;
        int crows=3;
        int [][] matrix = new int[][]
        {
                {0, 8, 9},
                {4, 3, 6},
                {2 ,5, 3}
        };
        for (int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){

                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int k = 1; k < matrix[i].length; k++) {
                if (matrix[i][k] < min) {
                    min = matrix[i][k];
                }
            }

            int[] max = new int[]{-99, -99, -99, -99};
            int maxCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == min) {
                    if (max[j] != -99) {
                        maxCol = max[j];
                    }
                    else {
                        maxCol = matrix[i][j];
                        for (int l = 0; l < matrix.length; l++) {
                            if (maxCol < matrix[l][j]) {
                                maxCol = matrix[l][j];
                            }
                        }
                        max[j] = maxCol;
                    }
                    if (maxCol == min) {
                        System.out.println(min);
                    }
                }
            }
        }




    }
}
