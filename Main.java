import java.util.*;

/**
 * Main.java
 * Programa inventario tienda
 * @author Caballero Cruz Ivan Ezequiel(d.zeki2026@gmail.com)
 * GPL v3
 */
public class Main {
    /**
     * Funcion principal
     * @param args Parametros de entrada
     */
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        boolean exit = true;
        int opcion, venta;

        Scanner scan = new Scanner(System.in);
        while(exit==true){
            System.out.println("\t\tBienvenido a " + tienda.getn_tienda());
            System.out.println("1)Agregar Telefono a inventario");
            System.out.println("2)Mostrar inventario");
            System.out.println("3)Vender telefono");
            System.out.println("4)Salir");

            opcion = scan.nextInt();

            switch(opcion){
                case 1: tienda.agregar_telefono();
                        break;
                case 2: tienda.listar_telefonos();
                        break;
                case 3: System.out.print("Telefono vendido: ");
                        venta = scan.nextInt();
                        tienda.vender_telefono(venta);
                        System.out.print("\n\n");
                        break;
                case 4: exit = false;
                        System.out.print("ADIOS!!");
                        break;
                default: System.out.println("Opcion inexistente\n");
            }
        }
        scan.close();
    
    }
}
