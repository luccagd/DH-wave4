package Modulo3.Aula1;

public class ExercicioOito {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10.99, 2);
        Produto produto2 = new Produto("Feijão", 14.49, 1);
        Produto produto3 = new Produto("Tomate", 9.99, 5);

        Produto[] produtos = new Produto[3];
        produtos[0] = produto1;
        produtos[1] = produto2;
        produtos[2] = produto3;

        int contador = 0;
        double total = 0.0;
        for (Produto produto: produtos) {
            System.out.println("Produto " + contador++);
            System.out.println(produto.getNome());
            System.out.println("R$" + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println();

            total += produto.getPreco() * produto.getQuantidade();
        }

        System.out.println("Valor total: R$" + String.format("%.2f", total));
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
