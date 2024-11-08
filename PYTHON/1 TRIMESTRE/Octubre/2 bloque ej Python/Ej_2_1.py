# Ej 1. Número positivo o negativo. Escribe un programa que pida un número al usuario e indique si el número es positivo, negativo o cero

num = float(input("Introduzca un número: "))

if num == 0:
    print("El número introducido es 0")
elif num < 0:
    print("El número introducido es NEGATIVO")
else:
    print("El número introducido es POSITIVO")
    