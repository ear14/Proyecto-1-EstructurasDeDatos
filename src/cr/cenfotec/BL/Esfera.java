package cr.cenfotec.BL;

public class Esfera extends Cuerpo{
    

    //atributo 
    private float radio;

    //constructor
    public Esfera(float radioObjeto){
        super("Esfera");
        this.radio = radioObjeto;
    }

    //get
    public float getRadio(){return this.radio;}

    //set
    public void setRadio(float radioNuevo) {this.radio = radioNuevo;}
    
    @Override
    float calcularVolumen() {
        return (float)((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));
    }

    public String toString(){
        return super.toString() + "\nRadio:" + this.radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Esfera otra = (Esfera) obj;
        return Double.compare(otra.radio, radio) == 0;
    }    
}

