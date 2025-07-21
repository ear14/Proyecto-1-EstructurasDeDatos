package cr.cenfotec.BL;

public class Cubo extends Cuerpo {
    private Cuadrado cuadrado;

    // Constructor 
    public Cubo(float ladoCuadrado) {
        super("Cubo");
        this.cuadrado = new Cuadrado(ladoCuadrado);
        agregarFigura(cuadrado);
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(arista, 3);
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(arista, 2); 
    }

    @Override
    public double calcularPerimetro() {
        return 12 * arista; 
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cubo cubo = (Cubo) obj;
        return Float.compare(cubo.arista, arista) == 0;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n Cuadrado: " + cuadrado);
    }

    // Getter
    public Cuadrado getCuadrado() {
        return  cuadrado;
    }
}
