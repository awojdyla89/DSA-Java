import java.util.Arrays;

public class BubbleSort {
    /**
     * Write a function that takes in an array of integers and returns a sorted version of that array.
     * Use the Bubble Sort algorithm to sort the array.
     *
     * @param array The array of numbers
     * @return The sorted array
     */
    public int[] bubbleSort(int[] array) {
        // @TODOd Write out the method
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length ; j++) {
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
        return array;
    }


    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] num1 = new int[] { 141, 1, 17, -7, -17, -27 };
        bs.bubbleSort(num1);

    }
}
