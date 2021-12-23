package aula2.gerenciamentoTurmas;

public class Turma {
    private int serie;
    private String codigo;
    private Disciplina[] disciplinas = new Disciplina[10];
    private Estudante[] estudantes = new Estudante[10];

    private int totalDisciplinas = 0;
    private int totalEstudantes = 0;

    public Turma(int serie, String codigo) {
        this.serie = serie;
        this.codigo = codigo;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (totalDisciplinas < disciplinas.length) {
            disciplinas[totalDisciplinas] = disciplina;
            totalDisciplinas++;
        } else {
            System.out.println("Número máximo de disciplinas atingido!");
        }
    }

    public void adicionarEstudante(Estudante estudante) {
        if (totalEstudantes < estudantes.length) {
            estudantes[totalEstudantes] = estudante;
            totalEstudantes++;
        } else {
            System.out.println("Número máximo de estudantes atingido!");
        }
    }

    public void imprimirDisciplinas() {
        System.out.println("--- DISCIPLINAS DA TURMA " + serie + codigo + " ---");
        for (int i = 0; i < totalDisciplinas; i++) {
            System.out.println(disciplinas[i]);
        }
        System.out.println();
    }

    public void imprimirEstudantes() {
        System.out.println("--- ESTUDANTES DA TURMA " + serie + codigo + " ---");
        for (int i = 0; i < totalEstudantes; i++) {
            System.out.println(estudantes[i]);
        }
        System.out.println();
    }
}
