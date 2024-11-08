while True: #Con el while true hacemos bucle infinito hasta que nos interese romper (break)
    try: 
        n1 = int(input("Escribe un número: "))
        n2 = int(input("Escribe otro número: "))
        print(f"El res es {round(n1/n2)}")
        break   #Si introducimos 2 numeros enteros , se realiza la division y rompemos el bulce infinito
    except ValueError:  # Con el try except es para tratar los errores del programa
        print(f"Nº no introducido.")
    except ZeroDivisionError:
        print(f"No se puede dividir por 0:")
    
    