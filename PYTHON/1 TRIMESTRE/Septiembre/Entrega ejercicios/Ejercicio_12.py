# Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares
# desde 1 hasta ese número separados por comas.

numero = int(input("Ingrese un número: "))
for i in range(1, numero, + 2): # Con este bucle: para i en rango (inicio 1, final el numero introducido, le sumamos 2 porque queremos los impares)
    print(i, end=",")  # Con ,end="," se imprime desde el 1 al n introducirdo impar seguidos separados por comas
    