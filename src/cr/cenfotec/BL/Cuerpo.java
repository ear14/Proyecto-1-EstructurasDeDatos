package cr.cenfotec.BL;
import java.util.ArrayList;

public abstract class Cuerpo implements Forma {

    // Atributos
    protected String nombre;
    private ArrayList<Figura> figuras_componentes = new ArrayList<>();

    // Constructor
    public Cuerpo(String nombreObjeto) {
        this.nombre = nombreObjeto;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Figura> getFiguras_componentes() {
        return this.figuras_componentes;
    }

    // Métodos de la interfaz Forma
    @Override
    public void imprimirInformacion() {
        System.out.println(toString());
        System.out.println("Volumen: " + calcularVolumen());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    @Override
    public String toString() {
        String info = "Cuerpo: " + this.nombre;
        for (Figura f : figuras_componentes) {
            info += "\nFigura componente: " + f.getNombre() + " - " + f.toString();
        }
        return info;
    }

    @Override
    public abstract boolean equals(Object obj);

    // metodos para agregar figura al cuerpo
    public void agregarFigura(Figura figura) {
        this.figuras_componentes.add(figura);
    }

    // metodos abstractos para implementar en clases hijas
    @Override
    public abstract Float calcularPerimetro();

    @Override
    public abstract float calcularArea();

    public abstract float calcularVolumen();
}