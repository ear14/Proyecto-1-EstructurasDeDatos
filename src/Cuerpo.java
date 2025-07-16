

public abstract class Cuerpo implements Forma{


    //atributo
    protected String nombre;
    protected Figura figura;


    //constructor   no se como poner figura
    public Cuerpo(String nombreObjeto){
        this.nombre = nombreObjeto;
        //this.figura = figuraObjeto;
    }

    //getters
    public String getNombre() {return this.nombre;}
    public Figura getFigura() {return this.figura;}


    //metodos de interfaz
    public void imprimirInformacion(){
        System.out.println(toString());
        System.out.println("Volumen: " + calcularVolumen());
    }

    public boolean equals(String nombreComparar){return this.nombre.equals(nombreComparar);}

    public String toString(){
        return "Cuerpo: " + this.nombre;
    }


    //metodos abstractos

    abstract float calcularVolumen();


}
    