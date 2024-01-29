import java.util.Scanner;

public class MainPintura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pintura p1 = new Pintura(250);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Elige una de las opciones:\n" +
                    "1. Esfera\n" +
                    "2. Rectangulo\n" +
                    "3. Cilindro\n" +
                    "4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    double radioesf;
                    System.out.println("Introduce el radio de la esfera: ");
                    radioesf = sc.nextDouble();
                    Forma e1 = new Esfera("Esfera", radioesf);
                    System.out.println("-------------------------------------");
                    System.out.println(e1.toString());
                    System.out.println("Area: " + e1.Area());
                    System.out.println("Pintura necesaria: " + p1.Pintar(e1));
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    double longitud;
                    double ancho;
                    System.out.println("Introduce la longitud del rectangulo: ");
                    longitud = sc.nextDouble();
                    System.out.println("Introduce el ancho del rectangulo: ");
                    ancho = sc.nextDouble();
                    Forma r1 = new Rectangulo("Rectangulo", longitud, ancho);
                    System.out.println("-------------------------------------");
                    System.out.println(r1.toString());
                    System.out.println("Area: " + r1.Area());
                    System.out.println("Pintura necesaria: " + p1.Pintar(r1));
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    double radiocil;
                    double altura;
                    System.out.println("Introduce el radio del cilindro: ");
                    radiocil = sc.nextDouble();
                    System.out.println("Introduce la altura del cilindro: ");
                    altura = sc.nextDouble();
                    Forma c1 = new Cilindro("Cilindro", radiocil, altura);
                    System.out.println("-------------------------------------");
                    System.out.println(c1.toString());
                    System.out.println("Area: " + c1.Area());
                    System.out.println("Pintura necesaria: " + p1.Pintar(c1));
                    System.out.println("-------------------------------------");
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("-------------------------------------");
                    System.out.println("Error digito no válido.");
                    System.out.println("-------------------------------------");
            }
        }

        //El poliformismo se produce cuando se llama al método area, ya que sobreescribe en el método dependiendo de la forma que sea.


        Forma e2 = new Esfera("Esfera", 15);
        System.out.println("-------------------------------------");
        System.out.println(e2.toString());
        System.out.println("Area: " + e2.Area());
        System.out.println("Pintura necesaria: " + p1.Pintar(e2));
        System.out.println("-------------------------------------");

        Forma r2 = new Rectangulo("Rectangulo", 20, 35);
        System.out.println("-------------------------------------");
        System.out.println(r2.toString());
        System.out.println("Area: " + r2.Area());
        System.out.println("Pintura necesaria: " + p1.Pintar(r2));
        System.out.println("-------------------------------------");

        Forma c2 = new Cilindro("Cilindro", 10,30);
        System.out.println("-------------------------------------");
        System.out.println(c2.toString());
        System.out.println("Area: " + c2.Area());
        System.out.println("Pintura necesaria: " + p1.Pintar(c2));
        System.out.println("-------------------------------------");
    }
}
