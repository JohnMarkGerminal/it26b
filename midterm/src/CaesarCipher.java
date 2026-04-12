public class CaesarCipher {

    private static final int SHIFT = 3;

    // ENCRYPT
    public static String encrypt(String text) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            sb.append((char)(c + SHIFT));
        }

        return sb.toString();
    }

    // DECRYPT
    public static String decrypt(String text) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            sb.append((char)(c - SHIFT));
        }

        return sb.toString();
    }
}