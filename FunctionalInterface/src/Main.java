import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Main {
    public static void main(String[] args) throws Exception {
        fun fun1 = new fun();
        fun fun2 = new gipFun();

        setF<fun > HORD = (fun function, double start,double end, double e)->{
            double x = start;
            double xn = start - (end - start) / (function.f1(start) - function.f1(end)) * function.f1(start);
            double fxn = function.f1(xn);
            double fa = function.f1(start);
            double fb = function.f1(end);
            do
            {
                x = xn;
                if (fxn * fa < 0) end = x;
                else start = x;

                fa = function.f1(start);
                fb = function.f1(end);
                xn = (start * fb - end * fa) / (fb - fa);
                fxn = function.f1(xn);
            }while(abs(xn - end) > e);
            return xn;
        };
        
        setF<fun > Newton = (fun function, double start,double end, double e)-> {
            double root = (start + end) / 2;
            while (Math.abs(function.f1(root)) > e) {
                root = root - function.f1(root) / function.df1(root);
            }

            return root;
        };



        System.out.println(HORD.root(fun1,0,5,0.001));
        //System.out.println(Newton.root(fun1, 0, 5, 0.001));

        //System.out.println(HORD.root(fun2,-5,-1,0.001));
        //System.out.println(Newton.root(fun2,-5,-1,0.001));



    }

}
