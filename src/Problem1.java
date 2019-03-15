import java.util.Arrays;

public class Problem1 {

    private static void calculateDigits(int[] array, int n) {
        while (n != 0) {
            array[n % 10]++;
            n = n / 10;
        }
    }

    public static boolean areFriendly(int n1, int n2) {
        int[] digits1 = new int[10];
        int[] digits2 = new int[10];

        calculateDigits(digits1, n1);
        calculateDigits(digits2, n2);

        return Arrays.equals(digits1, digits2);
    }

    public static void main(String[] args) {
        System.out.println(areFriendly(100, 100));
    }
}
