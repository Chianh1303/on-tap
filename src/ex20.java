import java.util.Arrays;

public class ex20 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 =delete(array);
        System.out.println(Arrays.toString(array2));
    }
    public static int[] delete(int[] array){
        int[] array2= new int[array.length -1];
        for (int i = 1 ; i < array.length;i++){
            array2[i - 1]= array[i];
        }
        return array2;
        }
    }

