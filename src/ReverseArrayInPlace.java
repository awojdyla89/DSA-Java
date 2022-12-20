import java.util.Arrays;

public class ReverseArrayInPlace {


/*
HOW DO YOU REVERSE AN ARRAY IN PLACE?
Given an array of integers. Reverse the array in place.
Time complexity is O(n/2) or O(n) because it needs to iterate over almost
half the elements and perform n/2 swapping as well.
The space complexity of the algorithm is O(1)
because no matter how big the array is, it requires the same space.

*/
    public  int[] ReverseArray(int[] nums){
        // handling null, empty and one element array
        if(nums == null || nums.length <= 1){
            return null;
        }

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i]; // swap numbers
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }

    public int[] ReverseArrayBinary(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        System.out.println(Arrays.toString(nums));

        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

    public static void main(String[] args) {
        ReverseArrayInPlace sol = new ReverseArrayInPlace();
        int[] iArray = new int[] {101,102,103,104,105};
//        System.out.println(Arrays.toString(sol.ReverseArray(iArray)));
        System.out.println(Arrays.toString(sol.ReverseArrayBinary(iArray)));
    }
}
