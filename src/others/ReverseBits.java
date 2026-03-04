package others;

public class ReverseBits {
    // You need to treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // Shift result to the left to make room for the next bit
            result = result << 1;

            // Get the last bit of n and add it to the result
            result = result | (n & 1);

            // Unsigned right shift n to process the next bit
            n = n >>> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseBits solver = new ReverseBits();

        // Example: Input is a representation of binary 00000010...
        // Using a simple integer to demonstrate
        int input = 43261596; // Binary: 00000010100101000001111010011100
        int output = solver.reverseBits(input);

        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);

        // Printing in Binary to verify the reversal
        System.out.println("Input Binary:  " + String.format("%32s", Integer.toBinaryString(input)).replace(' ', '0'));
        System.out.println("Output Binary: " + String.format("%32s", Integer.toBinaryString(output)).replace(' ', '0'));
    }
}