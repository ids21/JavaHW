import java.util.*;
public class Shift_array_to_the_right {

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
    public static int[] shifting(int[] array){
        int last_item = array[array.length -1];
        try{
            if (array.length==1) throw new Exception("array has only one element, can't shifting");
            for(int i=array.length-2;i>=0;i--){
                array[i+1] = array[i];
            }
            array[0]=last_item;

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr = create_array(10);
        show_array(arr);
        int[] shifted_array= new int[10];
        shifted_array = shifting(arr);
        show_array(shifted_array);
    }
}
