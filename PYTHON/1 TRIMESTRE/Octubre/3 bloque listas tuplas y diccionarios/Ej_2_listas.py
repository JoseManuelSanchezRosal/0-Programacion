# Ejercicio 2. Filtrar numeros pares.
# 1. Escribe una funcion que reciba una lista de numeros y retorne una nueva listra con solo los numeros pares.
# 2. Utiliza la funcion dentro del archivo principal, pero crea el modulo filtrado.py para la definicion de la funcion.

lista = [1,2,3,4,5,6,7,8,9,10]
listapares = []
for i in lista:
    if i % 2 == 0:
        listapares.append(i)
    
print(lista)
print(listapares)
