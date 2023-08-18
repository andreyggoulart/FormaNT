package FormaNT.Sem2.Ex3.VigenereTest;

import FormaNT.Sem2.Ex3.CifraVigenere.CifraVigenere;

import java.util.Scanner;

public class VigenereTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String text = scanner.nextLine();

        System.out.print("Digite a palavra chave: ");
        String key = scanner.nextLine();

        System.out.print("Escolha a opção (1 para criptografar, 2 para descriptografar): ");
        int option = scanner.nextInt();

        String result;

        if (option == 1) {
            result = CifraVigenere.encrypt(text, key);
        } else if (option == 2) {
            result = CifraVigenere.decrypt(text, key);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("Resultado: " + result);
    }
}

