package cr.cenfotec.BL;

public interface Forma {
    double calcularPerimetro(); 
    double calcularArea();
    void imprimirInformacion();
    boolean equals(Object object);
    String toString();
}