package cr.cenfotec.BL;

public class Isosceles extends Triangulo {
    private float ladoDiferente;
    private float ladoIgual;

    public Isosceles(float ladoDiferente, float ladoIgual) {
        super("Triangulo isósceles");
        this.ladoDiferente = ladoDiferente;
        this.ladoIgual = ladoIgual;
        
    }

    @Override
    public double calcularArea() {
        double base = ladoDiferente;
        double altura = Math.sqrt(Math.pow(ladoDiferente, 2) - Math.pow(ladoIgual/2.0, 2));
        return (base * altura) / 2;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Lados: " + ladoDiferente + ", " + ladoDiferente + ", " + ladoIgual);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    @Override
    public String toString() {
        return "Lados: " + ladoDiferente + ", " + ladoDiferente + ", " + ladoIgual;
    }

    @Override
    public double calcularPerimetro() {
        return ladoIgual * 2 + ladoDiferente;
    }
}