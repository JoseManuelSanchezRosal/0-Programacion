 # MANEJO DE LISTAS, AGREGAR, QUITAR, CONTAR, LONGITUD(LEN), ELIMINAR ELEMENTOS DE LISTA
 
 #CREAR UNA LISTA
lista = [1, 3, 5, "hola", "pepe", 12]
print(lista)

lista.append(23)
print(lista)

lista2 = [34, 45, 56, "Holacapullo"]
lista.extend(lista2)
print(lista)
print(lista2)

lista2.clear()
print(lista2)

print(lista.pop(3))
print(lista)

lista.reverse()
print(lista)

lista.sort()
print(lista)


