package negocio.cuerpos;
import negocio.figuras.Cuadrado;

public class Cubo extends Cuerpo {

    // Atributo
    private Cuadrado cuadrado;

    // Constructor 
    public Cubo(float ladoCuadrado) {
        super("Cubo");
        this.cuadrado = new Cuadrado(ladoCuadrado);
        agregarFigura(cuadrado);
    }

    //metodo para calcular el volumen
    @Override
    float calcularVolumen() {
        return (float)Math.pow(cuadrado.getBase(), 3);
    }
}