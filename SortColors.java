public class SortColors {
    public static void main(String[] args) {
        int[] a= {2,0,2,1,1,0};
        sortColors(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        
    }
    public  static  void sortColors(int[] nums) {
        int tmp;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }
        
    }
    
}