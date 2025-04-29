import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\r\n\r\n--- MENÚ PRINCIPAL ---\r\n1. Mensaje editado por G y viendo a ver\r\n2. Sumar dos números\r\n3. Mostrar fecha actual\r\n4. Opción extra\r\n5. Otra función\r\n0. Salir\r\nSelecciona una opción: ");

            // Leer opción
            opcion = sc.nextInt();

            // Evaluar opción
            switch (opcion) {
                case 1:
                    mostrarMensaje();
                    break;
                case 2:
                    sumarNumeros(sc);
                    break;
                case 3:
                    mostrarFecha();
                    break;
                case 4:
                    System.out.println("Has elegido la opción 4.");
                    break;
                case 5:
                    System.out.println("Has elegido la opción 5.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
        
        sc.close();
    }

    // FUNCIONES
    public static void mostrarMensaje() {
        System.out.println("¡Hola! Esta es la opción 1.");
    }

    public static void sumarNumeros(Scanner sc) {
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Resultado: " + (a + b));
    }

    public static void mostrarFecha() {
        java.util.Date fecha = new java.util.Date();
        System.out.println("Fecha actual: " + fecha.toString());
    }
}
