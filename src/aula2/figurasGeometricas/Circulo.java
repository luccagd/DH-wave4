package aula2.figurasGeometricas;

public class Circulo extends FiguraGeometrica {
    private final double PI = 3.14;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * raio * raio;
    }
}
