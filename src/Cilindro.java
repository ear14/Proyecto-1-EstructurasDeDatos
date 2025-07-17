public class Cilindro extends Cuerpo {

    //atributos
    private Rectangulo rectangulo;
    private Circulo circulo;

    //constructor
    public Cilindro(float radioCirculo, float baseRectangulo, float alturaRectangulo) {
        super("Cilindro");
        this.rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo); //cuerpo lateral
        this.circulo = new Circulo(radioCirculo); // bases

        agregarFigura(rectangulo);
        agregarFigura(circulo);
    }

    @Override
    float calcularVolumen() {
        return (float)(Math.PI * Math.pow(circulo.getRadio(), 2) * rectangulo.getAltura());
    }

}