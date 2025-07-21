package cr.cenfotec.UI;

import cr.cenfotec.BL.*;

import java.util.Scanner;

public class Menu {
    private Coleccion coleccion = new Coleccion();;
    private Scanner scanner = new Scanner(System.in);
    private byte opcion;

    public void ejecutarMenu() {
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Agregar figura nueva");
            System.out.println("2. Agregar cuerpo nuevo");
            System.out.println("3. Listar todas las figuras");
            System.out.println("4. Listar todos los cuerpos");
            System.out.println("5. Calcular área total");
            System.out.println("6. Calcular perímetro total");
            System.out.println("7. Calcular volumen total");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Byte.parseByte(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\n===== MENÚ AGREGAR FIGURAS =====");
                    System.out.println("1. Circulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Rombo");
                    System.out.println("4. Triangulo");
                    System.out.print("Seleccione una opción: ");
                    int opcionAgregarFigura = Integer.parseInt(scanner.nextLine());
                    switch (opcionAgregarFigura) {
                        case 1:
                            System.out.println("Ingrese el radio del circulo:");
                            float radio = Float.parseFloat(scanner.nextLine());
                            Circulo circulo = new Circulo(radio);
                            coleccion.agregarFigura(circulo);
                            System.out.println("Figura agregada exitosamente");
                            break;
                        case 2:
                            System.out.println("Ingrese la medida de la base del rectangulo");
                            float base = Float.parseFloat(scanner.nextLine());
                            System.out.println("Ingrese la medida de la altura del rectangulo");
                            float altura = Float.parseFloat(scanner.nextLine());
                            if (base == altura) {
                                System.out.println("Se ha creado un cuadrado, porque la base y la altua son iguales");
                                Cuadrado cuadrado = new Cuadrado(altura);
                                coleccion.agregarFigura(cuadrado);
                            } else {
                                Rectangulo rectangulo = new Rectangulo(base, altura);
                                coleccion.agregarFigura(rectangulo);
                            }
                            System.out.println("Figura agregada exitosamente");
                            break;
                        case 3:
                            System.out.println("Ingrese la medida de la diagonal mayor");
                            float diagonalMayor = Float.parseFloat(scanner.nextLine());
                            System.out.println("Ingrese la medida de la diagonal menor");
                            float diagonalMenor = Float.parseFloat(scanner.nextLine());
                            Rombo rombo = new Rombo(diagonalMayor, diagonalMenor);
                            coleccion.agregarFigura(rombo);
                            System.out.println("Figura agregada exitosamente");
                            break;
                        case 4:
                            System.out.println("Ingrese el primer lado del triángulo");
                            float lado1 = Float.parseFloat(scanner.nextLine());
                            System.out.println("Ingrese el segundo lado del triángulo");
                            float lado2 = Float.parseFloat(scanner.nextLine());
                            System.out.println("Ingrese el tercer lado del triángulo");
                            float lado3 = Float.parseFloat(scanner.nextLine());
                            coleccion.agregarFigura(definirTipoTriangulo(lado1, lado2, lado3));
                            System.out.println("Figura agregada exitosamente");
                            break;
                        default:
                            System.out.println("Esa opción no es compatible");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n===== MENÚ AGREGAR CUERPOS =====");
                    System.out.println("1. Cubo");
                    System.out.println("2. Cilindro");
                    System.out.println("3. Tetraedro");
                    System.out.println("4. Esfera");
                    System.out.print("Seleccione una opción: ");
                    int opcionAgregarCuerpo = Integer.parseInt(scanner.nextLine());
                    switch (opcionAgregarCuerpo) {
                        case 1:
                            System.out.println("Ingrese la medida del lado del cuadrado para formar el cubo:");
                            float lado = Float.parseFloat(scanner.nextLine());
                            Cubo cubo = new Cubo(lado);
                            coleccion.agregarCuerpo(cubo);
                            System.out.println("Cuerpo agregado exitosamente");
                            break;
                        case 2:
                            System.out.println("Ingrese la medida de la base del rectangulo para el cilindro");
                            float baseCilindro = Float.parseFloat(scanner.nextLine());
                            System.out.println("Ingrese la medida de la altura del rectangulo para el cilindro");
                            float alturaCilindro = Float.parseFloat(scanner.nextLine());
                            System.out.println("Ingrese el radio del circulo:");
                            float radioCilindro = Float.parseFloat(scanner.nextLine());
                            Cilindro cilindro = new Cilindro(radioCilindro, baseCilindro, alturaCilindro);
                            coleccion.agregarCuerpo(cilindro);
                            System.out.println("Cuerpo agregado exitosamente");
                            break;
                        case 3:
                            System.out.println("Ingrese la medida de los lados del triángulo del tetraedro");
                            System.out.print("Lado #1:");
                            float ladoTrianguloTetraedro1 = Float.parseFloat(scanner.nextLine());
                            System.out.print("Lado #2:");
                            float ladoTrianguloTetraedro2 = Float.parseFloat(scanner.nextLine());
                            System.out.print("Lado #3:");
                            float ladoTrianguloTetraedro3 = Float.parseFloat(scanner.nextLine());
                            Tetraedro tetraedro = new Tetraedro(definirTipoTriangulo(ladoTrianguloTetraedro1, ladoTrianguloTetraedro2, ladoTrianguloTetraedro3));
                            coleccion.agregarCuerpo(tetraedro);
                            System.out.println("Cuerpo agregado exitosamente");
                            break;
                        case 4:
                            System.out.println("Ingrese el radio de la esfera:");
                            float radioEsfera = Float.parseFloat(scanner.nextLine());
                            Esfera esfera = new Esfera(radioEsfera);
                            coleccion.agregarCuerpo(esfera);
                            System.out.println("Cuerpo agregado exitosamente");
                            break;
                        default:
                            System.out.println("Esa opción no es compatible");
                            break;
                    }

                    break;
                case 3:
                    coleccion.listarFiguras();
                    break;
                case 4:
                    coleccion.listarCuerpos();
                    break;
                case 5:
                    System.out.println("Área total: " + coleccion.calcularAreaTotal());
                    break;
                case 6:
                    System.out.println("Perímetro total: " + coleccion.calcularPerimetroTotal());
                    break;
                case 7:
                    System.out.println("Volumen total: " + coleccion.calcularVolumenTotal());
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 8);
    }
    public Triangulo definirTipoTriangulo(float lado1, float lado2, float lado3){
        if (lado1 == lado2 && lado2 == lado3) {
                return new Equilatero(lado1);
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                float iguales, baseTriangulo;
                if (lado1 == lado2) {
                    iguales = lado1;
                    baseTriangulo = lado3;
                } else if (lado1 == lado3) {
                    iguales = lado1;
                    baseTriangulo = lado2;
                } else {
                    iguales = lado2;
                    baseTriangulo = lado1;
                }
                return new Isosceles(baseTriangulo, iguales);
                
            } else {
                return new Escaleno(lado1, lado2, lado3);
            }
    } 
}