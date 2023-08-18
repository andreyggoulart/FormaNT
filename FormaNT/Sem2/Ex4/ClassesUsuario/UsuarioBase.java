package FormaNT.Sem2.Ex4.ClassesUsuario;

public class UsuarioBase implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 300) {
            return valorProduto * 0.05;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Base";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 300) {
            return String.valueOf(valorFrete * 0.95);
        }
        return String.valueOf(valorFrete);
    }
}
