import java.util.Arrays;

public class ex24 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] array ={5,6,7,8};
        int[] arrays= new int[arr.length + array.length];
        arrays= merge(arr,array,arrays);
        System.out.println(Arrays.toString(arrays));
    }
    public static int[] merge(int[] a,int[] b, int[] c){
        for (int i=0;i< a.length;i++){
            c[i]=a[i];
            System.out.println(c[i]);
        }
        for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }

        return c;
    }
}
