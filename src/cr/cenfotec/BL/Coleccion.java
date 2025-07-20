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
        for (Figura figura : this.coleccionFiguras){
            System.out.println("Figura #" + figura.indexOf(i) + ":" + figura.toString());
        }
    }

    public void listarCuerpos(){
        for (Cuerpo figura : this.coleccionFiguras){
            System.out.println("Figura #" + figura.indexOf(i) + ":" + figura.toString());
        }
    }

    public void calcularAreaTotal(){
        double areaFigura;
        double areaCuerpo;
        for (Figura figura : this.coleccionFiguras){
                    areaFigura += figura.calcularArea(); 
        }
        for (Cuerpo cuerpo : this.coleccionCuerpos){
                    areaCuerpo += cuerpo.calcularArea(); 
        }
        System.out.println("El area de las figuras es: " + areaFigura + "\n El area de los cuerpos es: " + areaCuerpo)
    }

    public void calcularPerimetroTotal(){
        double periFigura;
        double periCuerpo;
        for (Figura figura : this.coleccionFiguras){
                    periFigura += figura.calcularPerimetro(); 
        }
        for (Cuerpo cuerpo : this.coleccionCuerpos){
                    periCuerpo += cuerpo.calcularPerimetro(); 
        }
        System.out.println("El perimetro de las figuras es: " + areaFigura + "\n El area de los cuerpos es: " + areaCuerpo)
    }

    public void calcularVolumen(){
        
    }
}