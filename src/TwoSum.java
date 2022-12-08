
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]
*/

/*
Time = O(n) worst case we search the entire nums array
space = O(n) for storing nums in a data structure
*/


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
//        System.out.println("Target val: " + target);
//        System.out.println("Nums to check: " + Arrays.toString(nums));

        HashMap<Integer, Integer> bank = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
//            System.out.println(complement);
            if(bank.containsKey(complement)){
//                int[] res = {i, bank.get(complement)};
                return new int[] {i, bank.get(complement)};
            }
            bank.put(nums[i], i);
//            System.out.println(bank);
        }
        return null;
    }

    public static void main(String[] args) {

        TwoSum sol = new TwoSum();

        int target1 = 9;
        int[] nums1 = new int[]{2,7,11,15};

        int target2 = 6;
        int[] nums2 = new int[]{3,2,4};

        int target3 = 6;
        int[] nums3 = new int[]{3,3};

        int[] result = sol.twoSum(nums1, target1);
        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(sol.twoSum(nums2, target2)));
        System.out.println(Arrays.toString(sol.twoSum(nums3, target3)));

    }
}
