import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.graalvm.compiler.lir.LIRInstruction.Temp;

public class TwoCitySchedule {
     private  static int[] diffArray;
    public static void main(String[] args) {
        int[] a1={259,770};
        int[] a2={448,54};
        int[] a3={926,667};
        int[] a4={184,139};
        int[] a5={840,118};
        int[] a6 ={577,469};
        int[][] costs = {a1,a2,a3,a4,a5,a6};
        int[] b1={10,20};
        int[] b2={30,200};
        int[] b3={400,50};
        int[] b4={30,20};
        int[][] first ={b1,b2,b3,b4};
        int[] c1={518,518};
        int[] c2={71,971};
        int[] c3={121,862};
        int[] c4={967,607};
        int[] c5={138,754};
        int[] c6={513,337};
        int[] c7={499,873};
        int[] c8={337,387};
        int[] c9={647,917};
        int[] c10={76,417};
        int[][] second = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
        
        int[] d1={945,563};
        int[] d2={598,753};
        int[] d3={558,341};
        int[] d4={372,54};
        int[] d5={39,522};
        int[] d6={249,459};
        int[] d7={536,264};
        int[] d8={491,125};
        int[] d9={367,118};
        int[] d10={34,665};
        int[] d11={472,410};
        int[] d12={109,995};
        
        int[] d13={147,436};
        int[] d14={814,112};
        int[] d15={45,545};
        int[] d16={561,308};
        int[] d17={491,504};
        int[] d18={113,548};
        int[] d19={626,104};
        int[] d20={556,206};
        int[] d21={538,592};
    
        int[] d22={250,460};
        int[] d23={718,134};
        int[] d24={809,221};
        int[] d25={893,641};
        int[] d26={404,964};
        int[] d27={980,751};
        int[] d28={111,935};
        int[][] third ={d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28};

        System.out.println(twoCitySchedCost(third));

        //[[518,518],[71,971],[121,862],[967,607],[138,754],[513,337],[499,873],[337,387],[647,917],[76,417]]
        //System.out.println(twoCitySchedCost(first));
        //System.out.println(twoCitySchedCost(costs));
       // System.out.println(costs.length);
       //[[945,563],[598,753],[558,341],[372,54],[39,522],[249,459],[536,264],[491,125],[367,118],[34,665],[472,410],[109,995],[147,436],[814,112],[45,545],[561,308],[491,504],[113,548],[626,104],[556,206],[538,592],[250,460],[718,134],[809,221],[893,641],[404,964],[980,751],[111,935]]
        //[[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[]]
        
    }

    public static int twoCitySchedCost(int[][] costs) {
        int smallestCost=0;
        int cityA=0;
        int cityB=0;
        int length=costs.length;
        int n=length/2;
        
        diffArray = new int[length];
        ArrayList<Integer> list = new ArrayList<Integer>();
    
        for(int i=0;i<length;i++){
            int a=costs[i][0];
            int b=costs[i][1];
            int diff =findDiff(a, b);
            diffArray[i]=diff;
            list.add(diff);
        
        }
       
       System.out.println(list);
       Collections.sort(list,Collections.reverseOrder());
       System.out.println(list);
       int temp=0;
       for(int i=0;i<list.size();i++){
            int x=list.get(i);
            int index =findIndex(x);
            int a=costs[index][0];
            int b=costs[index][1];
            if (a<b){
                if(cityA!=n){
                    smallestCost+=a;
                    cityA++;
                }
                else{
                    smallestCost+=b;
                    cityB++;
                }
            }
            else{
                if(cityB!=n){
                    smallestCost+=b;
                    cityB++;
                }
                else{
                    smallestCost+=a;
                    cityA++;
                }
            }
            System.out.println(smallestCost-temp);
        }
        
        temp=smallestCost;
        return smallestCost;
        
    }
    public static int findDiff(int a,int b){
        if(a>b){
            return a-b;
        }
        else if (b>a){
            return b-a;
        }
        else{
            return 0;
        }
    }
   public static int findIndex(int z){
       int index=0;
       for(int i=0;i<diffArray.length;i++){
           if(diffArray[i] == z){
               index=i;
               diffArray[i]=-1;
               break;
           }
       }
       return index;
   }
    
}