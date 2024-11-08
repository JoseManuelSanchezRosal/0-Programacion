# Ejercicio 2. Número par o impar. Escribir un programa que pida un número entero al usuario y determine si es par o impar.

num = int(input("Ingrese número: "))
if num % 2 == 0:
    print("Es PAR")
else:
    print("Es IMPAR")