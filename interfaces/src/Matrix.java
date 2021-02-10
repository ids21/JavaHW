public class Matrix implements IMath{
    public double[][]arr;
    public int rows;
    public int cols;

    public Matrix() {
        rows = 1;
        cols = 1;
        arr = new double[rows][cols];
    }

    public Matrix(int row, int column) throws Exception {
        if(row <= 0 || column <= 0) {
            throw new Exception("incorrect size");
        }
        rows = row;
        cols = column;
        arr = new double[rows][cols];
    }

    public Matrix(double [][] a) throws Exception {
        if (a == null)
            throw new Exception("array's empty");
        rows = a.length;
        cols = a[0].length;
        arr = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = a[i][j];
    }

    public void print() {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print("" + arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    @Override
    public IMath sum(IMath a) throws Exception {
        Matrix a1 = (Matrix)a;
        Matrix res = new Matrix(rows, cols);
        if (rows != a1.rows || cols != a1.cols)
            throw new Exception("size isn't equal");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                res.arr[i][j] = arr[i][j] + a1.arr[i][j];
            }
        }
        return res;
    }

    @Override
    public IMath sub(IMath a) throws Exception{
        Matrix a1 = (Matrix)a;
        if (rows != a1.rows || cols != a1.cols)
            throw new Exception("size isn't equal");
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                res.arr[i][j] =  arr[i][j] -  a1.arr[i][j];
            }
        }
        return res;
    }

    @Override
    public IMath mul(IMath a) throws Exception {
        Matrix a1 = (Matrix)a;
        if (cols != a1.rows)
            throw new Exception("error? check size");
        Matrix res = new Matrix(rows, a1.cols);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < a1.cols; j++)
            {
                for (int k = 0; k < cols; k++)
                {
                    res.arr[i][j] =  res.arr[i][j] + arr[i][k] * a1.arr[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public IMath mul(double k) throws Exception {
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                res.arr[i][j] = arr[i][j] * k;
            }
        }
        return res;
    }

    @Override
    public IMath div(double k) throws Exception {
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                res.arr[i][j] =  arr[i][j] / k;
            }
        }
        return res;
    }

}
