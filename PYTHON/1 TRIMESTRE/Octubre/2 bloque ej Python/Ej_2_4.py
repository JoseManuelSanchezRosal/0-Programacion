# Ejercicio 4. Suma de números del 1 al 100. Escribe un programa que calcule la suma de todos los números del 1 al 100 usando bucle "for"

suma = 0    #Inicializamos el valor de suma a 0
for i in range(1, 101): #(i tomará el valor desde 1 hasta 100)
    suma = i+suma   #Aquí vamos machacando suma con el valor de i en cada bucle (ejem suma = 1 + 0 = 1)

print("La suma de todos los números del 1 al 100 e: ", suma)    #Finalmente sacamos por pantalla la suma de todos los números del 1 al 100.