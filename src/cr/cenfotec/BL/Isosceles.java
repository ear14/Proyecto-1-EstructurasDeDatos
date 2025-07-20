package cr.cenfotec.BL;

public class Isosceles extends Triangulo {
    public Isosceles(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3, "Triangulo Isósceles");
    }

    @Override
    public double calcularArea() {
        float iguales, base;
        if (lado1 == lado2) {
            iguales = lado1;
            base = lado3;
        } else if (lado1 == lado3) {
            iguales = lado1;
            base = lado2;
        } else {
            iguales = lado2;
            base = lado1;
        }
        
        double altura = Math.sqrt(Math.pow(iguales, 2) - Math.pow(base/2.0, 2);
        return (base * altura) / 2;
    }
}
