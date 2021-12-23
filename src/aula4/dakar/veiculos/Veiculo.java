package aula4.dakar.veiculos;

public abstract class Veiculo {
    private double velocidade;

    private double aceleracao;

    private double anguloDeGiro;

    private String placa;

    private double peso;

    private int quantidadeDeRodas;

    public Veiculo() {
    }

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int quantidadeDeRodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }
}
