package aula1;

public class ExercicioSeis {
    public static void imprimeOrdenacaoCrescente(Integer[] vetor) {
        int ultimaPosicaoNaoOrdenada = vetor.length - 1;
        while (ultimaPosicaoNaoOrdenada > 0) {
            for (int i = 0; i < ultimaPosicaoNaoOrdenada; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }

            ultimaPosicaoNaoOrdenada--;
        }

        System.out.print("Ordenação crescente: ");
        for (int n: vetor) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void imprimeOrdenacaoDecrescente(Integer[] vetor) {
        int ultimaPosicaoNaoOrdenada = vetor.length - 1;
        while (ultimaPosicaoNaoOrdenada > 0) {
            for (int i = 0; i < ultimaPosicaoNaoOrdenada; i++) {
                if (vetor[i] < vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }

            ultimaPosicaoNaoOrdenada--;
        }

        System.out.print("Ordenação decrescente: ");
        for (int n: vetor) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] vetor = {52, 10, 85, 1324, 01, 13, 63, 12, 127};
        imprimeOrdenacaoCrescente(vetor);
        imprimeOrdenacaoDecrescente(vetor);
    }
}
