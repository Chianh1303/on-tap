import java.util.Arrays;

public class ex21 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] arr2 = delete(arr);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] delete(int[] a) {
        int[] arr2 = new int[a.length - 1];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = a[i];
        }
        return arr2;
    }
}
