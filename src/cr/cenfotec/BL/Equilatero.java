package cr.cenfotec.BL;

public class Equilatero extends Triangulo {
    private float lado; 

    public Equilatero(float lado) {
        super("Triángulo Equilatero");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3)/4) * Math.pow(lado, 2);
    }

    public float getLado() {
        return lado;
    }

    @Override
    public double calcularPerimetro() {
       return lado * 3; 
    }

    @Override
    public double calcularAltura() {
        return (Math.sqrt(3) / 2) * lado; 
    }
}