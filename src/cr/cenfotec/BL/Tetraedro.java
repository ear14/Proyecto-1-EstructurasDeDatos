package cr.cenfotec.BL;

public class Tetraedro extends Cuerpo{
    

    //atributos
    private Equilatero equilatero;

    //constructor
    public Tetraedro(float ladoEquilatero){
        super("Tetraedro");
        this.equilatero = new Equilatero(ladoEquilatero);
        agregarFigura(equilatero)
    }

    //metodo para calcular el volumen
    @Override
    float calcularVolumen() {
        float lado = equilatero.getLado(); 
        return (float)(Math.pow(lado, 3) / (6 * Math.sqrt(2)));
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
