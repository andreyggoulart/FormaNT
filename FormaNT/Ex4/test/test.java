package FormaNT.Ex4.test;

import FormaNT.Ex4.empresa.Motoristas;

public class test {
    public static void main(String[] args) {
        Motoristas motorista1 = new Motoristas("Bolsonaro", "221.717.170-41", "233977296", 17, "Motorista", 3547, "94835306719", "ITK-2460");
        Motoristas motorista2 = new Motoristas("Luis Inácio", "540.241.410-66", "481872723", 13, "Motorista", 3547, "73663835003", "IPB-2288");

        motorista1.Imprimir(motorista1);
        motorista2.Imprimir(motorista2);
        System.out.println("____________________");
    }
}