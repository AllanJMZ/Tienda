
package Tienda;

import java.util.Scanner;


public class Menutienda {
    public static void main(String[] args) {
        tienda tienda = new tienda();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Selecciona la operacion que deseas realizar:\n");
        System.out.println("1. Registrar vegetal");
        System.out.println("2. Ver cantidad de un vegetal");
        System.out.println("3. Registrar articulo");
        System.out.println("4. Ver vegetales");
        System.out.println("5. Ver articulos");
        System.out.println("6. Ver todos los productos");
        System.out.print("Selecciona una opcion: ");
        
        int opcion = sc.nextInt();
        sc.nextLine();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingresa el vegetal a registrar: ");
                String nombre = sc.nextLine();
                System.out.print("Ingresa la cantidad a ingresar: ");
                int cant_vegetal = sc.nextInt();
                tienda.agregarVegetal(new Vegetales(nombre, cant_vegetal));
                System.out.println("Vegetal Registrado exitosamente.");                             
            break;
            case 2:
                System.out.print("Nombre del vegetal a buscar: ");
                nombre = sc.nextLine();
                Vegetales vegetales = tienda.buscarVegetales(nombre);
                if (vegetales !=null) {
                    System.out.println("Inventario de " + nombre + ": " + vegetales.getCantidad());
                } else {
                    System.out.println("Vegetal no encontrado");
                }
                break;
            case 3:
                System.out.print("Ingresa el articulo a registrar: ");
                String nombreart = sc.nextLine();
                System.out.print("Ingresa la cantidad a ingresar: ");
                int art_cantidad = sc.nextInt();
                tienda.agregarArticulo(new Articulos(nombreart, art_cantidad));
                System.out.println("Articulo registrado correctamente.");
                break;
            case 4:
                tienda.imprimirVegetales();
                break;
            case 5:
                tienda.imprimirArticulos();
                break;
            case 6:
                tienda.imprimirTodoslosProductos();
                break;
            default:
                System.out.println("Opcion no valida. Intenta de nuevo");
                break;
            }
            
        }
    }
}