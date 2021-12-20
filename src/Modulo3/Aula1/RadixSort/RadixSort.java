package Modulo3.Aula1.RadixSort;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    private static void radixSort(int[] iArr) {
        // Etapa 1 -----------------------------------------------------
        String[] stringsArray = new String[iArr.length];


        //Etapa 2 -----------------------------------------------------
        int maiorValor = iArr[0];
        for (int i: iArr) {
            if (i > maiorValor) {
                maiorValor = i;
            }
        }

        for (int i = 0; i < iArr.length; i++) {
            stringsArray[i] = String.format("%0" + String.valueOf(maiorValor).length() + "d", iArr[i]);
        }

        int posicaoSendoVerificada = String.valueOf(maiorValor).length() - 1;
        while (posicaoSendoVerificada >= 0) {
            //Etapa 3 -----------------------------------------------------
            List<String>[] arrayDeListas = new List[10];
            for (int i = 0; i < arrayDeListas.length; i++) {
                arrayDeListas[i] = new ArrayList<>();
            }


            //Etapa 4 -----------------------------------------------------
            for (String num: stringsArray) {
                int ultimoDigito = Character.getNumericValue(num.charAt(posicaoSendoVerificada));
                arrayDeListas[ultimoDigito].add(num);
            }


            //Etapa 5 -----------------------------------------------------
            String[] s = new String[iArr.length];
            int contador = 0;
            for (List<String> lista : arrayDeListas) {
                for (String string : lista) {
                    s[contador] = string;
                    contador++;
                }
            }

            stringsArray = s;
            posicaoSendoVerificada--;
        }

        System.out.print("Resultado: ");
        for (String s: stringsArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] iArr = { 3, 673, 106, 45, 2, 23};
        radixSort(iArr);

        for (int i: iArr) {
            System.out.println(i + " ");
        }
    }
}
