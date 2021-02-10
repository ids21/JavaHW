import java.util.Random;

public class main {
    public static void main(String[] args) {
        List list = new List();
        Random rnd = new Random();
        for (int i=0; i<10;i++)
            list.addElement(rnd.nextInt(10));
        list.print();

        List list2 = new List();
        for (int i=0; i<10;i++)
            list2.addElement(rnd.nextInt(10));
        list2.print();

        /*
        list.addList(list2);
        list.print();
        if(list2.find(5)!=null)
            System.out.println("has");
        else System.out.println("No");
         */
    }
}
