import java.util.*;
public class Connectivity_graph {
    public static int[][] create_array(int size_arr){
        int[][] arr = new int[size_arr][size_arr];
        final Random random = new Random();
        random.setSeed(1);
        for(int i=0;i<size_arr;i++) {
            for (int j = 0; j < size_arr; j++) {
                arr[i][j] = random.nextInt(2);
                if (i == j) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
    public static void show_array(int[][] array){
        for(int i=0;i<array[0].length;i++)
            System.out.println(Arrays.toString(array[i]));

    }

    public static int[] adjacent(int[][] matrix, int u){
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++)
            {
                if (matrix[u][j]==1){
                    myHashSet.add(j);
                }

            }
        }
        int[] arr = myHashSet.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }

    public static int algo(int u, boolean[] visited,int[][]arr){
        int visitedVertices = 1;
        visited[u] = true;
        int[] adjact = adjacent(arr,u);
        if (adjact != null){
        for(int v: adjact){

            if (visited[v]==false){
                visitedVertices +=algo(v,visited,arr);
            }
        }
        }
        else visitedVertices=1;
        return visitedVertices;
    }




    public static void main(String[] args) {
        boolean[] bol = new boolean[] {false,false,false,false,false};
        int[][] arr={{0,1,1,0,0},{1,0,1,0,0},{1,1,0,0,0},{0,0,0,0,1},{0,0,0,1,0}};
        int n = 5;
        //arr=create_array(n);
        show_array(arr);
        int count =0;

        count = algo(1, bol,arr);
        System.out.println(count);
        if (count == n){
            System.out.println("connected graph");
        }


    }
}
