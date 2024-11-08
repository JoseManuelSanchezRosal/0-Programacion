# MANEJO DE DICCIONARIOS.

# Crear un diccionario
diccionario = {"jose":"38", "rosa":"33", "miscos":"Pa 39"}
print(diccionario)

diccionario["Josema"] = 38
diccionario["Rosa Maria"] = 33

print(diccionario)

diccionario = {"nombre":"Sara",
               "edad": 35,
               "Pais": "America",
               "le gustan": "las pollas"
            }

print(diccionario)
print(diccionario["nombre"])
diccionario["nombre"] = "laura"
print(diccionario)
diccionario["geolocalizacion"] = "Calle Miscos"
print(diccionario)
for i in diccionario:
    print(i)
for i in diccionario:
    print(diccionario[i])

for i, j in diccionario.items():
    print(i, j)


diccionario["tusmus"] = "cochina"
print(diccionario)

    
    
    
