import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Mnogestvo mnog1 = new Mnogestvo();
        mnog1.displayInfo();
        Integer[] nums = new Integer[]{1,2,4,5};
        Mnogestvo mnog2 = new Mnogestvo(nums);
        mnog2.displayInfo();
        int a = 3;
        mnog2.Add(a);
        mnog2.displayInfo();
        mnog2.Delete(2);
        mnog2.displayInfo();
        Integer[] num2 = new Integer[]{1,4,5,3};
        Mnogestvo mnog3 = new Mnogestvo(num2);
        System.out.println(mnog2.Equal(mnog3));

        Integer[] num3 = new Integer[]{2,6,7,8,9,1,4,5};
        Mnogestvo mnog4 = new Mnogestvo(num3);

        mnog1 = mnog2.Union(mnog4);
        mnog1.displayInfo();
        mnog3.Intersection(mnog4).displayInfo();
        mnog3.Difference(mnog4).displayInfo();

    }
}

class Mnogestvo{
    ArrayList<Integer> elements = new ArrayList<Integer>();
    int n;

    public Mnogestvo() {
        this.elements = new ArrayList<Integer>();
        n = 0;

    }
    public Mnogestvo(int size) {
        this.n = size;
    }
    public Mnogestvo(Integer[] element) {
        try {
            for (int i = 1; i < element.length - 1; i++) {
                if (element[i].equals(element[i + 1])) throw new Exception("not unqie array");
            }
            for (int i = 0; i < element.length; i++)
                this.elements.add(Integer.valueOf(element[i]));
            this.n = element.length ;
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean Include(int targetValue){
        for (int i = 0; i < this.n; i++) {
            if (this.elements.get(i).equals(targetValue)) {
                return true;
            }
        }
        return false;
    }

    public boolean Add(int element) {
        if (!this.Include(element)) {
            this.elements.add(Integer.valueOf(element));
            this.n+=1;
            return true;
        }
        else {
            System.out.println("this item already exist");
            return false;}
    }
    public int Find(int element){
        for (int i = 0; i < this.n; i++) {
            if (this.elements.get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public boolean Delete(int element) {

        if (this.Include(element)) {
            for (int i = 0; i < this.n; i++) {
                if (this.elements.get(i).equals(element)) {
                    this.elements.remove(i);
                    this.n-=1;
                }
            }
            return true;
        }
        else {
            System.out.println("not exist");
            return false;}
    }
    void displayInfo(){
        System.out.println(this.elements);
    }
    public boolean Equal(Mnogestvo second){
        if (this == null) {
            return (second == null);
        }
        if (second == null) {
            return false;
        }
        if (this.n != second.n){
            return false;
        }
        if (!this.elements.equals(second.elements)){
            return false;
        }
        return true;
    }
    public Mnogestvo Union(Mnogestvo second){
        var resSet = new Mnogestvo();


        for (int i = 0; i < this.n; i++) {

            resSet.Add(Integer.valueOf(this.elements.get(i)));
        }
        if (second.elements != null && second.n >0) {
            for (int i = 0; i < second.n; i++) {
                if (!resSet.Include(second.elements.get(i).intValue()))
                    resSet.Add(Integer.valueOf(second.elements.get(i)));
            }
        }
        return resSet;
    }
    public Mnogestvo Intersection(Mnogestvo second){
        var resSet = new Mnogestvo();

        if (second.elements != null && second.n >0) {
            for (int i = 0; i < second.n; i++) {
                if (this.Include(second.elements.get(i).intValue()))
                    resSet.Add(Integer.valueOf(second.elements.get(i)));
            }
        }
        return resSet;
    }
    public Mnogestvo Difference(Mnogestvo second){
        var resSet = new Mnogestvo();
        for (int i = 0; i < this.n; i++) {

            resSet.Add(Integer.valueOf(this.elements.get(i)));
        }
        if (this.elements != null && this.n >0) {
            for (int i = 0; i < second.n; i++) {
                if (this.Include(second.elements.get(i).intValue()))
                    resSet.Delete(Integer.valueOf(second.elements.get(i)));
            }
        }
        return resSet;
    }

}
