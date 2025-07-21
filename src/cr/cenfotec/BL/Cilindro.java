package cr.cenfotec.BL;

public class Cilindro extends Cuerpo {

    //atributos
    private Rectangulo rectangulo;
    private Circulo circulo;

    //constructor
    public Cilindro(float radioCirculo, float baseRectangulo, float alturaRectangulo) {
        super("Cilindro");
        this.rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo); //cuerpo lateral
        this.circulo = new Circulo(radioCirculo); // bases

        agregarFigura(rectangulo);  //agregamos las figuras al array
        agregarFigura(circulo);
    }


    //metodo para calcular el volumen
    @Override
    double calcularVolumen() {
        return (float)(Math.PI * Math.pow(circulo.getRadio(), 2) * rectangulo.getAltura());
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * circulo.getRadio();
    }

    @Override
    public double calcularArea() {
        float r = circulo.getRadio();
        double h = rectangulo.getAltura();
        return (2 * Math.PI * r * (r + h));
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Cilindro otro = (Cilindro) obj;
        return this.nombre.equals(otro.getNombre()) &&
            this.circulo.getRadio() == otro.circulo.getRadio() &&
            this.rectangulo.getAltura() == otro.rectangulo.getAltura();
    }
}