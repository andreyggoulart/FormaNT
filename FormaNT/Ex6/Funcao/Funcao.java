package FormaNT.Ex6.Funcao;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcao {

    private BigDecimal custo;
    private BigDecimal pagamento;
    private BigDecimal troco;

    public void exibirTroco(BigDecimal custo, BigDecimal pagamento) {
        this.custo = custo;
        this.pagamento = pagamento;
        this.troco = pagamento.subtract(custo);

        System.out.println("------------------------");
        if (troco.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Valor insuficiente. São necessários: R$ " + troco.abs());
        } else {
            System.out.println("Valor do Troco: R$ " + troco.setScale(2, RoundingMode.HALF_EVEN));
            String[] cedulasEMoedas = getCedulasEMoedas(troco);
            imprimirTroco(cedulasEMoedas);
        }
    }

    public static String[] getCedulasEMoedas(BigDecimal troco) {
        BigDecimal[] cedulas = {
                new BigDecimal("200"), new BigDecimal("100"), new BigDecimal("50"), new BigDecimal("20"),
                new BigDecimal("10"), new BigDecimal("5"), new BigDecimal("2")
        };

        BigDecimal[] moedas = {
                new BigDecimal("1.00"), new BigDecimal("0.50"), new BigDecimal("0.25"),
                new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.01")
        };

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < cedulas.length; i++) {
            int quantidade = troco.divideToIntegralValue(cedulas[i]).intValue();
            troco = troco.subtract(cedulas[i].multiply(BigDecimal.valueOf(quantidade)));

            if (quantidade > 0) {
                stringBuilder.append(quantidade).append(" nota(s) de R$ ").append(cedulas[i]).append("\n");
            }
        }

        for (int i = 0; i < moedas.length; i++) {
            int quantidade = troco.divideToIntegralValue(moedas[i]).intValue();
            troco = troco.subtract(moedas[i].multiply(BigDecimal.valueOf(quantidade)));

            if (quantidade > 0) {
                stringBuilder.append(quantidade).append(" moeda(s) de R$ ").append(moedas[i]).append("\n");
            }
        }
        return stringBuilder.toString().split("\n");
    }

    public static void imprimirTroco(String[] cedulasEMoedas) {
        System.out.println("------------------------");
        for (String dinheiro : cedulasEMoedas) {
            System.out.println(dinheiro);
        }
        System.out.println("------------------------");
    }
}
