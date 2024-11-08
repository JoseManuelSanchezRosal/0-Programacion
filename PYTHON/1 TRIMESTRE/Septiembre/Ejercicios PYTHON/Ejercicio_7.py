# Programa que solicite al usuario un número y le reste el 15%, almacenarlo todo en una única variable y mostrar el resultado en pantalla.
# Usando 2 variables:
num = int(input("Introduzca número n:"))
descuento =  (num * 15 / 100)
print ("Descontando el 15% queda:", num - descuento)

# Usando 1 variable ejemplo 1:
n = float(input("Introduce un número:"))
print("tras el descuento del 15% sería:", n - (n * 0.15))

# Usando 1 variable ejemplo 2:
n = float(input("Introduce un número:"))
print("tras el descuento del 15% sería:", n - (n * 0.85))