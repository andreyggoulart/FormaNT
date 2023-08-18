package FormaNT.Sem2.Ex4.ClassesUsuario;

public class UsuarioStandart implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.15;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Standart";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return String.valueOf(valorFrete * 0.9);
        }
        return String.valueOf(valorFrete);
    }
}
