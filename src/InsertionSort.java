import java.util.Arrays;

public class InsertionSort {

    /**
     * Write a function that takes in an array of integers and returns a sorted version of that array.
     * Use the Insertion Sort algorithm to sort the array.
     *
     * @param array The array of numbers
     * @return The sorted array
     */
    public int[] insertionSort(int[] array) {
        // @TODOd Write out the method
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            int next = i - 1;

            while (next >= 0 && array[next] > curr) {
                array[next + 1] = array[next];
                next -= 1;
            }
            array[next + 1] = curr;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();

        int[] nums1 = new int[] { 141, 1, 1, 17, -7, -17, -27 };
        is.insertionSort(nums1);
    }
}

