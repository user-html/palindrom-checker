public class testcase2 {

        public static void main(String[] args) {

            String word = "madam";


            if (isPalindrome(word)) {
                System.out.println("Is it a Palindrome? :" + " True ");
            } else {
                System.out.println("Is it a Palindrome? :" + "False");
            }
        }


        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

