# 6. Ejercicio, busqueda en una lista. Crea un programa que permita al usuario ingresar varios nombres de personas y luego buscar si un nombre
# especifico esta en la lista; sino, indica que no se encontro.

lista_nombres = []

# Recolectar nombres:
while True:
    nombre = input(f"Ingresa nombre o end para acabar: ")
    if nombre == "end":
        break
    lista_nombres.append(nombre)
    
# Buscar nombre en lista
nombre_a_buscar = input(f"Ingresa nombre que quieres buscar: ")

if nombre_a_buscar in lista_nombres:
    print(f"El nombre {nombre_a_buscar} esta en la posicion {lista_nombres.index(nombre_a_buscar)+1}")  # Si el nombre esta en el indice de la lista de nombres, lo sacamos por pantalla (le sumamos 1 porque empieza en 0 la posicion)
else:
    print(f"El nombre {nombre_a_buscar} no se encuentra en la lista")
    