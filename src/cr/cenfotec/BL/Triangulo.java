package cr.cenfotec.BL;

public abstract class Triangulo extends Figura {

    public Triangulo(String nombre) {
        super(nombre);
    }

    @Override
    public abstract double calcularPerimetro();

    @Override
    public abstract double calcularArea();

    public abstract double calcularAltura();
}