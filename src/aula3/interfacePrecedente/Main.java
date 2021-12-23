package aula3.interfacePrecedente;

public class Main {
    public static void main(String[] args) {
        Precedente<Pessoa>[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa("lucca", "111.111.111-11");
        pessoas[1] = new Pessoa("vinicius", "222.111.111-11");
        pessoas[2] = new Pessoa("lemuel", "333.111.111-11");
        pessoas[3] = new Pessoa("everton", "444.111.111-11");
        pessoas[4] = new Pessoa("henrique", "555.111.111-11");

        SortUtil.sort(pessoas);

        for (Precedente<Pessoa> precedente: pessoas) {
            System.out.println(precedente.toString());
        }
        System.out.println();

        Precedente<Celular>[] celulares = new Celular[5];
        celulares[0] = new Celular("lucca", "");
        celulares[1] = new Celular("vinicius", "");
        celulares[2] = new Celular("lemuel", "");
        celulares[3] = new Celular("everton", "");
        celulares[4] = new Celular("henrique", "");

        SortUtil.sort(celulares);

        for (Precedente<Celular> precedente: celulares) {
            System.out.println(precedente.toString());
        }
    }
}
