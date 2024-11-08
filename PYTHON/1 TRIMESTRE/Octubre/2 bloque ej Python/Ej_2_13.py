# Ejercicio 13. Adivinar un número. Escribir un programa que elija un número aleatorio entre 1 y 100 y permita al usuario adivinarlo.
# El programa debe dar pistas de si el número introducido es mayor o menor que el número secreto.
import random

aleatorio = random.randint(1, 100)
print(aleatorio)
num = int(input("Introduzca número del 1 al 100: "))
if aleatorio == num:
    print("ACERTASTE!!!")
if aleatorio < num:
    print("Te has pasado")
if aleatorio > num:
    print("Te has quedado corto")
    
# AVERIGUAR LA MANERA PARA QUE TE PIDA EL NÚMERO HASTA QUE ACIERTE