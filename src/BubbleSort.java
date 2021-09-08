import java.util.*;
public class BubbleSort extends Methods {
    // Bubble sort implementation
    // Array to sort of 6 elements and print it using the inherited method.
    public static int[] bubbleArray = arrayMaker(6);


    public static void Swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;

    }

    public static int [] bubbleSort(int[] array) {
        for (int i = 0; i < bubbleArray.length; i++) {
            for (int j = 0; j < bubbleArray.length-1; j++) {
                if (array[j] > array[j+1]) {
                    Swap(array, j, j+1);
                }
            }
        }
        return array;
    }

    public static void main(String args[]) {

        // we print the array
        System.out.println(Arrays.toString(bubbleArray));
        for (int i : bubbleArray) {
           // System.out.println(i);
        }

        System.out.println("Sorted Array");
        bubbleArray = bubbleSort(bubbleArray);
        System.out.println(Arrays.toString(bubbleArray));



    }
}