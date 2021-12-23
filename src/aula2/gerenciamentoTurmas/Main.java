package aula2.gerenciamentoTurmas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação dos estudantes
        Estudante lucca = new Estudante("Lucca", LocalDate.now(), 0001, 9);
        Estudante lemuel = new Estudante("Lemuel", LocalDate.now(), 0002, 9);
        Estudante vinicius = new Estudante("Vinicius", LocalDate.now(), 0003, 9);
        Estudante henrique = new Estudante("Henrique", LocalDate.now(), 0004, 9);
        Estudante everton = new Estudante("Everton", LocalDate.now(), 0005, 9);

        // Criação das disciplinas
        Disciplina matematica = new Disciplina("Matematica", 8);
        Disciplina portugues = new Disciplina("Portugues", 10);
        Disciplina fisica = new Disciplina("Física", 12);
        Disciplina quimica = new Disciplina("Química", 6);
        Disciplina historia = new Disciplina("História", 4);

        // Criação das turmas
        Turma turma6A = new Turma(6, "A");
        turma6A.adicionarDisciplina(matematica);
        turma6A.adicionarDisciplina(portugues);
        turma6A.adicionarEstudante(lemuel);
        turma6A.adicionarEstudante(vinicius);

        Turma turma9A = new Turma(9, "B");
        turma9A.adicionarDisciplina(matematica);
        turma9A.adicionarDisciplina(portugues);
        turma9A.adicionarDisciplina(fisica);
        turma9A.adicionarDisciplina(quimica);
        turma9A.adicionarEstudante(lucca);
        turma9A.adicionarEstudante(henrique);
        turma9A.adicionarEstudante(everton);

        turma6A.imprimirEstudantes();
        turma6A.imprimirDisciplinas();
    }
}
