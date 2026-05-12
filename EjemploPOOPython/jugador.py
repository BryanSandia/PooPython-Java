

class jugador:
    # Atributos de clase
    vida = 100 
    daño = ""
    nombre = ""
    id = ""

    # metodo equivalente en Python al constructor de Java
    def __init__(self, vida, daño, nombre, id):
        self.vida = vida 
        self.daño = daño
        self.nombre = nombre
        self.id = id
    pass

    #metodo de instancia
    def saludar(self):
        print("Hola, soy " + self.nombre + " y tengo " + str(self.vida) + " de vida.")

    #metodo de clase
    @classmethod
    def cambiar_nombre(cls, nuevo_nombre):
        cls.nombre = nuevo_nombre
        return f"ahora todos los jugadores se llaman {cls.nombre}"
    
    #metodo estatico
    @staticmethod
    def vida(vida):
        if vida < 0:
            return "La vida no puede ser negativa."
        elif vida > 100:
            return "La vida no puede ser mayor a 100."
        else:
            return "La vida es válida."
        
    #Equivalencia ToString() en Java
    def __str__(self):
        return f"Jugador: {self.nombre} (Vida {self.vida})"
        # Salida: Jugador: Aragorn (Vida 20)
   
    # Representación técnica para desarrollo
    def __repr__(self):
        return f"Jugador(nombre='{self.nombre}', vida={self.vida})"
        # Salida: Jugador(nombre='Aragorn', vida=20)
 
  