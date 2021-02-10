import java.util.*;

public class min_max_word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count_words=0,max_size=0;
        String max_word="";
        String[] word = str.split(" ");
        String min_word=word[0];
        int min_size=word[0].length();
        count_words=word.length;
        int i=0;
        int indexMax=0;
        int indexMin=0;
        while(i<count_words)
        {
            if (count_words==1 || word[i].length()>max_size) {
                max_size=word[i].length();
                max_word=word[i];
                indexMax=i;
            }
            if (count_words==1||word[i].length()<min_size) {
                min_size=word[i].length();
                min_word=word[i];
                indexMin=i;

            }
            i++;
        }
        System.out.println(max_word);
        System.out.println(min_word);
        System.out.println();
        String[] newStr = new String[count_words];
        for(int k=0;k<count_words;k++){
            if(k==indexMax){newStr[k]=min_word;}
            else if (k==indexMin){newStr[k]=max_word;}
            else newStr[k]= word[k];
            System.out.println(newStr[k]);
        }
    }
}
