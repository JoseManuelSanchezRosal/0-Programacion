# Desarrolle un programa que lea de teclado dos números enteros y los almacene en dos variables de tipo int. Posteriormente deberá intercambiar los valores
    # almacenados en dichas variables, y finalmente deberá escribir el valor almacenado en cada una de ellas.

a = int (input("introduzca valor a:"))
b = int (input("introduzca valor b:"))
print (a, b)

c = int = a
a = b
b = c
print("variables intercambiadas:", "a:",a, "b:",b)

# Otra forma de intercambiar variables es:
# a, b = b, a