import java.util.Arrays;

public class FindThreeLargestNums {

    /**
     * Find the three largest numbers in an array.
     *
     * @param array The array of numbers, must have size >= 3
     * @return An array of the three largest numbers
     */
    public int[] findThreeLargestNumbers(int[] array) {
        // @TODOd Write out the method

        int third = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > first){
                third = second;
                second = first;
                first = array[i];
            }else if(array[i] > second){
                third = second;
                second = array[i];
            }else if(array[i] > third){
                third = array[i];
            }
        }
        System.out.println("first: " + first + " sec: " + second + " third: " + third);
        return new int[] { third, second, first };
    }

    public static void main(String[] args) {
        FindThreeLargestNums largest = new FindThreeLargestNums();
        int[] nums1 = new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
//        [18, 141, 541] - answer
        int[] nums2 = new int[]{10, 5, 9, 10, 12};
//         [10, 10, 12] - answer
        int[] nums3 = new int[] {-1, -2, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7};
//         [-2, -1, 7] - answer
//        System.out.println(Arrays.toString(largest.findThreeLargestNumbers(nums1)));
//        System.out.println(Arrays.toString(largest.findThreeLargestNumbers(nums2)));
        System.out.println(Arrays.toString(largest.findThreeLargestNumbers(nums3)));

    }
}
