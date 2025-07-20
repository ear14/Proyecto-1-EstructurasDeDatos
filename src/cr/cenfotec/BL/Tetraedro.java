package cr.cenfotec.BL;

public class Tetraedro extends Cuerpo{
    

    //atributos
    private Equilatero equilatero;

    //constructor
    public Tetraedro(float arista){
        super("Tetraedro");
        this.equilatero = new Equilatero(arista);
        agregarFigura(equilatero)
    }

    //metodo para calcular el volumen
    @Override
    float calcularVolumen() {
        float arista = equilatero.getLado(); 
        return (float)(Math.pow(arista, 3) / (6 * Math.sqrt(2)));
    }

    @Override
    public Float calcularPerimetro() {
        float lado = equilatero.getLado();
        return 6 * lado;
    }

    @Override
    public float calcularArea() {
        float lado = equilatero.getLado();
        return (float)(Math.sqrt(3) * Math.pow(lado, 2));
    }

   @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Tetraedro otro = (Tetraedro) obj;
        return this.nombre.equals(otro.getNombre()) &&
            this.equilatero.getLado() == otro.equilatero.getLado();
    }

    @Override
    public String toString() {
        return super.toString() + "Arista del tetraedro: " + equilatero.getLado();
    }

    // Getter
    public float getArista() {
        return arista;
    }
}
