public class Problem4 {

    public static String encoding(String str) {
        if (str.length() == 0 || str.length() == 1)
            return str;

        StringBuilder encodingStr = new StringBuilder();
        Character ch = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (ch.equals(str.charAt(i)))
                count++;
            else {
                if (count == 1)
                    encodingStr.append(ch);
                else {
                    encodingStr.append("" + count).append(ch);
                    count = 1;
                }
                if(i == str.length() - 1)
                    encodingStr.append(str.charAt(i));
                ch = str.charAt(i);
            }
        }
        return encodingStr.toString();
    }

    public static String decoding(String str) {
        StringBuilder decodingStr = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count = count * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                decodingStr.append(
                        ("" + str.charAt(i)).repeat(count == 0 ? 1 : count)
                );
                count = 0;
            }
        }
        return decodingStr.toString();
    }

    public static boolean isCompressed(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                return true;
        }
        return false;
    }

    public static String decodeOrEncode(String str) {
        if (isCompressed(str))
            return decoding(str);
        return encoding(str);
    }

    public static void main(String[] args) {
        System.out.println(decodeOrEncode(""));
        System.out.println(decodeOrEncode("WWWWBWWWWWBBBWWWWWWWWWWB"));
        System.out.println(decodeOrEncode("4WB5W3B10WB"));
    }
}
