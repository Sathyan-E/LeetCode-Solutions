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