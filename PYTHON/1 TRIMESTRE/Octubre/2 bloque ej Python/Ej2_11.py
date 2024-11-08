# Ejercicio 11: Números primos en un rango. Escribe un programa que muestre todos los números primos
# entre dos números introducidos por el usuario.

def es_primo(numero):
    if numero <= 1:
        return False
    for i in range(2, int(numero * 0.5) + 1):
        if numero % i == 0:
            return False
    return True

# Solicitar al usuario que ingrese un número
numero = int(input("Introduce un número: "))

if es_primo(numero):
    print(f"{numero} es un número primo.")
else:
    print(f"{numero} no es un número primo.")
    
    