# Ejercicio 3. Contar ocurrencias de una lista. Escribe un programa que reciba una lista de palabras y cuente cuantas veces
# aparece cada palabra. Imprime los resultados.

palabras = ["manzana", "pera", "manzana", "pera", "naranaja", "pera", "pera"]   # Creamos una lista de palabras.

conteo_palabras = {}    # Creamos el diccionario vacio, donde para cada iteracion se anade la palabra y el numero de veces que se repite.

for i in palabras:
    if i in conteo_palabras:
        conteo_palabras[i] += 1 # Si la palabra esta en el diccionario, anade 1 en cantidad
        print(conteo_palabras)
    else:
        conteo_palabras[i] = 1
        print(conteo_palabras)    # Si la palabra no esta, la anade al diccionario

print(palabras)
print("Conteo de palabras: ", conteo_palabras)