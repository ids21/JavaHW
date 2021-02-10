import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Matrix sumMatrix = new Matrix(3, 3);
        Matrix subMatrix = new Matrix(3, 3);
        Matrix mulMatrix = new Matrix(3, 3);
        Matrix divMatrix = new Matrix(3, 3);
        polynom sumPol = new polynom();
        polynom subPol = new polynom();
        polynom mulPol = new polynom();


        double[] arr = {1,2,3,4,5};
        double[] arr1 = {10,10,10,10,10};
        double [][]m = {{21, 1, 2}, {3, 2, 6}, {4, 2, 1}};
        double [][]m1 = {{2, 7, 1}, {1, 6, 9}, {4, 2, 3}};
        polynom pol = new polynom(arr);
        polynom pol1 = new polynom(arr1);
        Matrix mat = new Matrix(m);
        Matrix mat1 = new Matrix(m1);

        Scanner scan= new Scanner(System.in);
        int q = scan.nextInt();
        if (q ==1 || q==2) {
            switch (q) {
                case 1:
                    sumMatrix = (Matrix) mat.sum((IMath) mat1);
                    sumMatrix.print();
                    System.out.println();
                    subMatrix = (Matrix) mat.sub((IMath) mat1);
                    sumMatrix.print();
                    System.out.println();
                    mulMatrix = (Matrix) mat.mul((IMath) mat1);
                    sumMatrix.print();
                    System.out.println();
                    divMatrix = (Matrix) mat.mul((IMath) mat1);
                    sumMatrix.print();
                    System.out.println();
                    break;
                case 2:
                    sumPol = (polynom) pol.sum((IMath) pol1);
                    sumPol.print();
                    subPol = (polynom) pol.sub((IMath) pol1);
                    subPol.print();
                    mulPol = (polynom) pol.mul((IMath) pol1);
                    mulPol.print();
                    break;
                }
            }
        else{
            System.out.println("enter only 1 or 2");
        }
    }
}
