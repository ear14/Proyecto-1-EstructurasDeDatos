public class Tetraedro extends Cuerpo{
    

    //atributos
    private Equilatero equilatero;

    //constructor
    public Tetraedro(float ladoEquilatero){
        super("Tetraedro");
        this.equilatero = new Equilatero(ladoEquilatero);
        agregarFigura(equilatero)
    }

    @Override
    float calcularVolumen() {
        float lado = equilatero.getLado(); 
        return (float)(Math.pow(lado, 3) / (6 * Math.sqrt(2)));
    }
}
