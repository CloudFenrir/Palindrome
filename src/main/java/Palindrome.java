public class Palindrome {

    static boolean IsPalindrome(String text) {
        String reverse = "";
        if (text.isEmpty()) {
            System.out.println("The was an error with the word provided");
            return false;
        } else {
            for (int i = text.length() - 1; i >= 0; i--) {
                reverse += String.valueOf(text.charAt(i));
            }
        }

        if (reverse.equals(text)) {
            System.out.println("The word provided is a palindrome");
            return true;
        }
        System.out.println("The word provided is not a palindrome");
        return false;

    }

    public static void main(String[] args) {
        IsPalindrome("radar"); //Change here the word to test
    }

}
