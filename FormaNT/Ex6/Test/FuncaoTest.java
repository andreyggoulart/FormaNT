package FormaNT.Ex6.Test;

import FormaNT.Ex6.Funcao.Funcao;

import java.math.BigDecimal;

public class FuncaoTest {

    public static void main(String[] args) {
        Funcao trocoPagamento = new Funcao();

        BigDecimal custo = new BigDecimal("5324.43");
        BigDecimal pagamento = new BigDecimal("10000.0");

        System.out.println("Custo: R$" + custo);
        System.out.println("Pagamento: R$" + pagamento);

        trocoPagamento.exibirTroco(custo, pagamento);
    }
}
