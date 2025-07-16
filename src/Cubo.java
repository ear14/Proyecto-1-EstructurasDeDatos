public class Cubo extends Cuerpo {

    // Atributo
    private Cuadrado cuadrado;

    // Constructor con parámetro
    public Cubo(float ladoCuadrado) {
        super("Cubo");
        this.cuadrado = new Cuadrado(ladoCuadrado);
    }

    @Override
    float calcularVolumen() {
        return (float)Math.pow(cuadrado.getBase(), 3);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFigura componente: " + cuadrado.getNombre() + " - " + cuadrado.toString();
    }
}