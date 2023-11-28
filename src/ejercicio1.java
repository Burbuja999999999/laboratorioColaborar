import java.util.Scanner;

public class ejercicio1 {
    public static Scanner kk = new Scanner(System.in);

    public static void main(String[] args) {

        int opciones;

        do {

            System.out.println("Elije un ejericicio: ");
            opciones = kk.nextInt();
            switch (opciones) {
                case 1:
                    ej1();
                    break;
                case 2:
                    ej2();
                    break;
                case 3:
                    ej3();
                    break;
           
                case 0:
                    System.out.println("Saliendo del programa.");
                    System.exit(0); // Sale del programa
                    break;
                default:
                    System.out.println("Opción no válida. Elige un número entre 1 y 14 o 0 para salir.");

            }

        } while (true);

    }
    public static void ej1(){
        System.out.println("Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.");


        System.out.print("Introduce un número: ");
        int numeroLimite = kk.nextInt();


        int contador = 0;


        for (int i = 1; i <= numeroLimite; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        System.out.println("El número de múltiplos de 3 desde 1 hasta: ");

    }

    public static void ej2(){
        System.out.println("Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.");
        System.out.print("Introduce un número entero positivo: ");
        int numero = kk.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
    public static void ej3(){
        System.out.println("Ejercicio 3");
    }
}




