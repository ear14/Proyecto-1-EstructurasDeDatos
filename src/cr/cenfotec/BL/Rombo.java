package cr.cenfotec.BL;

public class Rombo extends Figura {
    private float diagonalMayor;
    private float diagonalMenor;

    public Rombo(float diagonalMayor, float diagonalMenor) {
        super("Rombo");
        if (diagonalMayor <= 0 || diagonalMenor <= 0) {
            throw new IllegalArgumentException("Las diagonales deben ser positivas");
        }
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor/2, 2) + Math.pow(diagonalMenor/2, 2));
        return 4 * lado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rombo rombo = (Rombo) obj;
        return Float.compare(rombo.diagonalMayor, diagonalMayor) == 0 &&
               Float.compare(rombo.diagonalMenor, diagonalMenor) == 0;
    }

    @Override
    public String toString() {
        return String.format("Rombo [Dmayor=%.2f, Dmenor=%.2f]", diagonalMayor, diagonalMenor);
    }

    // Getters
    public float getDiagonalMayor() {
        return diagonalMayor;
    }

    public float getDiagonalMenor() {
        return diagonalMenor;
    }
}
