package aula3.interfacePrecedente;

public class SortUtil {
    public static <T> void sort(Precedente<T> arr[]) {
        int ultimaPosicaoOrdenada = arr.length - 1;

        while (ultimaPosicaoOrdenada > 0) {
            for (int i = 0; i < ultimaPosicaoOrdenada; i++) {
                if (arr[i].precedeA((T) arr[i + 1]) > 0) {
                    Precedente<T> aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                }
            }

            ultimaPosicaoOrdenada--;
        }
    }
}
