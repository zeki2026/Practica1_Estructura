import java.util.*;

/**
 * Clase tienda
 * @param Telefono clase de telefono
 * @param N_tienda nombre de la tienda
 * @param telefono_e telefonos en existencia
 */
public class Tienda {
    private Telefonos telefono[] = new Telefonos[100];
    private String n_tienda;
    private int telefonos_e;
    
        
    /**
     * contructor
     * @param Tienda valor de tienda
     */
    public Tienda(){
        for(int i=0; i < telefono.length ; i++){
            telefono[i] = new Telefonos();
        }

        n_tienda="Zeki tecnology :3";
        telefonos_e = 0;
    }

    /**
     * Funcion agregar_telefono
     * Agrega un telefono al inventario
     */
    void agregar_telefono(){
        int ram, precio, almacenamiento, bateria;
        int actual = 0;
        String procesador, marca, modelo, pantalla;

        for(int i = 0; i < telefono.length; i++){
            if(telefono[i].getexistencia() != 0)continue;
            actual = i;
            break;
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("\t\tIngresar datos del telefono\nCantidad de memoria RAM: ");
        ram = scan.nextInt();
        scan.nextLine();//limpiar buffer//limpiar buffer cuando pasemos de recibir numeros a texto

        System.out.println("Marca de procesador: ");
        procesador = scan.nextLine();

        System.out.println("Cantidad de almacenamiento: ");
        almacenamiento = scan.nextInt();

        System.out.println("Capacidad de bateria: ");
        bateria = scan.nextInt();
        scan.nextLine();//limpiar buffer cuando pasemos de recibir numeros a texto

        System.out.println("Tamaño de pantalla: ");
        pantalla = scan.nextLine();

        System.out.println("Marca: ");
        marca = scan.nextLine();

        System.out.println("Modelo: ");
        modelo = scan.nextLine();

        System.out.println("Precio: ");
        precio = scan.nextInt();

        telefono[actual].setram(ram);
        telefono[actual].setprocesador(procesador);
        telefono[actual].setalmacenamiento(almacenamiento);
        telefono[actual].setabateria(bateria);
        telefono[actual].setpantalla(pantalla);
        telefono[actual].setmarca(marca);
        telefono[actual].setmodelo(modelo);
        telefono[actual].setprecio(precio);

        telefono[actual].setexistencia(1);//marcamos que existe en inventario

        if(actual == 99){
            scan.close();
        }
    }

    /**
     * Funcion listar_telefonos
     * Muestra el inventario de la tienda
     */
    public void listar_telefonos(){
        int n=1;
        for(int i = 0; i < telefono.length; i++){
            if(telefono[i].getexistencia()==1){
                System.out.println("\t\tTelefono "+ n + ":\n" + "Cantidad de memoria RAM: " + telefono[i].getram() + "GB");
                System.out.println("Marca de procesador: " + telefono[i].getmarca());
                System.out.println("Cantidad de almacenamiento: " + telefono[i].getalmacenamiento() + "GB");
                System.out.println("Capacidad de bateria: " + telefono[i].getabateria() + "mAh");
                System.out.println("Tamaño de pantalla: " + telefono[i].getpantalla() + "px");
                System.out.println("Marca: " + telefono[i].getmarca());
                System.out.println("Modelo: " + telefono[i].getmodelo());
                System.out.println("Precio: " + telefono[i].getprecio()+"$\n\n");
                n++;
            }
        }
    }

    
    /**
     * Funcion vender_telefono
     * elimina un telefono del inventario
     * @param vendido
     */
    public void vender_telefono(int vendido){
        telefono[vendido-1].setexistencia(0);
    }

    /*
     * Seters y geters
     */
    Telefonos gettelefono(int num){
        return telefono[num];
    }
    void settelefono(int num, Telefonos telefono){
        this.telefono[num] = telefono;
    }

    String getn_tienda(){
        return n_tienda;
    }
    void setn_tienda(String n_tienda){
        this.n_tienda = n_tienda;
    }

    int gettelefonos_e(){
        return telefonos_e;
    }
    void settelefonos_e(int telefonos_e){
        this.telefonos_e = telefonos_e;
    }
        
}
