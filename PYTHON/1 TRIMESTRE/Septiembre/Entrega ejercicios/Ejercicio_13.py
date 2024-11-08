# Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.

numero = int(input("Escribe un número: "))
for i in range(numero, -1, -1):  #Para i en el rango (start(numero introducido),(stop(numero 0, por eso ponemos -1)))
    print(i, end=",")  # Con el print(i) imprime en distintas líneas. Con el print(i, end= ",")