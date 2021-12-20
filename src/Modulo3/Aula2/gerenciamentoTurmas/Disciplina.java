package Modulo3.Aula2.gerenciamentoTurmas;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return nome;
    }
}
