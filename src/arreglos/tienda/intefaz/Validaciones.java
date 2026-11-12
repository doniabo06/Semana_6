package arreglos.tienda.intefaz;

import java.util.Scanner;

public class Validaciones {
    private static Scanner sc = new Scanner(System.in);

    public static String LeerString(String mensaje){
        String nombre;
        do {
            System.out.println(mensaje + ": ");
            nombre = sc.nextLine();
            if (nombre == null || nombre.trim().isEmpty() ){
                System.out.println("El nombre no puede estar vacio ni ser null");
            }
        }   while (nombre == null || nombre.trim().isEmpty());
        return nombre;
    }

    public static int leerEnteroPositivo(String mensaje) {
        int numero = leerEntero(mensaje);

        while (numero <= 0) {
            System.out.println("El número debe ser mayor que cero.");
            numero = leerEntero(mensaje);
        }

        return numero;
    }

    public static int leerEnteroEnRango(String mensaje, int minimo, int maximo) {
        int numero = leerEntero(mensaje);

        while (numero < minimo || numero > maximo) {
            System.out.println("Ingresa un entero entre " + minimo + " y " + maximo + ".");
            numero = leerEntero(mensaje);
        }

        return numero;
    }

    public static double leerDoublePositivo(String mensaje) {
        double numero = leerDouble(mensaje);

        while (numero <= 0) {
            System.out.println("El número debe ser mayor que cero.");
            numero = leerDouble(mensaje);
        }

        return numero;
    }

    public static double leerDoubleEnRango(String mensaje, double minimo, double maximo) {
        double numero = leerDouble(mensaje);

        while (numero < minimo || numero > maximo) {
            System.out.println("Ingresa un número entre " + minimo + " y " + maximo + ".");
            numero = leerDouble(mensaje);
        }

        return numero;
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");

            if (sc.hasNextInt()) {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            }

            sc.nextLine();
            System.out.println("Ingresa un número entero.");
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");

            if (sc.hasNextDouble()) {
                double numero = sc.nextDouble();
                sc.nextLine();

                if (Double.isFinite(numero)) {
                    return numero;
                }
            } else {
                sc.nextLine();
            }

            System.out.println("Ingresa un número decimal válido.");
        }
    }
}
