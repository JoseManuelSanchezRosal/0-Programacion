# Programa que solicite al usuario dos números y los almacene en 2 variables. En otra variable, almacena el resultado de la suma de esos dos números
    # y luego mostrará ese resultado en pantalla.
    # A continuación, el programa debe solicitar al usuario que ingrese un tercer número, el cual se debe almacenar en una nueva variable.
    # Por último, mostrará en pantalla el resultado de la multip. de este nuevo número por la suma anterior.

a = int(input("Ingrese número a:"))
b = int(input("Ingrese número b:"))
c = a + b
print("La suma de a y b es de:", c)
d = int(input("Ingrese número d:"))
print ("El resultado de multiplicar la suma anterior por d es de:", (d * c))