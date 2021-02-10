import java.io.*;
import java.util.ArrayList;

public class reverse_file {
    public static void main(String[] args) {
        String c =null;
        ArrayList<String> words= new ArrayList<String>();
        try {
            FileReader file = new FileReader(new File("C:\\Users\\Dmitrij\\IdeaProjects\\task#3\\src\\text1.txt"));
            BufferedReader bf = new BufferedReader(file);
            while((c = bf.readLine()) != null) {
                for (String retval : c.split(" ")) {
                    words.add(retval);
                }
            }
            for (int i=words.toArray().length -1; i>=0; i--)
            {
                System.out.println(words.get(i));
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

