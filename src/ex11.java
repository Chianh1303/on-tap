public class ex11 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6};

        System.out.println(sum(num));
    }
    public static int sum(int[] number){
        int a =0;
        for (int i=0;i< number.length;i++ ){
           a  += number[i];
        }
        return a;
    }
}
