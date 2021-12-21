package Modulo3.Aula3.interfacePrecedente;

public class Pessoa implements Precedente<Pessoa> {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.cpf.compareToIgnoreCase(pessoa.cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
