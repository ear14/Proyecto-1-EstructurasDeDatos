package negocio.figuras;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
        this.nombre = "Cuadrado";
    }

    public double getLado() {
        return getBase(); // En un cuadrado, base = altura = lado
    }

    @Override
    public String toString() {
        return super.toString() + " (Lado: " + getLado() + ")";
    }
}
