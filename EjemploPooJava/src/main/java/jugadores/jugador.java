package jugadores;


public class jugador {
    //Atributos de clase
    private int vida = 100;
    private int daño;
    private String nombre;
    private String id;

    //Constructor Java
    public jugador(int vida, int daño, String nombre, String id) {
        this.vida = vida;
        this.daño = daño;
        this.nombre = nombre;
        this.id = id;
    }
    //constructor basico
    public jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    //metodo de instancia
    public void saludar(){
        System.out.println("Hola, soy " + this.nombre + " y tengo " + this.vida + " de vida.");
    }

    //metodo de clase
    public static void cambiar_nombre(jugador jugador, String nuevo_nombre){
        jugador.nombre = nuevo_nombre;
        System.out.println("Ahora todos los jugadores se llaman: " + jugador.nombre);
    }

    //metodo estático
    public static void vida_valida(int vida){
        if (vida < 0) {
            System.out.println("La vida no puede ser negativa.");
        } else {
            System.out.println("La vida es válida.");
        }
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Jugador{nombre='" + nombre + "', vida=" + vida + "}";
    }
    //Salida: Jugador{nombre='Aragorn', vida=20}
  
}
