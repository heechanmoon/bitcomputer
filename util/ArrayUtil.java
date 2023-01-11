package util;

import day0111.Board;
import day0111.Student;

public class ArrayUtil {
    // 1. int[]
    // A. size()
    public static int size(int[] array){
        return array.length;
    }
    // B. isEmpty()
    public static boolean isEmpty(int[] array){
        return size(array) == 0;
    }
    // C. get()
    public static int get(int[] array, int index){
        return array[index];
    }
    // D. contains()
    public static boolean contains(int[] array, int element) {
        for (int i = 0; i < size(array); i++) {
            if (element == get(array,i)) {
                return true;
            }
        }
        return false;
    }
    // D. indexOf()
    public static int indexOf(int[] array, int element){
        for(int i = 0; i < size(array); i++){
            if(element == get(array,1)){
                return i;
            }
        }
        return -1;
    }
    // F. add()
    public static int[] add(int[] array, int element){
        int[] temp = new int[size(array)+1];
        for(int i=0; i<size(array); i++){
            temp[i] = get(array, i);
        }
        temp[size(array)] = element;
        return temp;
    }

    // G. add()
    public static int[] add(int[] array, int index, int element){
        int[] temp = new int[size(array) + 1];
        for(int i=0; i<index; i++){
            temp[i] = get(array, i);
        }
        temp[index] = element;

        for(int i=index+1; i<size(array); i++){
            temp[i] = get(array, i-1);
        }

        return temp;
    }

    // H. set()
    public static int set(int[] array, int index, int element){
        int original = get(array, index);
        array[index] = element;

        return original;
    }

    //I.removeByIndex()
    public static int[] removeByIndex(int[] array, int index){
        int[] temp = new int[0];
        for(int i=0; i < size(array); i++){
            if(i!=index){
                temp = add(temp, get(array,i));
            }
        }

        return temp;
    }

    //J.removeByElement
    public static int[] removeByElement(int[] array, int element){
        return removeByIndex(array,indexOf(array,element));
    }

    // K. sort()
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

    // 1. Student[]
    // A. size()
    public static int size(Student[] array){
        return array.length;
    }
    // B. isEmpty()
    public static boolean isEmpty(Student[] array){
        return size(array) == 0;
    }
    // C. get()
    public static Student get(Student[] array, int index){
        return array[index];
    }
    // D. contains()
    public static boolean contains(Student[] array, Student element) {
        for (int i = 0; i < size(array); i++) {
            if (element == get(array,i)) {
                return true;
            }
        }
        return false;
    }
    // D. indexOf()
    public static int indexOf(Student[] array, Student element){
        for(int i = 0; i < size(array); i++){
            if(element == get(array,i)){
                return i;
            }
        }
        return -1;
    }
    // F. add()
    public static Student[] add(Student[] array, Student element){
        Student[] temp = new Student[size(array)+1];
        for(int i=0; i<size(array); i++){
            temp[i] = get(array, i);
        }
        temp[size(array)] = element;
        return temp;
    }

    // G. add()
    public static Student[] add(Student[] array, int index, Student element){
        Student[] temp = new Student[size(array) + 1];
        for(int i=0; i<index; i++){
            temp[i] = get(array, i);
        }
        temp[index] = element;

        for(int i=index+1; i<size(array); i++){
            temp[i] = get(array, i-1);
        }

        return temp;
    }

    // H. set()
    public static Student set(Student[] array, int index, Student element){
        Student original = get(array, index);
        array[index] = element;

        return original;
    }

    //I.removeByIndex()
    public static Student[] removeByIndex(Student[] array, int index){
        Student[] temp = new Student[0];
        for(int i=0; i < size(array); i++){
            if(i!=index){
                temp = add(temp, get(array,i));
            }
        }

        return temp;
    }

    //J.removeByElement
    public static Student[] removeByElement(Student[] array, Student element){
        return removeByIndex(array,indexOf(array,element));
    }

    // 1. Board[]
    // A. size()
    public static int size(Board[] array){
        return array.length;
    }
    // B. isEmpty()
    public static boolean isEmpty(Board[] array){
        return size(array) == 0;
    }
    // C. get()
    public static Board get(Board[] array, int index){
        return array[index];
    }
    // D. contains()
    public static boolean contains(Board[] array, Board element) {
        for (int i = 0; i < size(array); i++) {
            if (element == get(array,i)) {
                return true;
            }
        }
        return false;
    }
    // D. indexOf()
    public static int indexOf(Board[] array, Board element){
        for(int i = 0; i < size(array); i++){
            if(element == get(array,i)){
                return i;
            }
        }
        return -1;
    }
    // F. add()
    public static Board[] add(Board[] array, Board element){
        Board[] temp = new Board[size(array)+1];
        for(int i=0; i<size(array); i++){
            temp[i] = get(array, i);
        }
        temp[size(array)] = element;
        return temp;
    }

    // G. add()
    public static Board[] add(Board[] array, int index, Board element){
        Board[] temp = new Board[size(array) + 1];
        for(int i=0; i<index; i++){
            temp[i] = get(array, i);
        }
        temp[index] = element;

        for(int i=index+1; i<size(array); i++){
            temp[i] = get(array, i-1);
        }

        return temp;
    }

    // H. set()
    public static Board set(Board[] array, int index, Board element){
        Board original = get(array, index);
        array[index] = element;

        return original;
    }

    //I.removeByIndex()
    public static Board[] removeByIndex(Board[] array, int index){
        Board[] temp = new Board[0];
        for(int i=0; i < size(array); i++){
            if(i!=index){
                temp = add(temp, get(array,i));
            }
        }

        return temp;
    }

    //J.removeByElement
    public static Board[] removeByElement(Board[] array, Board element){
        return removeByIndex(array,indexOf(array,element));
    }



    /* K. sort()
    public static void sort(Board[] array){
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                Board temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i = -1;
            }
        }
    }

     */
}
