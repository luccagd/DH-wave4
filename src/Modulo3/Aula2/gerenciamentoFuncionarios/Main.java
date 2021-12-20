package Modulo3.Aula2.gerenciamentoFuncionarios;

public class Main {
    public static void main(String[] args) {
        FuncionarioCLT tecnico1 = new Tecnico();
        tecnico1.setMetasBatidas(4);

        FuncionarioCLT tecnico2 = new Tecnico();
        tecnico2.setMetasBatidas(1);

        FuncionarioCLT gerente1 = new Gerente();
        gerente1.setMetasBatidas(3);

        System.out.println("Salário do técnico 1: " + tecnico1.pagarSalario());
        System.out.println("Salário do técnico 2: " + tecnico2.pagarSalario());
        System.out.println("Salário do gerente 1: " + gerente1.pagarSalario());
    }
}
