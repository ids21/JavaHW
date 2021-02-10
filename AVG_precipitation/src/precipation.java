import java.time.*;
import java.util.*;
public class precipation {

    public static double rnd(final double max)
    {
        return Math.random() * max;
    }
    public  static  double AVG(List<Double> array)
    {
        Double sum = 0.0;
        for(double i: array){
            sum +=i;
        }
        return sum/array.size();
    }

    public static void main(String[] args) {
        List<Double>[] precipitation;
        precipitation = new List[12];

        for(int i=0; i<12; i++){
            YearMonth yearMonthObject = YearMonth.of(2020, i+1);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            precipitation[i] = new ArrayList<Double>(daysInMonth);

            for(int j=0;j<daysInMonth;j++) {
                double prec_rand = rnd(10000.0);
                precipitation[i].add(prec_rand);
            }

        }
        for(int i=0; i<12;i++){
            System.out.format("Average precipitation for %d%n months is %f%n",i,AVG(precipitation[i]));
        }

    }
}
