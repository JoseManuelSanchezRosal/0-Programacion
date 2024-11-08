#####VARIABLES#####

micadena = "mi variable tipo cadena"
print(micadena)

mientero = 5
print(micadena)

#####CONVERSIONES DE TIPOS#####

entero_a_cadena = str(mientero)
print(entero_a_cadena)
print(type(entero_a_cadena))

mibooleana = False
print(mibooleana)

#####CONCATENACIÓN DE VARIABLES########

print(micadena, entero_a_cadena, mibooleana)
print("esto vale:", mibooleana)

nuevacadena = micadena + " " + entero_a_cadena
print(nuevacadena)

#####EJEMPLO DE FUNCIÓN PREDETERMINADA EN EL SISTEMA PYTHON
print(len(micadena))
print(type(len))

#####VARIABLES CREADAS EN UNA SOLA LÍNEA######
name, apellido, edad = "Jose", "Sanchez", 38
print("Me llamo:", name, apellido, "y tengo", edad, "años")

edad = float(edad)
print(type(edad))

#####FORZADO DE TIPO DE VARIABLES#####
direccion: str = "calle blablabla"
direccion = True
direccion = 5
direccion = 1.4
print(direccion)
print(type(direccion))