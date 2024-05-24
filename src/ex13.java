public class ex13 {
    public static void main(String[] args) {
        int[] array = {5, 2, 10, 4, 45, 6};
        System.out.println(arr(array));
    }

    public static int arr(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }
}
