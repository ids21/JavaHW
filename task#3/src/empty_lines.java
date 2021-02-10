import java.io.*;
import java.util.ArrayList;

public class empty_lines {
    public static void main(String[] args) {
        String c =null;
        int count = 0;
        try {
            FileReader file = new FileReader(new File("C:\\Users\\Dmitrij\\IdeaProjects\\task#3\\src\\text1.txt"));
            BufferedReader bf = new BufferedReader(file);
            while((c = bf.readLine()) != null) {
                if(c.isEmpty()){
                    count+=1;
                }
            }

            System.out.println(count);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

