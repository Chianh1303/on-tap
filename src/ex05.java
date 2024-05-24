public class ex05 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int luyThua = exponential(a, b);
        System.out.println(luyThua);
    }
//    giai thừa
    public static int exponential(int a, int b) {
        int luyThua = 1;
        for (int i = 1; i < b; i++) {
            luyThua *= a;


        }
        return luyThua;
    }
}
