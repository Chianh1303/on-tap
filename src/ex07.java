public class ex07 {
    public static void main(String[] args) {
//        if (prime(5)){
//            System.out.println("là số nt");
//        }else {
//            System.out.println("hõng phãi số nt");
//        }
        String result = prime(12) ? "Day la so nt." : " day hong phai so nt";
        System.out.println(result);

    }

    public static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number -1; i++) {
            if (number % i == 0) {
                return false;

            }
        }

        return true;
    }
}

