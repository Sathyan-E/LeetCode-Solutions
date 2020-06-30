import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReconstructQueue {
    public static void main(String[] args) {

    int[] a1={7,0};
    int[] a2={4,4};
    int[] a3={7,1};
    int[] a4={5,0};
    int[] a5={6,1};
    int[] a6={5,2};
    int[][] arr={a1,a2,a3,a4,a5,a6};
    int[][] a=reconstructQueue(arr);
    //System.out.println(arr[0][0]);
        
    }

    public static int[][] reconstructQueue(int[][] people) {
        int l=people.length;
        int[][] result= new int[l][2];
        Arrays.sort(people,(p1,p2) -> p1[0] == p2[0]? p1[1]-p2[1] : p2[0]-p1[0]);
        List<int[]> list = new ArrayList<int[]>();
        
        for(int i=0;i<l;i++){
            list.add(people[i][1],people[i]);
           //System.out.println();
        }
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
            System.out.println(result[i][0]);
        }

        return result;     
    }

    public static int findIndex(int[][] a){
        int index=0;
        int small=a[0][0];
        for(int i=1;i<a.length;i++){
            if (small>a[i][0]){
                small=a[i][0];
                index=i;
            }
        }
        return index;

    }
    
    
}