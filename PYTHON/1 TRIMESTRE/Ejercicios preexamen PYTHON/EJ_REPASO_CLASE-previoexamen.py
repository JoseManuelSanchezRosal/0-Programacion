# Ejercicio 3. Contar ocurrencias de elementos de una lista

palabras = ["manzana", "pera", "manzana", "pera", "naranaja", "pera", "pera"]

conteo_palabras = {}

for i in palabras:
    if i in conteo_palabras:
        conteo_palabras[i] += 1 # Si la palabra correspondiente a la iteracion o paso "i" se encuentra en el dicionario, aumenta el conteo en 1
    else:
        conteo_palabras[i] = 1  # Si la palabra correspondiente a la iteracion o paso "i" no se encuentra, mete la palabra en el diccionario

print(palabras)
print("Conteo de palabras: ", conteo_palabras)
        