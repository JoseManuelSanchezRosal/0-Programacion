# Funciones iterativas.

# Las que repiten operaciones hasta que se cumple una condicion.

# Son utiles cuando se necesita procesar una coleccion de datos o se desea realizar una tarea repetitiva un numero especifico de veces.

# El factorial de un numero N. Es el producto de todos los numeros enteros positivos menores o iguales a ese numero.
def factorial_iterativo(n):
    a = 1
    for i in range(1, n + 1):
        a = i*a
    return a
#n = int(input("Introduzca n: "))
#print(factorial_iterativo(n))
