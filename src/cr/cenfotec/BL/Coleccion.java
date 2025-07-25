
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
        int contador = 1;
        for (Figura figura : this.coleccionFiguras){
            System.out.println("Figura #" + contador  + ":");
            figura.imprimirInformacion();
            contador++;
        }
    }

    public void listarCuerpos(){
        int contador = 1;
        for (Cuerpo cuerpo : this.coleccionCuerpos){
            System.out.println("Cuerpo #" + contador + ":");
            cuerpo.imprimirInformacion();
            contador++;
        }
    }

    public double calcularAreaTotal(){
        double areaFigura = 0;
        double areaCuerpo = 0;
        for (Figura figura : this.coleccionFiguras){
                    areaFigura += figura.calcularArea(); 
        }
        for (Cuerpo cuerpo : this.coleccionCuerpos){
                    areaCuerpo += cuerpo.calcularArea(); 
        }
        return areaCuerpo + areaFigura;
    }

    public double calcularPerimetroTotal(){
        double periFigura = 0;
        double periCuerpo = 0;
        for (Figura figura : this.coleccionFiguras){
                    periFigura += figura.calcularPerimetro(); 
        }
        for (Cuerpo cuerpo : this.coleccionCuerpos){
                    periCuerpo += cuerpo.calcularPerimetro(); 
        }
        return periCuerpo + periFigura;
    }

    public double calcularVolumenTotal(){
        double volumenTotal = 0;
        for (Cuerpo cuerpo : coleccionCuerpos) {
            volumenTotal += cuerpo.calcularArea();
        }
        return volumenTotal; 
    }
}