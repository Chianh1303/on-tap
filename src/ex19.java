import java.util.Arrays;

public class ex19 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

//        first(array,4,3);
        System.out.println(Arrays.toString(first(array, 5, 2)));

    }

    public static int[] first(int[] array, int a, int locate) {
        int[] newarray = new int[array.length + 1];


        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        newarray[a] = locate;
        for (int i = a + 1; i <= array.length; i++) {
            newarray[i] = array[i - 1];
        }
        return newarray;

    }

}

