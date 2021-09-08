import java.util.Arrays;

    public class SelectionSort extends Methods {
    private static int [] selectionArray = arrayMaker(7);

    public static int[]selectionSort(int [] array){
        for (int i = array.length-1; i > 0; i--){
            int largest = 0;
            for( int j = 1; j <= i; j++){
                if (array[j] > array[largest]){
                    largest = j;
                }

            }
            Swap(array,i,largest);
        }
        return array;
    }

    public static void main(String args[]){
        System.out.println(Arrays.toString(selectionArray));
        System.out.println("Sorted array");
        selectionArray = selectionSort(selectionArray);
        System.out.println(Arrays.toString(selectionArray));
    }


}
