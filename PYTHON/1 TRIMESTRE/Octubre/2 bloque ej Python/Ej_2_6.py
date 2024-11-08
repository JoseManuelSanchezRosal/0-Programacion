# Ejercicio 6. Tabla de multiplicar. Escribe un programa que muestre la tabla de multiplicar de un número introducido por el usuario

num = int(input("Introduzca número para sacar su tabla de multiplicar: "))
for i in range(1, 11):  #Definimos el rango (i tomará el valor desde el 1 hasta el 10 (por eso se pone 11(o *1)))
    print(f"{num} x {i} = {i * num}")   #Imprimimos la tabla del número introducido.
