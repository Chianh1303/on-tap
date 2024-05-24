public class ex06 {
    public static void main(String[] args) {
//        int a = 9;
        System.out.println(factorial(4));
    }
    public static int factorial(int a) {
        int accumulation = 1;
        for (int i = 1; i <= a; i++) {
            accumulation *= i;

        }
        return accumulation;
    }
}
