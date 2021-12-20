package Modulo3.Aula2.gerenciamentoFuncionarios;

public class Diretor extends FuncionarioCLT{
    private final double SALARIO_BASE = 15000.0;
    private final double PORCENTAGEM_PARTICIPACAO_LUCROS = 0.03;

    @Override
    public double pagarSalario() {
        return SALARIO_BASE + calcularBonificacao();
    }

    @Override
    public double calcularBonificacao() {
        return PORCENTAGEM_PARTICIPACAO_LUCROS * SALARIO_BASE;
    }
}
