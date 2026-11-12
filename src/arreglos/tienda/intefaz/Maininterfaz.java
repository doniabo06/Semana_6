package arreglos.tienda.intefaz;

import arreglos.tienda.modelo.AppStore;
import arreglos.tienda.modelo.Juego;

import javax.swing.*;
import java.util.Scanner;

import static arreglos.tienda.intefaz.Validaciones.LeerString;

public class Maininterfaz {
    private static Scanner sc = new Scanner(System.in);
    private static AppStore tienda = new AppStore();
    static void main() {
        int opc;
        tienda.incializarDatos();
        do {
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                {
                    IngresarJuego();
                }break;

                case 2:
                {
                    imprimirJuegos();
                }break;

                case 3:
                {

                }break;

                case 4:
                {

                }break;

                case 5:
                {
                    vender();
                }break;

                case 6:
                {

                }break;

                case 7:
                {

                }break;
                default:
                    System.out.println("<Fin del programa");
            }

        } while (opc != 7);

    }
    public static void menu(){
        System.out.println("**********AppStore Udla**********");
        System.out.println("1. Ingresar Juego");
        System.out.println("2. Mostrar juegos");
        System.out.println("3. Buscar juego");
        System.out.println("4. Comprar");
        System.out.println("5. Vender");
        System.out.println("6. Juego más vendido");
        System.out.println("7. Salir");
        System.out.print("Ingrese una opcion: ");
    }

    public static void IngresarJuego() {
        System.out.println("*******Ingreso de datos********");
        String nombre = LeerString("Ingrese el nombre, no puede ser nullo ni blanco ");
        String categoria = LeerString("Ingrese la categoria, no puede ser nullo ni blanco ");
        System.out.print("Ingrese el tamanio: ");
        int tamanio = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el precio: ");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el stock inicial: ");
        int licenciasDisponibles = Integer.parseInt(sc.nextLine());
        if (tienda.agregarJuego(new Juego(nombre, categoria, tamanio, precio, licenciasDisponibles))) {
            JOptionPane.showMessageDialog(null, "Juego ingresado con exito");
        } else {
            JOptionPane.showMessageDialog(null, "No fue posible ingresar el juego");
        }
    }



    public static void imprimirJuegos(){
        Juego juegos[] = tienda.getJuegos();
        for (Juego j : juegos){
            if (j != null){
                System.out.println(j);

            }else {
                System.out.println("No hay mas juegos a mostrar");
                return;
            }
        }
    }


    public static void vender(){
        String nombre = LeerString("Ingrese el nombre, no puede ser nullo ni blanco ");
        System.out.print("Ingrese el cantidad: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        double TotalVenta =tienda.vender(nombre,cantidad);
        if ( TotalVenta == 0){
            System.out.println("No fue posible realizar venta");
        } else {
            System.out.println("Usted ha compredo " +cantidad+ "licencia del juego" +nombre);
            System.out.println("Vslor total: " + TotalVenta);
        }
    }

}