package FormaNT.Sem2.Ex3.CifraVigenere;

public class CifraVigenere {
    public static String encrypt(String text, String key) {
        StringBuilder encryptedText = new StringBuilder();
        int keyLength = key.length();
        int textLength = text.length();

        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            char keyChar = key.charAt(i % keyLength);

            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                int shift = keyChar - base;
                encryptedText.append((char) (((currentChar - base + shift) % 26) + base));
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String text, String key) {
        StringBuilder decryptedText = new StringBuilder();
        int keyLength = key.length();
        int textLength = text.length();

        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            char keyChar = key.charAt(i % keyLength);

            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                int shift = keyChar - base;
                decryptedText.append((char) (((currentChar - base - shift + 26) % 26) + base));
            } else {
                decryptedText.append(currentChar);
            }
        }

        return decryptedText.toString();
    }
}
