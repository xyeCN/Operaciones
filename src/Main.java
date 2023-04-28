import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Multiplicar dos números");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número:");
                    int numero1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    int numero2 = scanner.nextInt();
                    sumar2(numero1, numero2);
                    break;
                case 2:
                    System.out.println("Ingrese el primer número:");
                    int numero3 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    int numero4 = scanner.nextInt();
                    multiplicar2(numero3, numero4);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            
            System.out.println();
        } while (opcion != 0);
        
        scanner.close();
    }
    
    public static void sumar2(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }
    
    public static void multiplicar2(int a, int b) {
        int resultado = a * b;
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + resultado);
    }
}
