# Si quiero poner comentario
#  PREGUNTAR SI UN NUMERO ES PAR O IMPAR

num = int(input("Introduce un nº: "))
print("El número introducido es:", num)

#Consulta por pantalla de los tipos de datos:
print(type(num))

num2 = input("Otro número: ")
print(num2)
print(type(num2))


if num % 2 == 0:
    print(num,"es par.")
else:
    print(num,"es impar.")
