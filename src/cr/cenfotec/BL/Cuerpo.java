package negocio.cuerpos;
import negocio.Forma;
import negocio.figuras.Figura;
import java.util.ArrayList;

public abstract class Cuerpo implements Forma{


    //atributo
    protected String nombre;
    private ArrayList<Figura> figuras_componentes = new ArrayList<>();


    //constructor   
    public Cuerpo(String nombreObjeto){
        this.nombre = nombreObjeto;
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
        String info = "Cuerpo: " + this.nombre;
        for (Figura f : figuras_componentes) {
            info += "\nFigura componente: " + f.getNombre() + " - " + f.toString();
        }
        return info;
    }


    public void agregarFigura(Figura figura){
        this.figuras_componentes.add(figura);
    }

    //metodos abstractos
    abstract float calcularVolumen();


}
    