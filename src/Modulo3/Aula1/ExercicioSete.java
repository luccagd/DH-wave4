package Modulo3.Aula1;

public class ExercicioSete {
    public static void main(String[] args) {
        int valorEmpresaX = 1130000;
        double crescimentoEmpresaX = 1.48;

        int valorEmpresaY = 18400000;
        double crescimentoEmpresaY = 0.32;

        System.out.println("Empresa X - 01/01/2021 - Valor da empresa: " + String.format("%.2f", valorEmpresaX  / 1000000.0) + "m");
        System.out.println("Empresa Y - 01/01/2021 - Valor da empresa: " + String.format("%.2f", valorEmpresaY  / 1000000.0) + "m");

        int ano = 2022;
        while (valorEmpresaX < valorEmpresaY) {
            valorEmpresaX += valorEmpresaX * crescimentoEmpresaX;
            valorEmpresaY += valorEmpresaY * crescimentoEmpresaY;


            System.out.println("Empresa X - 01/01/" + ano + " - Valor da empresa: " + String.format("%.2f", valorEmpresaX  / 1000000.0) + "m");
            System.out.println("Empresa Y - 01/01/" + ano + " - Valor da empresa: " + String.format("%.2f", valorEmpresaY  / 1000000.0) + "m");
            ano++;
        }
    }
}
