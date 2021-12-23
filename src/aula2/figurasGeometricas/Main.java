package aula2.figurasGeometricas;

public class Main {
    public static double areaMedia(FiguraGeometrica arr[]) {
        int quantidadeDeFiguras = arr.length;

        double somaDasAreas = 0.0;
        for (FiguraGeometrica figura: arr) {
            somaDasAreas += figura.area();
        }

        return somaDasAreas / quantidadeDeFiguras;
    }

    public static void main(String[] args) {
        FiguraGeometrica[] figurasGeometricas = new FiguraGeometrica[3];
        figurasGeometricas[0] = new Circulo(2);
        figurasGeometricas[1] = new Triangulo(4, 5);
        figurasGeometricas[2] = new Retangulo(4, 3);

        System.out.printf("Áera média das figuras: %.2f", areaMedia(figurasGeometricas));
    }
}
