package aula4.saveTheRopa;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vestuario> listaDeVestuarios1 = Arrays.asList(
                new Vestuario("Marca1", "Calça"),
                new Vestuario("Marca2", "Camiseta"),
                new Vestuario("Marca3", "Vestido"));

        List<Vestuario> listaDeVestuarios2 = Arrays.asList(
                new Vestuario("Marca4", "Boné"),
                new Vestuario("Marca5", "Camisa"),
                new Vestuario("Marca6", " Calça"));


        GuardaRoupa guardaRoupa = new GuardaRoupa();
        guardaRoupa.guardarVestuarios(listaDeVestuarios1);
        guardaRoupa.guardarVestuarios(listaDeVestuarios2);

        guardaRoupa.mostrarVestuarios();
    }
}
