public class squareMatrix extends Matrix {

    public squareMatrix(int row) {
        super(row, row);
    }
    public squareMatrix(int[][] table){
        super(table);
    }
    @Override
    public String toString()
    {
        String output = new String(); // empty string created
        for(int i = 0; i < getrowsNum(); i++){
            for(int j = 0; j < getcolsNum(); j++){
                output += getmatrixData()[i][j] + "  ";
            }
            output += "\n";
        }
        return output;

    }
    public squareMatrix Minor(int i1, int j1)
    {
        int rows = getrowsNum();
        squareMatrix temp = new squareMatrix(rows - 1);
        for (int i = 0; i < i1; i++)
        {
            for (int j = 0; j < j1; j++)
                temp.getmatrixData()[i][j] = getmatrixData()[i][j];
            for (int j = j1 + 1; j < rows; j++)
                temp.getmatrixData()[i][j - 1] = getmatrixData()[i][j];
        }
        for (int i = i1 + 1; i < rows; i++)
        {
            for (int j = 0; j < j1; j++)
                temp.getmatrixData()[i - 1][j] = getmatrixData()[i][j];
            for (int j = j1 + 1; j < rows; j++)
                temp.getmatrixData()[i - 1][j - 1] = getmatrixData()[i][j];
        }
        return temp;
    }
    public double Opredelitel()
    {
        double det = 0;
        int rows = getrowsNum();
        if (rows == 1)
            return getmatrixData()[0][0];
        squareMatrix temp = new squareMatrix(rows - 1);
        for (int j = 0; j < rows; j++)
        {
            temp = Minor(0, j);
            if (j % 2 == 0)
                det += temp.Opredelitel() * getmatrixData()[0][j];
                else
            det -= temp.Opredelitel() * getmatrixData()[0][j];
        }
        return det;
    }

}
