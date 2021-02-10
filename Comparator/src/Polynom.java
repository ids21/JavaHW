import java.util.Arrays;
import java.util.List;

public class Polynom<T> implements Comparable{
    public int[] coeff;
    public int degree;

    public Polynom(int[] arr) {
        this.coeff = new int[arr.length];
        this.coeff = arr;
        this.degree = arr.length - 1;
    }

    private Polynom(int degree) {
        this.degree = degree;
        this.coeff = new int[this.degree + 1];
    }

    public Polynom(Polynom p) {
        this.degree = p.degree;
        this.coeff = p.coeff.clone();
    }

    public void print(){
        for (int i = degree; i>0;i--){
            System.out.print(coeff[i]+"*x^"+i+" + ");
        }
        System.out.println(coeff[0]);
    }
    @Override
    public int compareTo(Object o) {
        Polynom p =(Polynom) o;
        return degree - p.degree;
    }
    public int func(int x){
        int res = 0;
        for (int i = degree; i>0;i--){
            res += coeff[i] * x;
        }
        return res;
    }




}