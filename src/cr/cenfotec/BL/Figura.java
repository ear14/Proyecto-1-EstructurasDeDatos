package cr.cenfotec.BL;

public abstract class Figura implements Forma {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(toString());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    @Override
    public String toString() {
        return "Figura: " + nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Figura figura = (Figura) obj;
        return nombre.equals(figura.nombre);
    }
}
