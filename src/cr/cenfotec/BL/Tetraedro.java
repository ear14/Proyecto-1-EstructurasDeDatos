package cr.cenfotec.BL;

public class Tetraedro extends Cuerpo {

    // atributos
    private Triangulo triangulo;

    // constructor
    public Tetraedro(Triangulo triangulo) {
        super("Tetraedro");
        this.triangulo = triangulo;
        agregarFigura(triangulo);
    }

    // metodo para calcular el volumen
    @Override
    double calcularVolumen() {
        return 1 / 3 * triangulo.calcularArea() * triangulo.calcularAltura();
    }

    @Override
    public double calcularPerimetro() {
        double perimetroTetraedro;
        if (triangulo.getNombre().equals("Triangulo isósceles")){
            Isosceles otroTriangulo = (Isosceles) triangulo; 
            perimetroTetraedro = otroTriangulo.getLadoDiferente() * 3 + otroTriangulo.getLadoIgual() *3; 
        }else if(triangulo.getNombre().equals("Triángulo Equilatero")){
            Equilatero otroTriangulo = (Equilatero) triangulo;
            perimetroTetraedro = otroTriangulo.getLado() * 6; 
        }else{
            Escaleno otroTriangulo = (Escaleno) triangulo;
            perimetroTetraedro = otroTriangulo.lado1 * 2 + otroTriangulo.lado2 *2 + otroTriangulo.lado3 *2;
        }
        return perimetroTetraedro; 
    }

    @Override
    public double calcularArea() {
        return triangulo.calcularArea() * 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Tetraedro otro = (Tetraedro) obj;
        return this.nombre.equals(otro.getNombre()) &&
                this.triangulo.calcularAltura() == otro.triangulo.calcularAltura()
                && this.triangulo.calcularArea() == otro.triangulo.calcularArea()
                && this.triangulo.calcularPerimetro() == otro.triangulo.calcularPerimetro();
    }

    @Override
    public String toString() {
        return super.toString() + " Aristas del tetraedro: " + triangulo.toString();
    }

    // Getter
    public Triangulo getTriangulo() {
        return triangulo;
    }
}