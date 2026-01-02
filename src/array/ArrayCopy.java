package array;
import java.util.Arrays;
class ArrayCopy {

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5 };
        int[] newCopy = copy(original);
        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Copied Array:   " + Arrays.toString(newCopy));
    }

    private static int[] copy(int[] array) {
        int[] newCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newCopy[i] = array[i];
        }
        return newCopy;
    }
}