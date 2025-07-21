package cr.cenfotec.BL;

public class Equilatero extends Triangulo {
    private float lado; 

    public Equilatero(float lado) {
        super(lado, lado, lado, "Triángulo Equilatero");
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3)/4) * Math.pow(lado1, 2);
    }

    public float getLado() {
        return lado;
    }
}
