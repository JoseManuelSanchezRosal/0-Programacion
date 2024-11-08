# Definimos el menú que nos aparecerá para elegir el ejercicio que queremos ejecutar:
def banner():
    print('''
        *********************************
        Ejercicios de iniciación a Python
        *********************************
        
        1- Nombre.
        2- Suma.
        3- Suma y producto.
        4- Kilómetros vs combustible.
        5- Conversión de temperatura.
        6- Promedio 3 números.
        7- Resta de %.
        8- Salir del programa.
          ''')
    
    return int(input("Ejercicio: "))

def ej1():
    nombre = str(input("Ingrese su nombre: "))
    print("Ahora estás en la Matrix,",nombre)
    return main()

def ej2():
    num1 = float(input("Ingrese número con  decimales: "))
    num2 = int(input("Ingrese número entero: "))
    print("El resultado de la suma es:", num1 + num2)
    return main()
    
def ej3():
    num1 = int(input("Ingrese primer número: "))
    num2 = int(input("Ingrese segundo número: "))
    suma = num1 + num2
    print("El resultado de la suma es:", suma)
    num3 = int(input("Ingrese tercer número: "))
    print("El resultado del producto de la suma con el tercer número es:", num3 * suma)
    return main()

def ej4():
    km = int(input("Ingrese kms recorridos: "))
    comb = float(input("Ingrese combustible consumido: "))
    print("El consumo de combustible por km recorrido es de:", comb / km)
    return main()    

def ej5():
    f = float(input("Ingrese temperatura en Fahrenheit: "))
    print(f"La temperatura {f} en grados Celsius es de:", (5/9)*(f-32))
    return main()

def ej6():
    num1 = float(input("Ingrese primer número: "))
    num2 = float(input("Ingrese segundo número: "))
    num3 = float(input("Ingrese tercer número: "))
    print("El promedio de los 3 números es de: ",((num1+num2+num3)/3))
    return main()

def ej7():
    num = float(input("Ingrese un número: "))
    num = num * 0.85
    print(num)
    return main()

def fin():
    print("Saliendo del programa...")

def main():
    opcion = banner()
    if opcion == 1:
        ej1()
    elif opcion == 2:
        ej2()
    elif opcion == 3:
        ej3()
    elif opcion == 4:
        ej4()
    elif opcion == 5:
        ej5()
    elif opcion == 6:
        ej6()
    elif opcion == 7:
        ej7()
    elif opcion == 8:
        fin()
        
if __name__ == "__main__":
    main()
