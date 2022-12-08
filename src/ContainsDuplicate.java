
/*
Given an integer array nums, return true if any value appears at least
twice in the array, and return false if every element is distinct.

Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean ContainsDupe(int[] nums){
//        System.out.println("Nums to check: " + Arrays.toString(nums));
        HashMap<Integer, Integer> bank = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(bank.containsKey(nums[i])){
                bank.put(nums[i], bank.get(nums[i]) + 1);
//                System.out.println(bank);
                if(bank.get(nums[i]) >= 2){
//                    System.out.println("Key: " + nums[i] + " value: " + bank.get(nums[i]));
                    return true;
                }
            }
            bank.putIfAbsent(nums[i], 1);
        }
        return false;
    }


    public static void main(String[] args) {

        ContainsDuplicate sol = new ContainsDuplicate();

        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(sol.ContainsDupe(nums1) + "\n");
        System.out.println(sol.ContainsDupe(nums2) + "\n");
        System.out.println(sol.ContainsDupe(nums3));


    }
}
