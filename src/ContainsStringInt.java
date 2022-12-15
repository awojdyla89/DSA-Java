import java.util.Arrays;



public class ContainsStringInt {

    /** Linear Search
     * Given an array of numbers and a target value
     * return true or false if the target value is in the array.
     * Time Complexity: O(n) where n is the size of the array being compared to.
     * Space Complexity: O(1) the size of the array is fixed, no extra memory is allocated (data structure)
     * @param nums - an array of integers.
     * @param target -  target value.
     * @return boolean if target found in array.
     */
    public boolean containsInt(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    /** Linear Search
     * Given an array of strings and a target value
     * return true or false if the target value is in the array.
     * Time Complexity: O(n) where n is the size of the array being compared to.
     * Space Complexity: O(1) the size of the array is fixed, no extra memory is allocated (data structure)
     * @param names - an array of integers.
     * @param target -  target value.
     * @return boolean if target found in array.
     */
    public boolean containsString(String[] names, String target) {
        for (String st : names) {
            if (st.equalsIgnoreCase(target)) {
//                System.out.println("Ignoring case: " + st + " == " + target);
                return true;
            }
        }
        return false;
    }

    /** Binary Search
     * Given an array of strings and a target value
     * return true or false if the target value is in the array.
     * Time Complexity: O(log n) where n is the size of the array being cut in half per iteration.
     * Space Complexity: O(1) the size of the array is fixed, no extra memory is allocated (data structure)
     * @param names - an array of integers.
     * @param target -  target value.
     * @return boolean if target found in array.
     */
    public boolean containsStringBinary(String[] names, String target) {
        int low = 0;
        int high = names.length - 1;
        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = names[mid].compareToIgnoreCase(target);
            if (result == 0) {
//                System.out.println("mid index: " + mid + " mid Value: " + names[mid] + " target: " + target);
                return true;
            }
            if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public boolean containsIntBinary(int[] nums, int target) {
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
//                System.out.println("mid index: " + mid + " mid Value: " + nums[mid] + " target: " + target);
                return true;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsStringInt sol = new ContainsStringInt();

        String strTarget = "Java";
        String[] names = new String[]{"java", "JEE", "Scala", "C++"};
        int intTarget = 8;
        int[] nums1 = new int[]{1, 3, 4, 2, 6, 8, 10, 4, 5};

        System.out.println(sol.containsInt(nums1, intTarget));
        System.out.println(sol.containsIntBinary(nums1, intTarget));
        System.out.println(sol.containsString(names, strTarget));
        System.out.println(sol.containsStringBinary(names, strTarget));
    }
}
