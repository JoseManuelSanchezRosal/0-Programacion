# Imprimir la nota

n = float(input("Introduzca su nota de 0 a: "))

if n >= 0 and n < 5:
    print("Insuficiente.")
elif n >= 5 and n < 6:
    print("Suficiente.")
elif n >= 6 and n < 7:
    print("Bien.")
elif n >= 7 and n < 9:
    print("Notable.")
elif n >= 9 and n < 10:
    print("Sobresaliente.")
elif n == 10:
    print("Matricula de honor.")
else:
    print("Nota no válida")


