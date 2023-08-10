package FormaNT.Ex4.empresa;

public class Motoristas {
    private String Nome;
    private String CPF;
    private String RG;
    private int Idade;

    private String Cargo;
    private double Salario;

    private String CNH;
    private String Placa;

    public Motoristas(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
        this.Nome = nome;
        this.CPF = cpf;
        this.RG = rg;
        this.Idade = idade;
        this.Cargo = cargo;
        this.Salario = salario;
        this.CNH = cnh;
        this.Placa = placaCarro;
    }

    public void Cliente(String nome, String cpf, String rg, int idade) {
        this.Nome = nome;
        this.CPF = cpf;
        this.RG = rg;
        this.Idade = idade;
    }

    public void Empregado(String cargo, double salario) {
        this.Cliente(Nome, CPF, RG, Idade);
        this.Nome = cargo;
        this.Salario = salario;
    }

    public void DadosMotorista(String cnh, String placaCarro) {
        this.Empregado(Cargo, Salario);
        this.CNH = cnh;
        this.Placa = placaCarro;
    }

    public void Imprimir(Motoristas drivers) {
        System.out.println("____________________");
        System.out.println("Nome: " + drivers.Nome);
        System.out.println("Cargo: " + drivers.Cargo);
        System.out.println("Placa do Carro: " + drivers.Placa);
    }
}