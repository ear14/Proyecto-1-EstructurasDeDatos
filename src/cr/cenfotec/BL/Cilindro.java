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
    float calcularVolumen() {
        return (float)(Math.PI * Math.pow(circulo.getRadio(), 2) * rectangulo.getAltura());
    }

    @Override
    public float calcularPerimetro() {
        return (float)(2 * Math.PI * circulo.getRadio());
    }

    @Override
    public float calcularArea() {
        float r = circulo.getRadio();
        float h = rectangulo.getAltura();
        return (float)(2 * Math.PI * r * (r + h));
    }
    
    @Override
    public boolean equals() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equals'");
    }

}
