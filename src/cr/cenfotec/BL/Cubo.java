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
    float calcularVolumen() {
        return (float)Math.pow(cuadrado.getBase(), 3);
    }

    @Override
    public Float calcularPerimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }

    @Override
    public float calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }

    @Override
    public boolean equals() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equals'");
    }
}