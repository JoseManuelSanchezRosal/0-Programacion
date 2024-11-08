#Ejercicio 10: Calcular factorial. Escribe un programa que calcule el factorial de un número entero positivo.
n = int(input("Introduzca número entero positivo: "))
factorial = 1
for i in range(1, n + 1):
    factorial = i *factorial
    
# En cada vuelta se va machacando el valor de fac (1, 2, 6, 24, 120)
# También sería válido el comando "factorial *= i"
print(factorial)
    