import random   #(Tenemos que importar la librería "random")

# Definimos función para ordenar una lista de números de forma ascendente.
def lista_ordenada_asc(lista):
    return lista.sort()

# Definimos una función que nos generará un número random del 1 al 100 y lo guardará en la variable "aleatorio"
def aleatorio(aleatorio):
    aleatorio = random.randint(1, 100)
    return(aleatorio)