public class Matrix {

    private int    rowsNum;
    private int    colsNum;
    private int[][]  matrixData;


    public Matrix( int row, int col )
    {
        rowsNum = row;
        colsNum = col;
        if(row <= 0)
            rowsNum = 3;
        if(col <= 0)
            colsNum = 3;
        matrixData = new int[rowsNum][colsNum];    }


    public Matrix( int[][] table)
    {

        rowsNum = table.length;
        colsNum = table[0].length;//length of first row gives number of columns
        matrixData = new int[rowsNum][colsNum]; //  2D array memory allocation
        for (int i=0; i<rowsNum; i++)
            for(int j=0; j<colsNum; j++) //fills loop with array values
                matrixData[i][j] = table[i][j];

    }


    public boolean setElement(int  x, int i, int j)
    {
        if (i<rowsNum && i>=0 && j<colsNum && j>=0)
        {
            matrixData[i][j] = x;
            return true;
        }
        else
            return false;
    }



    public int getElement(int i, int j) throws IndexOutOfBoundsException
    {


        if  ( (i < rowsNum && i>=0) && (j < colsNum && j>=0)) {
            return this.matrixData[i][j];
        }
        else {
            throw new IndexOutOfBoundsException("Invalid indexes");
        }

    }

    public Matrix copy()
    {

        return new Matrix(matrixData);
    }


    public static Matrix Transpose(Matrix m1)
    {
        Matrix temp = new Matrix(m1.colsNum,m1.rowsNum);
        for (int i = 0; i < m1.rowsNum; i++)
            for (int j = 0; j < m1.colsNum; j++)
            {
                temp.matrixData[j][i] = m1.matrixData[i][j];
            }
        return temp;
    }

    public void subtractMatrix(Matrix m) throws ArithmeticException
    {
        if (m.rowsNum==rowsNum && m.colsNum==colsNum) {
            for (int i = 0; i < rowsNum; i++) {
                for (int j = 0; j < colsNum; j++) {
                    matrixData[i][j] -= m.matrixData[i][j];
                }
            }
        }
        else
        {
            throw new ArithmeticException("dimensions isn't equal");
        }
    }
    public void mulValue(int value)
    {
        for (int i = 0; i < rowsNum; i++)
        {
            for (int j = 0; j < colsNum; j++)
            {
                matrixData[i][j] = value * matrixData[i][j];
            }
        }
    }
    public void addMatrix( Matrix m ) throws ArithmeticException
    {
        if ( m.rowsNum == rowsNum && m.colsNum == colsNum)
        {
            for(int i =0;i<rowsNum;i++)
            {
                for(int j=0;j<colsNum;j++)
                    matrixData[i][j] += m.matrixData[i][j];
            }


        }
        else {
            throw new ArithmeticException("Invalid operation");
        }

    }
    public Matrix multiplyMatrix( Matrix m ) throws ArithmeticException
    {
        Matrix mul = new Matrix(rowsNum,m.colsNum);
        if (colsNum == m.rowsNum)
        {
            for(int i =0;i<rowsNum;i++)
            {
                for(int j=0;j<colsNum;j++)
                    for(int k=0;k<colsNum;k++)
                    {
                        mul.matrixData[i][j]+=matrixData[i][k]*m.matrixData[k][j];
                    }
            }
            return mul;
        }
        else {
            throw new ArithmeticException("Invalid operation");
        }

    }
    public String toString(  )
    {
        String output = new String(); // empty string created
        for(int i = 0; i < rowsNum; i++){
            for(int j = 0; j < colsNum; j++){
                output += matrixData[i][j] + "  ";
            }
            output += "\n";
        }
        return output;

    }

    public int[][] getmatrixData()
    {
        return this.matrixData;
    }

    public int getcolsNum()
    {
        return this.colsNum;
    }

    public int getrowsNum()
    {
        return this.rowsNum;
    }
}