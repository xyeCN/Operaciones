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
            System.out.println("1. Sumar números");
            System.out.println("2. Multiplicar números");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de números a sumar:");
                    int cantidadSumar = scanner.nextInt();
                    int[] numerosSumar = ingresarNumeros(cantidadSumar);
                    sumarN(numerosSumar);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de números a multiplicar:");
                    int cantidadMultiplicar = scanner.nextInt();
                    int[] numerosMultiplicar = ingresarNumeros(cantidadMultiplicar);
                    multiplicarN(numerosMultiplicar);
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
    
    public static int[] ingresarNumeros(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }
        
        return numeros;
    }
    
    public static void sumarN(int[] numeros) {
        int resultado = 0;
        
        for (int numero : numeros) {
            resultado += numero;
        }
        
        System.out.print("La suma de los números ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i != numeros.length - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" es: " + resultado);
    }
    
    public static void multiplicarN(int[] numeros) {
        int resultado = 1;
        
        for (int numero : numeros) {
            resultado *= numero;
        }
        
        System.out.print("La multiplicación de los números ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i != numeros.length - 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" es: " + resultado);
    }
}
