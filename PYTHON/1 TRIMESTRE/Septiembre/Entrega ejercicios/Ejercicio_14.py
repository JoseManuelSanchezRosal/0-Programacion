# Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de años, 
# y muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión.

cantidad = float(input("Cantidad a invertir: "))
interes = float(input("Interes anual a invertir: "))
anios = float(input("Introduzca años de la inversión")) # Cambiado de INT a FLOAT. Supuse que los años serían números enteros.
for i in range(1, anios+1):
    cantidad += cantidad * interes / 100 # Se usa el += para sumar cantidad a cantidad * interes y sobreescribir el valor de cantidad (suma)
    print(f"El capital tras el año {i}:{cantidad:.2f}€")    #El print {cantidad:.2f} es para imprimir la cantidad pero con 2 decimales. el último dígito aproxima arriba o abajo
# EN CADA VUELTA, ESTAMOS MACHACANDO LA VARIABLE CANTIDAD SUMANDOLE EL % ANUAL A ESA MISMA CANTIDAD.