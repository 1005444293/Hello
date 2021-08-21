import java.util.Arrays;

public class InsertSort {
    public static void sort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for ( j = i-1; j >= 0 && array[j] > temp; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int [] array = new int[6];
        array[0] = 3;
        array[1] = 2;
        array[2] = 4;
        array[3] = 1;
        array[4] = 6;
        array[5] = 5;
        sort(array);
        for (int x: array
             ) {
            System.out.println(x);
        }
    }
}
