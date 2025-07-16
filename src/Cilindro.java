public class Cilindro extends Cuerpo {

    private Rectangulo rectangulo;
    private Circulo circulo;

    public Cilindro(float radioCirculo, float baseRectangulo, float alturaRectangulo) {
        super("Cilindro");
        this.rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo); //cuerpo lateral
        this.circulo = new Circulo(radioCirculo); // bases
    }

    @Override
    float calcularVolumen() {
        return (float)(Math.PI * Math.pow(circulo.getRadio(), 2) * rectangulo.getAltura());
    }

    @Override
    public String toString() {
        return super.toString() +  
            "\nFiguras componentes: \n1. " +
            circulo.getNombre() + " - " + circulo.toString() + 
            "\n2. " + rectangulo.getNombre() + " - " + rectangulo.toString();
    }

}