package Modulo4.Aula1.converteParaRomanos;

import java.util.Scanner;

public class Conversor {
    private static String[] algarismosRomanos = {"I", "V", "X", "L", "C", "D", "M"};

    public static String conversor(int digito, int unidadeDecimal) {
        if (digito == 4) {
            return algarismosRomanos[unidadeDecimal] + algarismosRomanos[unidadeDecimal + 1];
        }

        if (digito == 9) {
            return algarismosRomanos[unidadeDecimal] + algarismosRomanos[unidadeDecimal + 2];
        }

        StringBuilder result = new StringBuilder();

        if (digito >= 5) {
            result.append(algarismosRomanos[unidadeDecimal + 1]);
        }

        for (int i = 0; i < digito % 5; i++) {
            result.append(algarismosRomanos[unidadeDecimal]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int unidadeDecimal = 0;
        StringBuilder resultado = new StringBuilder();
        while (numero > 0) {
            int digito = numero % 10;
            resultado.insert(0, conversor(digito, unidadeDecimal));
            unidadeDecimal += 2;
            numero /= 10;
        }

        System.out.println(resultado);
    }
}
