# Ejercicio 3. Escribe una función que utilice *args y **kwargs para aceptar múltiples parámetros y los imprima como formato:

def imprimir_datos(*args, **kwargs):
    print("Argumentos posicionales: ", args)
    print("Argumentos nombrados", kwargs)
    
#Ejemplo de uso de la función del ej3
imprimir_datos(1, 2, 3, 44, 55, "tomy", nombre="juan", edad="33", pelo="calvo")