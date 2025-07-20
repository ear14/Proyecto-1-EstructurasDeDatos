public class Coleccion{
    //Importaciones y paquetes
    import java.util.ArrayList;
    //Atributos
    private List<Cuerpo> coleccionCuerpos = new ArrayList<Cuerpo>;
    private List<Figura> coleccionFiguras = new ArrayList<Figura>;

    //Metodos
    public void agregarFigura(Figura figura){
        coleccionFiguras.add(figura);
    }

    public void agregarCuerpo(Cuerpo cuerpo){
        coleccionCuerpos.add(cuerpo);
    }

    public void listarFiguras(){
        for (String figura : this.coleccionFiguras){
            System.out.println(figura.get(i).toString());
        }
    }

    public void listarCuerpos(){
        
    }

    public void calcularAreaTotal(){

    }

    public void calcularPerimetroTotal(){

    }

    public void calcularVolumen(){
        
    }
}