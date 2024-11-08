# Ejercicio 7. Contar números negativos introducidos.
neg = 0
num = int(input("Introduzca número"))
if num < 0:
    num = int(input("Introduzca número"))
    neg = neg + 1
if num == 0:
    print("El número total de negativos introducidos es: ", neg)

