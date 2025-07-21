package cr.cenfotec.BL;

public class Escaleno extends Triangulo {
    float lado1;
    float lado2;
    float lado3;

    public Escaleno(float lado1, float lado2, float lado3) {
        super("Triangulo Escaleno");
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public String toString() {
        return "Lados: " + lado1 + ", " + lado2 + ", " + lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

}