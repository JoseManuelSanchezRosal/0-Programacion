# Elaborar una matriz de 3x3:

# Con 3 bucles for:
#for i in range(1,4):
#    print(f"{i}", end=" ")
#print() #salto de línea
#for j in range(4, 7):
#    print(f"{j}", end=" ")
#print()
#for k in range(7, 10):
#    print(f"{k}", end=" ")
#print()


# Con 2 bucles anidados:
#for i in range(1, 4):   #bucle externo, filas
#    for j in range(1, 4):   #bucle interno, columnas
#        print(f"{i*j}", end=" ")
#    print()


# DE LA MANERA MÁS EFICIENTE, entre paréntesis se pone el rango de la matriz (4x3, 10x10, etc...)
contador = 1
for i in range(4):   #bucle externo: filas
    for j in range(4):   # Bucle interno: columnas
        print(f"{contador:3}", end=" ") #Con el ":3" le decimos que el resultado de contador tenga 3 dígitos. Con el "end=" "" le estamos diciendo que despues de imprimir nuestro resultado, imprima resultado más "lo que haya entre comillas".
        contador += 1
    print() #Imprimimos salto de línea
