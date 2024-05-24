import java.util.Arrays;

public class ex23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int x = 6;

        if (check(arr, x)) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }

    }

    public static boolean check(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return true;
            }
        }
        return false;
    }
}

