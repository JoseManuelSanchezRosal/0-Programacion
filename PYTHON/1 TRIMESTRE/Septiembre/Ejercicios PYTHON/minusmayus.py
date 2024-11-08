'''Programa que lea de teclado una letra minúscula (suponemos que la entrada de datos es correcta), y escriba la letra mayúscula a la letra 
correspondiente a la letra minúscula leída previamente'''# CON RAISE TRATAMOS LOS ERRORES
try:
        letra_minuscula = (input("Introduzca letra minúscula: "))

        # Comrpobamos que se haya introducido una única letra
        if len(letra_minuscula) != 1:   #Con "!="" decimos "distinto de" en este caso distinto de 1
            raise ValueError("La entrada debe ser una única letra")
        
        # Comprobar que la letra de entrada es un carácter alfabético:
        if not letra_minuscula.isalpha():
            raise ValueError("La letra debe ser una letra")
        
        # Comprobar que la letra de entrada sea minúscula:
        if not letra_minuscula.islower():
            raise ValueError("La letra debe ser minúscula")
        
        letra_mayuscula = letra_minuscula.upper() #Se puede convertir la letra o bien en una nueva variable como este caso, o añadiendo .upper() a nuestra variable

        print(f"La letra mayúscula correspondiente es: {letra_mayuscula}")
        break
except ValueError as e: #Con esto hacemos que el error que nos dé lo almacene en "e"
        print(f"Error: {e}")    #Sacamos por pantalla el error que nos lance la consola, imprimiento el valor "e"
                