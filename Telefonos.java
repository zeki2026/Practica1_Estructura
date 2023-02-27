/**
 * Telefonos
 * @param ram capacidad de ram
 * @param procesador
 * @param almacenamiento
 * @param bateria
 * @param pantalla
 * @param marca
 * @param marca
 * @param precio
 * @param existencia
 */
public class Telefonos {
    private int ram;
    private String procesador;
    private int almacenamiento;
    private int bateria;
    private String pantalla;
    private String marca;
    private String modelo;
    private int precio;
    private int existencia;

    public Telefonos(){
        ram = 0;
        procesador = "";
        almacenamiento = 0;
        bateria = 0;
        pantalla = "";
        marca = "";
        modelo = "";
        precio = 0;
        existencia = 0;
    }

    /**
     * Funcion hacer_llamada
     * Imprime texto de la accion
     */
    public void hacer_llamada(){
        System.out.println("Realizando llamada...");
    }
    /**
     * Funcion enviar_mensaje
     * Imprime texto de la accion
     */
    public void enviar_mensaje(){
        System.out.println("Enviando mensaje...");
    }

    /**
     * Funcion instalar_aplicacion
     * Imprime texto de la accion
     */
    public void instalar_aplicacion(){
        System.out.println("Instalando aplicacion...");
    }

    /**
     * Funcion abrir_aplicacion
     * Imprime texto de la accion
     */
    public void abrir_aplicacion(){
        System.out.println("Abriendo aplicacion");
    }

    /**
     * Get cantidad de memoria RAM
     * @return ram
     */
    public int getexistencia(){
        return existencia;
    }
    public void setexistencia(int existencia){
        this.existencia = existencia;
    }

    /**
     * Get cantidad de memoria RAM
     * @return ram
     */
    public int getram(){
        return ram;
    }
    public void setram(int ram){
        this.ram = ram;
    }

    /**
     * Get marca de procesador
     * @return procesador
     */
    public String getprocesador(){
        return procesador;
    }
    public void setprocesador(String procesador){
        this.procesador = procesador;
    }

    /**
     * Get cantidad de almacenamiento
     * @return almacenamiento
     */
    public int getalmacenamiento(){
        return almacenamiento;
    }
    public void setalmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    /**
     * Get capacidad de bateria
     * @return bateria
     */
    public int getabateria(){
        return bateria;
    }
    public void setabateria(int bateria){
        this.bateria = bateria;
    }

    /**
     * Get tamaño de pantalla
     * @return pantalla
     */
    public String getpantalla(){
        return pantalla;
    }
    public void setpantalla(String pantalla){
        this.pantalla = pantalla;
    }

    /**
     * Get marca
     * @return marca
     */
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }

    /**
     * Get modelo
     * @return modelo
     */
    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Get precio
     * @return precio
     */
    public int getprecio(){
        return precio;
    }
    public void setprecio(int precio){
        this.precio = precio;
    }
}