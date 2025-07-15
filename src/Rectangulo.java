package negocio.figuras;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Altura: " + altura;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Rectangulo otro = (Rectangulo) obj;
        return Double.compare(otro.base, base) == 0 && 
               Double.compare(otro.altura, altura) == 0;
    }
}
