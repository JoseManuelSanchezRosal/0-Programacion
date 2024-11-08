# Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error.

dividendo = float(input("Introduce dividendo: "))
divisor = float(input("Introduce divisor: "))

if divisor == 0:
    print("Error, el dividendo no puede ser 0")
else:
    cociente = dividendo / divisor
    print(cociente)