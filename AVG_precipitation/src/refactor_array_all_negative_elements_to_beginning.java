import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class refactor_array_all_negative_elements_to_beginning {
    public static int[] create_array(int size_arr){
        int arr[];
        arr = new int[size_arr];
        final Random random = new Random();
        for(int i=0;i<size_arr;i++)
            arr[i] = random.nextInt(20)-10;
        return arr;
    }
    public static void show_array(int[] array){
        System.out.println(Arrays.toString(array));

    }
    public static int[] refactor(int[] array){
        int j=0;
        try {
            String type_ = array.getClass().getTypeName();
            if (!Objects.equals(type_,"int[]")) throw new Exception(array.getClass().getTypeName() +"only int");
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    if (i != j) {
                        array[i] *= array[j];
                        array[j] = array[i] / array[j];
                        array[i] /= array[j];
                    }
                    j++;
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr = create_array(10);
        show_array(arr);
        int[] refactored_arr = new int[10];
        refactored_arr = refactor(arr);
        show_array(refactored_arr);
    }
}
