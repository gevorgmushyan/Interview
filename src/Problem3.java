public class Problem3 {

    private static boolean search(int[] array, int x, int startPos, int endPos) {
        if (array.length == 0 || startPos > endPos)
            return false;

        if (array.length == 1)
            return x == array[0];

        if (startPos + 1 == endPos)
            return x == array[startPos] || x == array[endPos];

        int mid = (startPos + endPos) / 2;

        if (x == array[mid])
            return true;

        if (x < array[mid])
            return search(array, x, startPos, mid);
        return search(array, x, mid, endPos);
    }

    public static boolean search(int[] array, int x) {
        if (array == null)
            throw new NullPointerException("int [] array should not be null.");
        return search(array, x, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = new int[]{ /*2, 4, 8, 15, 45, 140*/};
        System.out.println(search(array, 1));
    }
}
