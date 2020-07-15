public class RemoveDublicates {
    public static void main(String[] args) {
        int[] a={0,0,1,1,1,2,2,3,3,4};
        int[] b={1,1,2};
        System.out.println(removeDuplicates(a));
        System.out.println(removeDuplicates(b));
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }

        
    }
    public static int removeDuplicates(int[] nums) {
        int arrayLength=nums.length;
        if(arrayLength!=0){
            int l=1;
            int position=1;
            int element = nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=element){
                    l++;
                    element=nums[i];
                    int temp=nums[position];
                    nums[position]=nums[i];
                    nums[i]=temp;
                    position++;

                }
            }
            return l;
        }
        else {
            return 0;
        }
        
        
    }

    
}