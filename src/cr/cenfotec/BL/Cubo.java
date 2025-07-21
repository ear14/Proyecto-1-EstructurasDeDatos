package cr.cenfotec.BL;

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
    double calcularVolumen() {
        return (float)Math.pow(cuadrado.getBase(), 3);
    }

    @Override
    public double calcularPerimetro() {
       return 12 * cuadrado.getLado();
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(cuadrado.getLado(), 2); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cubo cubo = (Cubo) obj;
        return Double.compare(cubo.getCuadrado().getLado(), cuadrado.getLado()) == 0;
    }

    public String toString() {
        return ("Cuadrado: " + cuadrado);
    }

    public Cuadrado getCuadrado() {
        return  cuadrado;
    }
}