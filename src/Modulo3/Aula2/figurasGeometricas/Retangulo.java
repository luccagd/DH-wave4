package Modulo3.Aula2.figurasGeometricas;

public class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return 0;
    }
}
