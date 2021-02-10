import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class word_chain {
    public static Character lastChar(String str) {
        char last=' ';
        try {
            if (str == null || str.length() == 0) throw new Exception("String is empty");
            char[] cs = str.toCharArray();
            last = cs[cs.length - 1];
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return last;
    }
    public static Character firstChar(String str) {
        char last=' ';
        try {
            if (str == null || str.length() == 0) throw new Exception("String is empty");
            char[] cs = str.toCharArray();
            last = cs[0];
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return last;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] word = str.split(" ");

        ArrayList<String>[] chain = new ArrayList[word.length];
        int i=0;
        Character prev=' ';
        chain[0] = new ArrayList<>();
        boolean flag= true;
        int a=0;
        int j=0;
        while (i<word.length){
            chain[i] = new ArrayList<>();
            chain[i].add(word[i]);
            a=i;
            j=i+1;
            while(j< word.length-1){
                if (lastChar(word[a]) == firstChar(word[j])){
                    chain[i].add(word[j]);
                    j++;
                    a++;
                }
                else{
                    break;
                }
            }
            i++;
        }
        if (lastChar(word[word.length-2]) == firstChar(word[word.length-1])){
            chain[word.length-2].add(word[word.length-1]);
        }
        int max =0;
        int maxIndex=0;
        for(int b =0; b< word.length;b++) {
            if(max<chain[b].size()){
                max = chain[b].size();
                maxIndex=b;
            }
        }
        System.out.println(chain[maxIndex]);
    }
}
