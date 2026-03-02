package String;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        int carry = 0;
        for (int i = 0; i < maxLength; i++) {
            // Calculate indices from the end of the strings
            int aIndex = (a.length() - 1) - i;
            int bIndex = (b.length() - 1) - i;

            // Get the numeric value or 0 if we've run out of characters
            int aVal = aIndex >= 0 ? a.charAt(aIndex) - '0' : 0;
            int bVal = bIndex >= 0 ? b.charAt(bIndex) - '0' : 0;

            int sum = aVal + bVal + carry;
            sb.append(sum % 2); // The binary digit for this position
            carry = sum / 2;    // The carry for the next position
        }

        // If there is still a carry left after the loop
        if (carry == 1) {
            sb.append(carry);
        }

        // Since we appended digits in reverse order, we must reverse before returning
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary solver = new AddBinary();

        // Example 1
        System.out.println("11 + 1 = " + solver.addBinary("11", "1")); // Output: 100

        // Example 2
        System.out.println("1010 + 1011 = " + solver.addBinary("1010", "1011")); // Output: 10101
    }
}