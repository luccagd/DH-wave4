package Modulo3.Aula1;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean ehPrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        System.out.println(ehPrimo ? "O número é primo" : "O número não é primo");
    }
}
