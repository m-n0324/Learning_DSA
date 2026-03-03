package String;
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int beg = 0, end = s.length() - 1;

        while (beg < end) {
            int left = validChar(s.charAt(beg));
            int right = validChar(s.charAt(end));

            if (left == -1) {
                beg++;
            } else if (right == -1) {
                end--;
            } else if (left != (char)right) {
                return false;
            } else {
                beg++;
                end--;
            }
        }
        return true;
    }

    private int validChar(char c) {
        // Numbers
        if (c >= '0' && c <= '9') return c;
        // Lowercase
        if (c >= 'a' && c <= 'z') return c;
        // Uppercase (Normalize to lowercase)
        if (c >= 'A' && c <= 'Z') return c - 'A' + 'a';
        // Non-alphanumeric
        return -1;
    }

    public static void main(String[] args) {
        ValidPalindrome solver = new ValidPalindrome();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";

        System.out.println("Test 1 ('A man...'): " + solver.isPalindrome(test1)); // true
        System.out.println("Test 2 ('race a car'): " + solver.isPalindrome(test2)); // false
        System.out.println("Test 3 (empty): " + solver.isPalindrome(test3)); // true
    }
}