package cr.cenfotec.BL;

public class Circulo extends Figura {
    private float radio;

    public Circulo(float radio) {
        super("Circulo");
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circulo otro = (Circulo) obj;
        return Float.compare(otro.radio, radio) == 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Radio: " + radio;
    }
}