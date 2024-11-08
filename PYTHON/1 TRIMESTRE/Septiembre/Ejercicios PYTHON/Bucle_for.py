# Escribir un programa que pregunte el nombre del usuario en la consola y un número
#entero e imprima por pantalla en líneas distintas el nombre del usuario tantas veces
#como el número introducido.


nombre = str(input("Introduce su nombre: "))
numero = int(input("Introduce numero: "))
for i in range(numero):
    print(nombre)

# Una vez introducimos el nombre y el número, usaremos el "BUBLE FOR". En i se guardará la información del rango (numero), y se 
#imprimira el número de veces que hayamos definido. Podemos imprimir el nombre o el número (escala ascendente) segun necesitemos