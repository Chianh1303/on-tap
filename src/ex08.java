import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so vao dayt");
        int n = sc.nextInt();
        System.out.println(sum(n));

    }
    public static int sum (int a){
        int tong =0;
        for (int i =1;i<=a;i++){
            tong += i;
        }
        return tong;
    }
}
