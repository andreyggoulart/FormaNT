package FormaNT.Sem2.Ex4.Test;

import FormaNT.Sem2.Ex4.ClassesUsuario.Usuario;
import FormaNT.Sem2.Ex4.ClassesUsuario.UsuarioBase;
import FormaNT.Sem2.Ex4.ClassesUsuario.UsuarioPremium;
import FormaNT.Sem2.Ex4.ClassesUsuario.UsuarioStandart;

public class TestUsuario {
    public static void main(String[] args) {
        double valorProduto = 1000;
        double valorFrete = 20;

        Usuario usuarioBase = new UsuarioBase();
        Usuario usuarioStandart = new UsuarioStandart();
        Usuario usuarioPremium = new UsuarioPremium();

        System.out.println("Usuário Base:");
        System.out.println("Tipo: " + usuarioBase.getTipoUsuario());
        System.out.println("Desconto: " + usuarioBase.getValorDesconto(valorProduto));
        System.out.println("Valor Frete com Desconto: " + usuarioBase.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println();

        System.out.println("Usuário Standart:");
        System.out.println("Tipo: " + usuarioStandart.getTipoUsuario());
        System.out.println("Desconto: " + usuarioStandart.getValorDesconto(valorProduto));
        System.out.println("Valor Frete com Desconto: " + usuarioStandart.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println();

        System.out.println("Usuário Premium:");
        System.out.println("Tipo: " + usuarioPremium.getTipoUsuario());
        System.out.println("Desconto: " + usuarioPremium.getValorDesconto(valorProduto));
        System.out.println("Valor Frete com Desconto: " + usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto));
    }
}
