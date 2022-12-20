public class ContainerWithMostWater {

    public int ContainerMostWater(int[] height) {
        int maxarea = 0;
        for (int left = 0; left < height.length; left++) {
            for (int right = left + 1; right < height.length; right++) {

//              find the current width of the x-axis
                int currentWidth = right - left;
//              find the shorter of the two y-axis and find the area by multiplying x * y
                int currentArea = Math.min(height[left], height[right]) * currentWidth;
//              update the maximum area found so far
                maxarea = Math.max(maxarea, currentArea);
            }
        }
        return maxarea;
    }

    public int ContainerMostWaterOptimized(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right){
            int currentWidth = right - left;
            int currentArea = Math.min(height[left], height[right]) * currentWidth;
            maxArea = Math.max(maxArea, currentArea);
//          Update the shortest height being compared so to maximize the area.
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] heights = new int[] {1,8,6,2,5,4,8,3,7}; // result 49
        System.out.println(container.ContainerMostWater(heights));
        System.out.println(container.ContainerMostWaterOptimized(heights));
    }
}
