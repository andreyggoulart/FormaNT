package FormaNT.Sem2.Ex4.ClassesUsuario;

public interface Usuario {
    Double getValorDesconto(double valorProduto);
    String getTipoUsuario();
    String getValorFreteDesconto(double valorFrete, double valorProduto);
}

