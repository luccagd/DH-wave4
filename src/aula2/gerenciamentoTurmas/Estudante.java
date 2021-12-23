package aula2.gerenciamentoTurmas;

import java.time.LocalDate;

public class Estudante {
    private String nome;
    private LocalDate dataNascimento;
    private int matricula;
    private int serie;

    public Estudante(String nome, LocalDate dataNascimento, int matricula, int serie) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return nome;
    }
}
