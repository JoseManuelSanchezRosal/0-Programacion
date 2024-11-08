# Programa que realice las siguientes acciones:

#Crea una lista llamada frutas que contenga al menos 5 frutas:
# a) Imprime la lista original.
# b) Añade una nueva fruta a la lista.
# c) Elimina una fruta de la lista.
# d) Imprime la lista fianl.

#métodos o funciones preestablecidas que se pueden utilizar para tu lista (lista."")
'''
.append(elemento) 
.extend(iterable)   
.insert(índice, elemento)   
.remove(elemento)   
.pop(índice)'''

#A
frutas = ["pera","manzana","platano","ciruela","uva"]
for i in frutas:
    print(i)

#B
frutas.append("sandía")
print(frutas)

#C
del frutas[0]

#D
print(frutas)
