import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static com.sun.tools.javac.jvm.ByteCodes.swap;
import static java.util.Collections.swap;

public class main {
    public static void main(String[] args) {
        int [] arr =  {1,3,5,4,2,2};
        int [] temp1 = {1,3,5,4,2,2,10};
        int [] temp2 = {1,3,4,3,1};
        int [] temp3 = {1,3,4};
        int [] temp4 = {1,3,2,3,1};
        int [] temp5 = {1,7,4,3,1};
        int [] temp6 = {1,3,7,3,1,2};
        int [] temp7 = {1,3,3,3,1,3,9};
        int [] temp8 = {3,3,3};
        Polynom p = new Polynom(arr);
        Polynom p1 = new Polynom(temp1);
        Polynom p2 = new Polynom(temp2);
        Polynom p3 = new Polynom(temp3);
        Polynom p4 = new Polynom(temp4);
        Polynom p5 = new Polynom(temp5);
        Polynom p6 = new Polynom(temp6);
        Polynom p7 = new Polynom(temp7);
        Polynom p8 = new Polynom(temp8);


        Polynom array[] = new Polynom[4];
        array[0] = p;
        array[1] = p1;
        array[2] = p2;
        array[3] = p3;

        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i].compareTo(array[minInd]) < array[minInd].compareTo(array[i])) {
                    minInd = i;
                }
            }
            swap(Arrays.asList(array), left, minInd);
        }
        for (int i=0;i<array.length;i++)
        {
            array[i].print();
        }
        System.out.println();

        degreeComparator dg = new degreeComparator();

        Polynom arr2[] = new Polynom[4];
        arr2[0] = p;
        arr2[1] = p1;
        arr2[2] = p2;
        arr2[3] = p3;

        for (int left = 0; left < arr2.length; left++) {
            int minInd = left;
            for (int i = left; i < arr2.length; i++) {
                if (dg.compare(arr2[i], arr2[minInd]) < dg.compare(arr2[minInd],arr2[i])) {
                    minInd = i;
                }
            }
            swap(Arrays.asList(arr2), left, minInd);
        }
        for (int i=0;i<array.length;i++)
        {
            arr2[i].print();
        }
        System.out.println("sorted by func value , x=5");

        valueComparator vc = new valueComparator();

        Polynom arr3[] = new Polynom[4];
        arr3[0] = p;
        arr3[1] = p1;
        arr3[2] = p2;
        arr3[3] = p3;

        for (int left = 0; left < arr3.length; left++) {
            int minInd = left;
            for (int i = left; i < arr3.length; i++) {
                if (vc.compare(arr3[i], arr3[minInd]) < vc.compare(arr3[minInd],arr3[i])) {
                    minInd = i;
                }
            }
            swap(Arrays.asList(arr3), left, minInd);
        }
        for (int i=0;i<array.length;i++)
        {
            System.out.println(arr3[i].func(5));
            arr3[i].print();

        }
        System.out.println("consider both parameters");
        Comparator vlc = dg.thenComparing(vc);


        Polynom arr4[] = new Polynom[9];
        arr4[0] = p;
        arr4[1] = p1;
        arr4[2] = p2;
        arr4[3] = p3;
        arr4[4] = p4;
        arr4[5] = p5;
        arr4[6] = p6;
        arr4[7] = p7;
        arr4[8] = p8;

        for (int left = 0; left < arr4.length; left++) {
            int minInd = left;
            for (int i = left; i < arr4.length; i++) {
                if (vlc.compare(arr4[i], arr4[minInd]) < vlc.compare(arr4[minInd],arr4[i])) {
                    minInd = i;
                }
            }
            swap(Arrays.asList(arr4), left, minInd);
        }
        for (int i=0;i<arr4.length;i++)
        {
            System.out.println(arr4[i].func(5));
            arr4[i].print();

        }

    }
}

class degreeComparator implements Comparator<Polynom>{
    @Override
    public int compare(Polynom p1, Polynom p2){
        return p1.degree - p2.degree;
    }
}
class valueComparator implements Comparator<Polynom> {
    @Override
    public int compare(Polynom p1, Polynom p2) {
        return p1.func(5) - p2.func(5);
    }
}