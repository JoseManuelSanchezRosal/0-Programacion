# Ejercicio 99. Proyecto modularizado. 
# 1. Crea un pequeno proyecto donde deberas implementar las siguientes funcionalidades
        # Crear una lista de numeros aleatorios del 1 al 100
        
import random

def lista_randoms():
    randoms = []
    for i in range(20):
        rnd = random.randint(1, 100)
        randoms.append(rnd)
    return randoms
lista_aleatoria = lista_randoms()
        
print("La lista de numeros aleatorios es:", lista_randoms())

def menor():
    menor = min(lista_randoms())
    return menor

def mayor():
    mayor = max(lista_randoms())
    return mayor

print(f"De la lista, el numero menor es:{menor()} y el numero mas alto es: {mayor()}")

def ordenar_lista(ordenada):
    ordenada.sort()
    return ordenada

print(ordenar_lista(lista_aleatoria))

def contar(lista):
    dicc = {}
    for i in lista:
        if i in dicc:
            dicc[i] += 1
        else:
            dicc[i] = 1
    print(dicc) #Printeamos el diccionario
    

    for clave,valor in dicc.items():    # Contamos los elementos del diccionario y los sacamos por pantalla
        print(f'EL elemento {clave} aparece {valor} veces')

# Para invocar la funcion contar
contar(lista_aleatoria)


    


