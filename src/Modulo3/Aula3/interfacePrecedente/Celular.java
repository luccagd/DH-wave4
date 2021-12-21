package Modulo3.Aula3.interfacePrecedente;

public class Celular implements Precedente<Celular> {
    private String proprietario;
    private String numero;

    public Celular(String proprietario, String numero) {
        this.proprietario = proprietario;
        this.numero = numero;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.proprietario.compareToIgnoreCase(celular.proprietario);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "proprietario='" + proprietario + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
