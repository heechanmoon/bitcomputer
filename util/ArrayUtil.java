package util;

public class ArrayUtil {
    public static boolean contains(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static void sort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i = -1;
            }
        }
    }
}
