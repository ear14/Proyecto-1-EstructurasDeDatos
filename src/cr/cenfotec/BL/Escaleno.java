package cr.cenfotec.BL;

public class Escaleno extends Triangulo {
    public Escaleno(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3, "Triangulo Escaleno");
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
