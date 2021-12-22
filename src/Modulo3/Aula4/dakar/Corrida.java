package Modulo3.Aula4.dakar;

import Modulo3.Aula4.dakar.socorristas.SocorristaCarro;
import Modulo3.Aula4.dakar.socorristas.SocorristaMoto;
import Modulo3.Aula4.dakar.veiculos.Carro;
import Modulo3.Aula4.dakar.veiculos.Moto;
import Modulo3.Aula4.dakar.veiculos.Veiculo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Corrida {
    private double distancia;

    private double premioEmDolares;

    private String nome;

    private int quantidadeDeVeiculosPermitidos;

    private List<Veiculo> listaDeVeiculos;

    private SocorristaCarro socorristaCarro = new SocorristaCarro();

    private SocorristaMoto socorristaMoto = new SocorristaMoto();

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        if (listaDeVeiculos.size() < quantidadeDeVeiculosPermitidos) {
            listaDeVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, patente));
        }
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        if (listaDeVeiculos.size() < quantidadeDeVeiculosPermitidos) {
            listaDeVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, patente));
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaDeVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        for (Veiculo veiculo: listaDeVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                listaDeVeiculos.remove(veiculo);
                break;
            }
        }
    }

    public Veiculo determinaVencedor() {
        Veiculo veiculoVencedor = null;

        double maiorPontuacao = 0;
        for (Veiculo veiculo : listaDeVeiculos) {
            double pontuacao = veiculo.getVelocidade() * veiculo.getAceleracao() / (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getQuantidadeDeRodas() * 100));
            if (pontuacao > maiorPontuacao) {
                veiculoVencedor = veiculo;
            }
        }

        return veiculoVencedor;
    }

    public void socorrerCarro(String documento) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getPlaca().equals(documento)) {
                socorristaCarro.socorrer((Carro) veiculo);
                break;
            }
        }
    }

    public void socorrerMoto(String documento) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getPlaca().equals(documento)) {
                socorristaMoto.socorrer((Moto) veiculo);
                break;
            }
        }
    }
}
