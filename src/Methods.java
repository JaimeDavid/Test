import java.util.*;

public class Methods {
    //Method that creates an int array of random elements
    public static int[] arrayMaker(int length){
        int[] arrayMaker = new int[length];
        for(int i = 0; i < arrayMaker.length;i++){
            int randomInt = new Random().nextInt(99);
            arrayMaker[i] = randomInt;
        }
        return arrayMaker;
    }
    //Method that swaps elements within the array
    public static void Swap(int[] array, int i, int j){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;

    }
}
