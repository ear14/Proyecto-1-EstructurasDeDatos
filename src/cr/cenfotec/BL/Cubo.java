package cr.cenfotec.BL;

public class Cubo extends Cuerpo {
    private float arista;

    public Cubo(float arista) {
        super(new Cuadrado(arista)); 
        this.arista = arista;
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
        return String.format("Cubo [arista=%.2f]", arista);
    }

    // Getter
    public float getArista() {
        return arista;
    }
}
