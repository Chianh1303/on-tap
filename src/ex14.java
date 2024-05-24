public class ex14 {
    public static void main(String[] args) {
        int [] array = {5,2,3,4,5};
        System.out.println(arr(array));

    }
    public static int arr(int[] a){
        int min = 5;
        for (int i =0;i< a.length;i++){
            if (min > a[i]){
                min = a[i];
            }

        }
        return min;
    }
}
