import java.io.*;

public class sum_digits {
    public static void main(String[] args) {
        int sum=0;
        String c =null;
        try {
            FileReader file = new FileReader(new File("C:\\Users\\Dmitrij\\IdeaProjects\\task#3\\src\\text1.txt"));
            BufferedReader bf = new BufferedReader(file);
            while((c = bf.readLine()) != null){
                for (String retval : c.split(" ")){
                    sum+= Integer.parseInt(retval);
                }

            }
            System.out.format("Sum of all numbers in file = %d%n",sum);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
