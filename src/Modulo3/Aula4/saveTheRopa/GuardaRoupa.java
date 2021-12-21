package Modulo3.Aula4.saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    Map<Integer, List<Vestuario>> guardaRoupa = new HashMap<>();
    Integer identificador = 0;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        guardaRoupa.put(identificador, listaDeVestuario);
        return identificador++;
    }

    public void mostrarVestuarios() {
        for (Map.Entry<Integer, List<Vestuario>> vestuario: guardaRoupa.entrySet()) {
            Integer identificador = vestuario.getKey();
            List<Vestuario> listaDeVestuarios = vestuario.getValue();

            listaDeVestuarios.forEach(item -> System.out.println("Identificador: " + identificador + ", Item: " + item));
            System.out.println();
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        return guardaRoupa.get(id);
    }
}
