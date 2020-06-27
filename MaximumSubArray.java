public class MaximumSubArray {
    public static void main(String[] args) {
        int[] a ={-2,-1};
        maxSubArray(a);
        
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        else if (nums.length==1){
            return 1;
        }
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                int a=nums[j];
                sum+=a;
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
        return maxSum;
        
    }

    
}