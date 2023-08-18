package FormaNT.Sem2.Ex2.CesarTest;

import FormaNT.Sem2.Ex2.Cesar.CifraCesar;

import java.util.Scanner;

public class CifraTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String text = scanner.nextLine();

        System.out.print("Digite o número de deslocamento: ");
        int shift = scanner.nextInt();

        System.out.print("Escolha a opção (1 para criptografar, 2 para descriptografar): ");
        int option = scanner.nextInt();

        String result;

        if (option == 1) {
            result = CifraCesar.encrypt(text, shift);
        } else if (option == 2) {
            result = CifraCesar.decrypt(text, shift);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("Resultado: " + result);
    }
}
