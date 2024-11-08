'''Crea un programa que imprima todas las tablas de multiplicar del 1 al 9, ambos inclusive'''

#Ejemplo:
    # 1 * 1 = 1
    # 1 * 2 = 2
    #...
    # 2 * 1 = 2
    # 2 * 2 = 4
    #...
    # 9 * 1 = 9
    #...
    # 9 * 10 = 90

#resultado = 0   #inicializamos variable "resultado"
for i in range(1, 10):  #Itera del 1 al 9 (tablas del 1 al 9)
    for j in range(1, 11):   #Itera del 1 al 10 (multiplicar por 1......por 10)(también se podría poner "10+1!)
        print(f"{i} * {j} = {i * j}")
        #print(i , "*" j, "=", resultado)
    