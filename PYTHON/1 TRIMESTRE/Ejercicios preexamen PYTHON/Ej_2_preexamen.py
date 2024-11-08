# Ejercicio 2. Validacion de numeros enteros. Crea un programa que solicite al usuario un numero entero positivo.
# Si el numero no es valido (por ejemplo, si es negativo o no es un numero), el programa debe pedir que seingrese
# de nuevo hasta que se ingrese un valor correcto.

while True: # Para realizar las validaciones de entrada con trato de excepciones, usaremos el while True(bucle infinito) con el Try:except para tratar errores.
        try:
            num = int(input("Dame un numero entero positivo: "))
            
            if num == 0:
                print(f"El numero debe ser diferente de {num}")
            elif num < 0:
                print(f"El numero: {num} es negativo")
            else:
                print(f"CORRECTO!!! El numero: {num} es un numero entero positivo")
                break
        except ValueError:
            print("Ingrese un tipo de entrada correcto...")