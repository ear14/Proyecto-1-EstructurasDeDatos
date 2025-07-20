package cr.cenfotec.BL;

public abstract class Triangulo extends Figura {
    protected float lado1;
    protected float lado2;
    protected float lado3;

    public Triangulo(float lado1, float lado2, float lado3, String tipo) {
        super(tipo);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static Triangulo crear(float lado1, float lado2, float lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Los lados deben ser positivos");
        }
        
        if (lado1 == lado2 && lado2 == lado3) {
            return new Equilatero(lado1);
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return new Isosceles(lado1, lado2, lado3);
        } else {
            return new Escaleno(lado1, lado2, lado3);
        }
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public abstract double calcularArea();

    @Override
    public void imprimirInformacion() {
        System.out.println("=== " + getColor() + " ===");
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    // Getters
    public float getLado1() { return lado1; }
    public float getLado2() { return lado2; }
    public float getLado3() { return lado3; }
}
