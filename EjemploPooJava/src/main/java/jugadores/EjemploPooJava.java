package jugadores;

/**
 *
 * @author Bryan Tacuri
 */
public class EjemploPooJava {

    public static void main(String[] args) {
        jugador p = new jugador("Aragorn", 20);
        // Se llama automáticamente al imprimir el objeto
        System.out.println(p); 
        // Salida: Jugador{nombre='Aragorn', vida=20}
    }
}

