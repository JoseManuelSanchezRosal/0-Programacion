''' Ejercios básicos de tipos de datos, condicionales y bucles:'''
# Nota: estos ejercicios se han entregado sin el menú que implementaste en los ejercicios de Manuel Rossi. En los siguientes se intentará
# implementar para acceder de forma mas rápida para su corrección.


'''1.1 ¡Hola, USUARIO!:'''
nombre = str(input("Ingrese su nombre: ")) #Definimos la variable como string y que nos la pida por pantalla.
print("¡Hola, ",nombre,"!")    #PREGUNTAR A ÁLEX SI HAY ALGUNA MANERA DE ENCADENAR LA EXCLAMACIÓN CON LA VARIABLE NOMBRE.



'''1.2 Imprimir nombre en "X" líneas:'''
nombre = str(input("Ingrese su nombre: "))  #Definimos la variable nombre como string (PREGUNTAR FORMA DE COMENTAR VARIAS LÍNEAS)
numero = int(input("Introduzca número entero: "))   #Definimos la variable de número entero.
for i in range(0, numero):  #Para i desde el rango valor "0"(inicio bucle) hasta valor "número"(fin bucle) introducido
    print(nombre)   #Imprimimos nombre   



'''1.3 Nombre en mayúsculas y número de caracteres:'''
nombre = input("Introduzca nombre en minúscula: ")  #Definimos y pedimos la variable nombre
print(nombre.upper())   # Imprimimos la misma variable pero convertida en mayúsculas con la función .upper()
print(len(nombre))  #Imprimimos número de caracteres que tiene nuestra variable de entrada "nombre"



'''1.4 Resultado ecuación:'''
print(((3+2)/(2*5))*((3+2)/(2*5)))



'''1.5 Peso total del paquete (payasos(112g) y muñecas(75g)):'''
payasos = int(input("Introduzca número de payasos vendidos: ")) #Introducimos nº payasos
munecas = int(input("Introduzca el número de muñecas vendidas: "))  #Introducimos nº muñecas
print("El peso total de su envío es de:", (payasos * 112) + (munecas * 75),"gramos")    #Se realiza la operación y se suma parra sacar peso en gramos
print("El peso total en KG es de:", ((payasos * 112) + (munecas * 75))/1000,("kg")) #Sacamos por pantalla el equivalente en kg



'''1.6 Mayor de edad o no:'''
edad = float(input("Ingrese su edad: "))
if edad >= 18:
    print("Usted es mayor de edad")
else:
    print("Usted es menor de edad")



'''1.7 División y error dsor=0:'''
ddo = float(input("Introduczca dividendo: "))   #Definimos variable dividendo (ddo)
dsor = float(input("Introduzca divisor distinto de 0: ")) #Definimos variable divisor (dsor)
if dsor == 0:   #Si introducimos el divisor == 0, imprimimos error, sino, imprimimos división entre los nºs introducidos.
    print("Error, el divisor no puede ser 0!!!")
else:
    print(ddo / dsor)



'''1.8 División value error y divisor distinto de 0:'''
try: #Se ejecuta esta orden .....:
    ddo = float(input("Ingrese dividendo: "))
    dsor = float(input("Ingrese divisor: "))
    print(ddo / dsor)
except ValueError: #.....Siempre y cuando se ingresen números.
    print("Error, introduzca números")
except ZeroDivisionError: # ......y siempre que el divisor no sea 0.
    print("Error, el divisor no puede ser 0")



''' 1.9 Cobro de distinto precio de entrada según edad:'''
edad = float(input("Ingrese su edad: "))    #Declaramos variable de entrada de edad. 
if edad >= 0 and edad < 4:  # Mediante el condicionante"if" hacemos las comparaciones de edad para definir un precio u otro.
    print("Bienvenido, su entrada es gratis")
elif edad >=4 and edad <=18:
    print("El precio de su entrada es de 5 euros")
else:
    print("El precio de su entrada es de 10 euros")



'''1.10 Palabra definida "x" veces por pantalla:'''
palabra = str(input("Introduzca su palabra: ")) #Definimos variable palabra de entrada.
for i in range(0, 10):  #Para i en rango(inicio 0, stop 10)
    print(palabra)  #Imprimimos palabra 10 veces
 También se puede imprimir palabra x 10, en este caso no necesitaríamos el bucle for, y las imprimiría en una misma línea.



'''1.11 Pedir edad y sacar todos los años desde el 1 a su edad:'''
edad = int(input("Introduzca su edad: "))   #Definimos la variable de entrada de edad.
for i in range(edad):   #Introducimos bucle que se repetiŕa "X" veces donde X es la edad introducida.
    print(i + 1)        #Imprimimos edad + 1 (porque sino empezaría desde 0)



'''1.12 Numero entero positivo de entrada y print impares desde 1 a número introducido:'''
edad = int(input("Indroduzca número entero positivo: "))    #Declaramos la variable de edad de entrada
for i in range(1, edad + 1, +2):    #Para el rango i (inicio 1, fin edad +1, paso sumamos 2(para sacar impares))
    print (i)   #Imprimimos i(donde i, valdrá desde 1 hasta el último numero impar hasta nuestra edad introducida)



'''1.13 Número entero positivo y cuenta atrás separado por comas.'''
edad = int(input("Introduzca número entero positivo: "))
for i in range(edad, 0 - 1, -1):    #Para i en rango(inicio edad, hasta 0 - 1(para que imrima el 0 también), paso - 1 (en cada vuelta le restamos 1 a edad))
    print(i, end=",")   #Imprimimos la edad desde la introducida hasta cero (con la función end="," se consigue imprimir en la misma línea, separado por comas)



'''1.14 Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual
y el número de años, y muestre por pantalla el capital obtenido en la inversión cada
año que dura la inversión:'''
# Definimos variables:
cantidad = int(input("Introduzca cantidad a invertir: "))
interes = int(input("Introduzca inteŕes en %: "))
years = int(input("Introduzca número de años que desea mantener la inversión: "))
# Usamos el bucle "for" para ir imprimiendo desde el año "1" hasta el año introducido y guardado en "years" +1(para nuestro bucle imprima el nº exacto de years introducidos)
for i in range(1,  years +1):
    cantidad += cantidad * interes / 100    #USAMOS EL COMANDO "+=" PARA IR MACHACANDO LA VARIABLE CANTIDAD (INCREMENTANDO CADA AÑO)
    print(cantidad)
    '''(Este ejercicio se me cruzó y hasta que no vimos el comando += no logré sacarlo)'''