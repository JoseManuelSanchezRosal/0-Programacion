# Tarea 1. Cada ejercicio es una función
# Habrá un menú en mi main, que será una función que invoque otras funciones.

def ejercicio_1():  # Nombre
    nombre = input("Introduce nombre: ")
    print(f"Hola{nombre}")

def ejercicio_2_8(): # Ingresar 2 múmeros. El inicio y el fin, e imprimir los impares.
    inicio = int(input("Ingresa primer número: "))
    fin = int(input("Ingresa segundo número: "))
    for i in range(inicio, fin + 1):    # En la 1A vuelta, i toma el valor que hayamos introducido en inicio
        if i % 2 != 0:  #SI EL PRIMER VALOR QUE TOMA I(INICIO) ES IMPAR (!= 0(DISTINTO DE 0)), IMPRIMIMOS EL IMPAR
            print(i)


def ejercicio_14(): # Inversión anual con interés
    cantidad = float(input("Cantidad a invertir: "))
    interes = float(input("Interes anual a invertir: "))
    anios = int(input("Introduzca años de la inversión: "))
    for i in range(1, anios+1):
        cantidad += cantidad * interes / 100 # Se usa el += para sumar cantidad a cantidad * interes y sobreescribir el valor de cantidad (sumaa)
        print(f"El capital tras el año {i}: {cantidad:.2f}€")    #El print {cantidad:.2f} es para imprimir la cantidad pero con 2 decimales. el último dígito aproxima arriba o abajo

def menu(): #AQUÍ ESTAMOS DEFINIENDO UNA FUNCIÓN /// 
    print("Selecciones ejercicio a ejecutar: ")
    print("1. Ejercicio 1")
    print("14. Ejercicio 14")
    print("2_8. Ejercicio 28")
    print("presione Q para salir")

    while True:
    
        opcion = input("Introduzca ejercicio a realizar: ")
        if opcion == "1":
            ejercicio_1()   #PARA EJECUTAR O LLAMAR UNA FUNCION "FUNCION()""
        elif opcion == "14":
            ejercicio_14()
        elif opcion == "28":
            ejercicio_2_8()
        elif opcion == "Q":
            print("Saliendo del programa")
            break
        else:
            print("Opción no válida. Inténtelo de nuevo: ")
        
menu()
        