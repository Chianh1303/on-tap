public class ex15 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 8};
        System.out.println(checkarr(array));

    }
    public static boolean checkarr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }

        }
        return true;
    }
}

