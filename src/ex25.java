import java.util.Arrays;

public class ex25 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] arr2 ={5,6,7,8};
        int[] arr3 = {9,10,11,12};
        int[] arr4 = new int[arr.length +arr2.length+ arr3.length];
        arr4 =merge(arr,arr2,arr3,arr4);
        System.out.println(Arrays.toString(arr4));
    }
    public static int [] merge(int[] a,int[] b, int[] c,int[] d){
        for (int i =0;i<a.length;i++){
            d[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            d[i+a.length]= b[i];
        }
        for (int i =0;i<c.length;i++){
            d[i + a.length + b.length]=c[i];
        }
        return d;
    }
}
