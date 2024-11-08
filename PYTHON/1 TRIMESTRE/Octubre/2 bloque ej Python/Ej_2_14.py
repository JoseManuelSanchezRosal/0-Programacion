# Ejercicio 14. Serie Fibonacci. Escribe un programa que muestre los primeros "N" números de la serie de Fibonacci, donde "N"
# es un número introducido por el usuario.
# SIN ACABAR

def fibonacci(n):
    fib_sequence = []   # Creamos una lista vacía donde iremos añadiendo los números de la suceción de fibonacci
    a = 0   # Definimos primer número de la lista (0)
    b = 1   # Definimos segundo número de la lista (1)
    for i in range(n):
        fib_sequence.append(a)  # Añadimos el número "0" a nuestra lista (en la primera vuelta, en la segunda un "1", y así sucesiv.)
        a, b = b, a + b     # Realizamos el cambio de valor de "a" y "b" para la siguiente vuelta.
        print(a, b) # Nos sacamos por pantalla en cada vuelta el valor de a y b para entender mejor lo que pasa.
    return fib_sequence # Al finalizar el bucle "n" veces, retornamos la lista completada con nuestra secuencia.

# Con la entrada "n" definimos la cantidad de números de la cadena que vamos a querer ver por pantalla
n = int(input("Introduzca número de secuencias de Fibonacci a mostrar: sucesión de fibonacci: "))
print(fibonacci(n))