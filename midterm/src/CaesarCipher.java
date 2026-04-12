public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            result.append((char) (c + shift));
        }

        return result.toString();
    }
}