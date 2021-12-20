package Modulo3.Aula2.gerenciamentoFuncionarios;

public class Analista extends FuncionarioCLT{
    private final double SALARIO_BASE = 4000.0;
    private final double PORCENTAGEM_BONIFICACAO = 0.08;

    @Override
    public double pagarSalario() {
        return SALARIO_BASE + calcularBonificacao();
    }

    @Override
    public double calcularBonificacao() {
        return this.getMetasBatidas() * PORCENTAGEM_BONIFICACAO * SALARIO_BASE;
    }
}
