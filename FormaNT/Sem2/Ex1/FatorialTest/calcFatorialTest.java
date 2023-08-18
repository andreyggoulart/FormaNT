package FormaNT.Sem2.Ex1.FatorialTest;

import FormaNT.Sem2.Ex1.Fatorial.calcFatorial;

public class calcFatorialTest{

    public static void main(String[] args){
        int numero = 8;

        calcFatorial calculadora = new calcFatorial();
        long resultado = calculadora.calcularFatorial(numero);

        System.out.println("O fatorial de "+numero+" é: "+resultado);
    }
}
