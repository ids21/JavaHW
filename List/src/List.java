import java.util.Arrays;
import java.util.Random;

public class List {
    public static void main(String[] args) throws Exception {
        DList list = new DList();
        list.addElement(13);
        list.addElement(11);
        list.addElement(12);
        list.addElement(100);
        list.Display();
        list.insertElement(2,78);
        list.Display();
        list.sortList();
        list.Display();
        list.deleteElement(13);
        list.Display();
        list.removeElement(3);
        list.Display();
        System.out.println(list.indexOfElemnt(12));
        System.out.println(list.countElemnt(100));
        System.out.println(list.max());
        System.out.println(list.length());
        DList copyList = new DList();
        list.copy(copyList);
        copyList.Display();

        //list.clearList();
        //list.Display();
        System.out.println(list.equals(copyList));
        System.out.println("--------Основаная задача--------");
        DList sequence = new DList();
        Random rd= new Random();
        rd.setSeed(10);
        for(int i=0;i<20;i++){
            sequence.addElement(rd.nextInt(15));
        }
        sequence.deleteElement(3);
        sequence.deleteElement(0);
        sequence.Display();
        System.out.println("length of max palindrom ="+sequence.maxPalindrome());

    }
}

