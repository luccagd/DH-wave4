package aula1;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        int totalPrintado = 0;
        String digitoASerVerificado = String.valueOf(d);
        for (int i = 1; totalPrintado < n; i++) {
            String numero = String.valueOf(i);

            int totalDeDigitosD = 0;
            for (int j = 0; j < numero.length(); j++) {
                if (Character.toString(numero.charAt(j)).equals(digitoASerVerificado)) {
                    totalDeDigitosD++;
                }

                if (totalDeDigitosD == m) {
                    System.out.println(numero);
                    totalPrintado++;
                    break;
                }
            }
        }
    }
}
