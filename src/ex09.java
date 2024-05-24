import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        String dao = "abccba";
        System.out.println(nguoc(dao));

    }

    public static String nguoc(String a) {
        String daoNguoc = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            daoNguoc += a.charAt(i);
        }
        return daoNguoc;
    }
}
