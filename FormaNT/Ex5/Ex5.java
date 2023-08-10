package FormaNT.Ex5;

public class Ex5 {

    public static int[][] Matriz(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            matriz[i][i] = 3;
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int tamanho = 10;
        int[][] matrizIdentidade = Matriz(tamanho);

        System.out.println("Matriz Identidade:");
        imprimirMatriz(matrizIdentidade);
    }
}