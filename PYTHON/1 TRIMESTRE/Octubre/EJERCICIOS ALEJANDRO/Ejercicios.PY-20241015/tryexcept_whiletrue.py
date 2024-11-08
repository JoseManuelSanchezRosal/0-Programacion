while True:
    try:
        n1 = int(input("Escribe un n: "))
        n2 = int(input("Escribe otro n: "))
        print(f"El res es {round(n1/n2)}")
        
    except ValueError:
        print(f"Nº no introducido.")
    except ZeroDivisionError:
        print(f"No se puede dividir por 0.")
