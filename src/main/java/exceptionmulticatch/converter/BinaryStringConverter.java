package exceptionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String str) {
        if (str == null) {
            throw new NullPointerException("binaryString null");
        }
        boolean[] booleans = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {

            char character = str.charAt(i);

            if (character != '0' && character != '1') {
                throw new IllegalArgumentException("binaryString not valid");
            }

            booleans[i] = character == '1';
        }
        return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] booleans) {
        if (booleans == null) {
            throw new NullPointerException("booleans null");
        }
        if (booleans.length == 0) {
            throw new IllegalArgumentException("booleans size 0");
        }
        StringBuilder sb = new StringBuilder(booleans.length);

        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }

}
