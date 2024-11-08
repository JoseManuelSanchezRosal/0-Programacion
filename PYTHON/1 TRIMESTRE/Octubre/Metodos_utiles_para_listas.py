#MÉTODOS ÚTILES PARA TRABAJAR CON LISTAS

# 1. append(item) Añade un elemento al final de la lista.
#frutas = ["banana", "manzana"]
#frutas.append("naranja")
#print(".append()", frutas)

# 2. extend(iterable) Añade todos los elementos de un iterable (puede ser una lista) al final de la lista
#frutas = ["banana", "manzana"]
#frutas.extend([kiwi, tomate]")
#print(".extend()", frutas)

# 3. insert(index, item) Inserta un elemento en la lista en la posición que indica el índice.
#frutas = ["manzana", "banana"]
#frutas.insert(1, "platano") # Inserto platano en la posición 1 de mi lista
#print(".insert()", frutas)

# 4. remove(item) Elimina el primer elemento especificado de la lista, si no existe, genera un error.
frutas = ["manzana", "banana", "naranja"]
frutas.remove("banana") #Eliminamos el elemento "banana".
print(".remove()", frutas)
