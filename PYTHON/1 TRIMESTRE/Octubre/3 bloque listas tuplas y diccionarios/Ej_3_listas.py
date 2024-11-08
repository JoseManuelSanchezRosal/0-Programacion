# Ejercicio 3. Eliminar duplicados de una lista. Crea una funcion que reciba una lista de numeros con elementos
# duplicados y retorne una nueva lista sin duplicados

lista = [1,1,1,1,2,3,4,5,5,5,5,6,7,8,9,9]

sindupli = list(set(lista)) #Creamos una nueva lista partiendo de la original, pero sin duplicidades. Sin modificar la original.
print(sindupli)
