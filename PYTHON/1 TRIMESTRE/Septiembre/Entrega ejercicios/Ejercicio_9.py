# Escribir un programa para una empresa que tiene salas de juegos para todas las edades y quiere calcular de forma automática el precio 
# que debe cobrar a sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada. 
# Si el cliente es menor de 4 años puede entrar gratis, si tiene entre 4 y 18 años debe pagar 5€ y si es mayor de 18 años, 10€.

edad = int(input("Introduzca su edad: "))
if edad > 0 and edad < 4:
    print("El precio que tiene que pagar es de 0 euros")
elif edad >= 4 and edad <= 18:
    print("El precio que tiene que pagar es de 5 euros")
elif edad > 18:
    print("El precio que tiene que pagar es de 10 euros")
else:
    print("Introduzca una edad válida")
