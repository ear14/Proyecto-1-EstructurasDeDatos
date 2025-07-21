package cr.cenfotec.BL;

public class Isosceles extends Triangulo {
    private float ladoDiferente;
    private float ladoIgual;

    public Isosceles(float ladoDiferente, float ladoIgual) {
        super(ladoIgual, ladoIgual, ladoDiferente, "Triangulo Isósceles");
    }

    @Override
    public double calcularArea() {
        double base = ladoDiferente;
        double altura = Math.sqrt(Math.pow(ladoDiferente, 2) - Math.pow(ladoIgual/2.0, 2));
        return (base * altura) / 2;
    }
}
