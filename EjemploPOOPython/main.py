
import jugador


jugador = jugador.jugador(100, 20, "Aragorn", "001")

print("Nombre:", jugador.nombre) #Atributo público
jugador.saludar() #Método de instancia
print(str(jugador)) #Método __str__

######SALIDA######
# Nombre: Aragorn
# Hola, soy Aragorn y tengo 100 de vida.
# Jugador: Aragorn (Vida 100)