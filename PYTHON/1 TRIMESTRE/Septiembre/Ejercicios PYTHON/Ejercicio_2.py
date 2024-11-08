# Programa que solicite al usuario ingresar un número con decimales y almacenarlo en una variable
    # A continuación, el programa debe solicitar al usuario que ingrese un número entero y guardarlo en otra variable.
    # En una tercera variable se deberá guardar el resultado de la suma de los 2 números ingresados por el usuario.
    # Por último, se debe mostrar en pantalla el texto "El resultado de la suma es (suma), donde (suma) se reemplaza por el resultado de la operación"

numa = float(input("Introduce número A:"))
numb = int(input("Introduce número B:"))
numc = float (numa + numb)
print("El resultado de la suma es:", numc)