# Escribir un programa que pregunte el nombre del usuario en la consola y un número
#entero e imprima por pantalla en líneas distintas el nombre del usuario tantas veces
#como el número introducido.


nombre = str(input("Introduce su nombre: "))
numero = int(input("Introduce numero: "))
for i in range(numero):
    print(nombre)
