import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2,5,6,7,2,3,2};
        int[] barr = {3,2,2,3};
        System.out.println(removeElement(arr, 2));
    }
    public static int removeElement(int[] nums, int val) {
       
        Arrays.sort(nums);
        int arraylen=0;
        int temp=0;
        int pos=nums.length-1;
        int i=0;
        while(i<=pos){
            //System.out.println(nums[i]);
        
            if(nums[i]==val){
                temp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;
                pos--;                
            }
            else{
                arraylen++;
                i++;
            }
            
        }

        //System.out.println(pos);
        
        return arraylen;
        
    }
}