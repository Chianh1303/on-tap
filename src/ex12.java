public class ex12 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Tb(array));

    }
    public static double Tb(int[] a){
        double sum = 0;
        for (int i =0;i<a.length;i++){
            sum += a[i];

        }
        double tong = sum / a.length;
        return tong;
    }
}
