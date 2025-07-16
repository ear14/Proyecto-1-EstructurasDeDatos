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
    public float setRadio(float radioNuevo) {this.radio = radioNuevo;}
    
    @Override
    float calcularVolumen() {
        return (float)((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));
    }

    public String toString(){
        return super.toString() + "\nRadio:" + this.radio;
    }
    
}
