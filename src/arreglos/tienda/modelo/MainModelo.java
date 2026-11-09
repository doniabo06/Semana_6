package arreglos.tienda.modelo;

import java.util.Scanner;

public class MainModelo {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            String opcion;

            do {
                System.out.println("\n--- Tienda de juegos ---");
                System.out.println("1. Ingresar juego");
                System.out.println("2. Visualizar juegos");
                System.out.println("3. Comprar");
                System.out.println("4. Vender");
                System.out.println("5. Juegos más vendidos");
                System.out.println("6. Salir");
                System.out.print("Elige una opción: ");

                opcion = teclado.nextLine().trim();

                switch (opcion) {
                    case "1":
                        // Pedir los datos y agregar un juego.
                        break;
                    case "2":
                        // Mostrar los juegos registrados.
                        break;
                    case "3":
                        // Pedir el nombre y la cantidad que se va a comprar.
                        break;
                    case "4":
                        // Pedir el nombre y la cantidad que se va a vender.
                        break;
                    case "5":
                        // Mostrar los juegos más vendidos.
                        break;
                    case "6":
                        System.out.println("Hasta luego.");
                        break;
                    default:
                        System.out.println("Elige un número del 1 al 6.");
                }
            } while (!opcion.equals("6"));
        }
    }
}