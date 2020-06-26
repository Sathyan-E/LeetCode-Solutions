public class SearchAndInsert {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,9,11,13};
        int target=10;
        System.out.println(searchInsert(arr, target));
        
    }
    public static int searchInsert(int[] nums, int target) {
        int l=nums.length;
        int index=0;
        if(l==0){
            return 0;
        }
        else{
            if(target<nums[0]){
                return 0;
            }
            else if(target > nums[l-1]){
                return l;
            }
            for(int i=0;i<l;i++){
                if(target<nums[i]){
                    index=i;
                    break;
                }
                else if(target == nums[i])
                {
                    return i;
                }
            }
            return index;
        }
        
    }
    
}