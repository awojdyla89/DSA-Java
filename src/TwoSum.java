import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        System.out.println("Target val: " + target);
        System.out.println("Nums to check: " + Arrays.toString(nums));

//        int[] result = new int[2];
        HashMap<Integer, Integer> bank = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
//            System.out.println(complement);
            if(bank.containsKey(complement)){
//                int[] res = {i, bank.get(complement)};
////                result[0] = i;
////                result[1] = complement;
//                return res;
                return new int[] {i, bank.get(complement)};
            }
            bank.put(nums[i], i);
//            System.out.println(bank);

        }
        return null;

    }



    public static void main(String[] args) {

        TwoSum sol = new TwoSum();

//        Two sum
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int result[] = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}
