# Ejercicio 1. Define una función que reciba una lista de números y retorne una nueva lista de números pares:
# Primero definimos una función para saber si un número es par:
def es_par(num):    #Este "num" es una variable dentro de nuestra función.
    return num % 2 == 0


def numeros_pares(lista):
    pares = []  #Aquí se añaden los elementos pares en orden desde el inicio hasta el final de la lista

    for i in lista:
        if es_par(i):   #Si "i" en cada vuelta es par, lo añade a la lista pares.append(i)
            pares.append(i)
    return pares

    # Aquí definimos la entrada de los números a mano de nuestra lista
def obtener_lista():
    lista = []

    while True:
        numeros = input("Dame números(Termina con fin): ")
        if numeros.lower() == "fin":
            break
        numero = int(numeros)
        lista.append(numero)

    return lista

lista_usuario = obtener_lista()
print(f"la lista original es:{lista_usuario} ")
print(f"La lista final es: ", numeros_pares(lista_usuario))

    # Aquí definimos nuestra lista.
listilla = [1, 2, 3, 4, 5, 6]
print(numeros_pares(listilla))  #Imprimimos los "números pares" que hay en "listilla"

# Ejercicio 2. Crea una función que reciba una cadena de texto y cuente cuántas palabras tiene:
# Ejercicio 3. Escribe una función que utilice *args y **kwargs para aceptar múltiples parámetros y los imprima como formato:

# MODULARIDAD

import this