import java.util.Arrays;
import java.util.Random;

public class contains {
    public static int[] create_array(int size_arr){
        int arr[];
        arr = new int[size_arr];
        final Random random = new Random();
        for(int i=0;i<size_arr;i++)
            arr[i] = random.nextInt(10);
        return arr;
    }
    public static void show_array(int[] array){
        System.out.println(Arrays.toString(array));

    }
    public static void contains(){
        int[] a = create_array(10);
        show_array(a);
        int[] b = create_array(5);
        show_array(b);

        boolean flag = true;
        for(int a_ : a) {
            boolean found = false;
            for(int b_ : b) {
                if(a_ == b_ ) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                flag = false;
                break;
            }
            System.out.format("Currently status = %b%n", found);
        }
    }
    public static void main(String[] args) {
    contains();
    }
}
