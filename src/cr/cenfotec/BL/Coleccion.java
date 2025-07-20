//Importaciones y paquetes

package cr.cenfotec.BL;
import java.util.ArrayList;

public class Coleccion{
    
    //Atributos
    private ArrayList<Cuerpo> coleccionCuerpos = new ArrayList<>();
    private ArrayList<Figura> coleccionFiguras = new ArrayList<>();

    //Metodos
    public void agregarFigura(Figura figura){
        coleccionFiguras.add(figura);
    }

    public void agregarCuerpo(Cuerpo cuerpo){
        coleccionCuerpos.add(cuerpo);
    }

    public void listarFiguras(){
        for (Figura figura : this.coleccionFiguras){
            System.out.println("Figura #" + coleccionFiguras.indexOf(figura)  + ":" + figura.toString());
        }
    }

    public void listarCuerpos(){
        
        for (Cuerpo cuerpo : this.coleccionCuerpos){
            System.out.println("Cuerpo #" + coleccionCuerpos.indexOf(cuerpo) + ":" + cuerpo.toString());
        }
    }

    public void calcularAreaTotal(){
        float areaFigura = 0;
        float areaCuerpo = 0;
        for (Figura figura : this.coleccionFiguras){
                    areaFigura = areaFigura + figura.calcularArea(); 
        }
        for (Cuerpo cuerpo : this.coleccionCuerpos){
                    areaCuerpo += cuerpo.calcularArea(); 
        }
        System.out.println("El area de las figuras es: " + areaFigura + "\n El area de los cuerpos es: " + areaCuerpo); 
    }

    public void calcularPerimetroTotal(){
        float periFigura = 0;
        float periCuerpo = 0;
        for (Figura figura : this.coleccionFiguras){
                    periFigura += figura.calcularPerimetro(); 
        }
        for (Cuerpo cuerpo : this.coleccionCuerpos){
                    periCuerpo += cuerpo.calcularPerimetro(); 
        }
        System.out.println("El perimetro de las figuras es: " + periFigura + "\n El perimetro de los cuerpos es: " + periCuerpo);
    }

    public void calcularVolumen(){
        
    }
}