import java.util.Arrays;

public class ex17 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] newarray = new int[array.length + 1];

        first(array, newarray, 7);
        System.out.println(Arrays.toString(newarray));

    }
    public static int[] first(int[] array, int[] newarray, int a) {


        for (int i = 0; i < array.length ; i++) {
            newarray[i+1] = array[i];
            newarray[0] = a;
        }
        return newarray;
    }
}
