# Creamos una lista "a"
a = ["jose","jaime","esther"]   #Entre corchetes declaramos los elementos [elem a, elem b, elem c]
print (a[-3])   #Para imprimir la posición -3 (que es el primero)
print (a[0])   #Para imprimir la posición 0 (que es el primero) también

a[0] = "hola"   #Asignar hola al primer elemento, que deja de llamarse jose y pasará a llamarse hola
print(a[0])

del a[1]    #Para borrar algún elemento de mi lista
