package FormaNT.Ex3;
public class Ex3 {

    public static boolean Palindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        int comprimento = texto.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (texto.charAt(i) != texto.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String texto1 = "amor a roma";
        String texto2 = "Andrey";

        teste(texto1);
        teste(texto2);
    }

    public static void teste(String texto) {
        if (Palindromo(texto)) {
            System.out.println(texto + " é um palíndromo.");
        } else {
            System.out.println(texto + " não é um palíndromo.");
        }
    }
}