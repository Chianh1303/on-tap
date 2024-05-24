public class ex10 {
    public static void main(String[] args) {
        String arr = "abcbc";
        if (dao(arr)){
            System.out.println("là chuổi polime");
        }else {
            System.out.println("not");
        }

        }
        public static boolean dao(String nguoc){
        int left = 0;
        int right = nguoc.length()-1;
        while (left <right){
            if (nguoc.charAt(left) != nguoc.charAt(right)) {

                return false;
            }
            left++;
            right--;
        }
        return true;

        }
    }

