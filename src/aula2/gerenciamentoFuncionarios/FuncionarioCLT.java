package aula2.gerenciamentoFuncionarios;

public abstract class FuncionarioCLT {
    private int metasBatidas;

    public abstract double pagarSalario();
    public abstract double calcularBonificacao();

    public int getMetasBatidas() {
        return metasBatidas;
    }

    public void setMetasBatidas(int metasBatidas) {
        this.metasBatidas = metasBatidas;
    }
}
