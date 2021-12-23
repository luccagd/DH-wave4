package aula1;

import java.util.Scanner;

public class ExercicioQuatro {
    public static boolean ehPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 2; i < n; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}
