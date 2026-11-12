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
}
