package cr.cenfotec.BL;


public class Rectangulo extends Figura {
    private Float base;
    private Float altura;

    public Rectangulo(Float base, Float altura) {
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
    public Float calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public float calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Base: " + base + " \n Altura: " + altura;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Rectangulo otro = (Rectangulo) obj;
        return Double.compare(otro.base, base) == 0 && 
               Double.compare(otro.altura, altura) == 0;
    }

}