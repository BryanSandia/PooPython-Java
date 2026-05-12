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

        jugador p2 = new jugador(100, 50, "Legolas", "ID002");
        System.out.println(p2);
    }
}

