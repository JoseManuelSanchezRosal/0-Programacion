# Ejercicio 2. Crea una función que reciba una cadena de texto y cuente cuántas palabras tiene:

def contar_palabras(cadena):#Definimos la funcion que nos va a contar palabras.
    

    lista = cadena.split()#Para "dividir" la cadena de entrada de texto en palabras
    return(len(lista))#El resultado o "return" de contar_palabras nos devuelve un "número n" de palabras en la cadena de texto que hemos introducido


texto = "ñalskdf añlskjh ñlak ñLÑLK"#le damos un texto y
print(contar_palabras(texto))# sacamos por pantalla las letras que tiene

texto2 = input(str("Introduca texto: "))# nos pide un texto y al introducirlo...
print(f"El texto {texto2} tiene: {contar_palabras(texto2)} palabras")