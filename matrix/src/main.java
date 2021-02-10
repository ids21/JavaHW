public class main {
    public static void main(String[] args) {
        int[][] default_mtrx = {{1,2,3},{1,3,5}};
        Matrix mtrx = new Matrix(default_mtrx);
        Matrix mtrx1 = new Matrix(default_mtrx);
        //System.out.print(mtrx.toString());
        //mtrx.addMatrix(mtrx1);
        //mtrx.subtractMatrix(mtrx1);
        //mtrx.multiplyMatrix(mtrx1);
        //System.out.print(mtrx.toString());
        int[][] sqrt_mtrx = {{1,2,3},{1,3,5},{1,2,4}};
        squareMatrix sqrmtrx = new squareMatrix(sqrt_mtrx);
        System.out.print(sqrmtrx.toString());
        //sqrmtrx.mulValue(10);
        System.out.print(sqrmtrx.Opredelitel());

    }
}
