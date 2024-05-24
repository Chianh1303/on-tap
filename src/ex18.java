import java.util.Arrays;

public class ex18 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4};
//        Buowcs1: Tạo 1 mảng mới = độ dài mảng cũ +1
        int[] newarr = new int[arr.length + 1];
        array(arr, newarr, 100);
        System.out.println(Arrays.toString(newarr));

    }

    public static int[] array(int[] arr, int[] newarr, int x) {
//        Bước 2: coppy giá trị mảng cũ qua mảng mới
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
//            Bước 3: gán phần tử muốn thêm vào mảng mới
            newarr[newarr.length - 1] = x;
        }
        return newarr;
    }
}