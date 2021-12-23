package aula1;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int total = 0;
        for (int i = 1; total < n; i++) {
            if (i % m == 0) {
                System.out.println(i);
                total++;
            }
        }
    }
}
