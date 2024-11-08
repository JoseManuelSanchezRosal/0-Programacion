# Ejercicio 5. Determinar si una letra es vocal. Escriba un programa que pida una letra y determine si es vocal o no.

letra = str(input("Introduzca una letra: "))    # Declaramos letra entrada 
if letra == "a" or letra == "e" or letra == "i" or letra == "o" or letra == "u":    # Si es a, e, i, o, u es vocal
    print("La letra ES VOCAL")
else:   # Sino no es vocal
    print("NO Es Vocal")