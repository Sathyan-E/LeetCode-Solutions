/** 
Problem No(On leetcode):11
Problem :
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 

for image represenation for better understanding, refer leetcode site.
 

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49



**/



public class ContainerWater {
    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        maxArea(a);
    
        
    }

    public static int maxArea(int[] height) {
        int area=0;
        for(int i=0;i<height.length;i++){
            int a=0;
            for(int j=i+1;j<height.length;j++){
                int lenght=j-i;
                int breadth;
                if(height[j]<height[i]){
                    breadth=height[j];
                }
                else{
                    breadth=height[i];
                }
                a=lenght*breadth;
                if(a>area){
                    area=a;
                }

            }
        }

        System.out.println(area);
        return area;
        
    }
    
}
