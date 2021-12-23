package aula1;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int total = 0;
        for (int i = 0; total < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                total++;
            }
        }
    }
}
