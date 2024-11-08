# Ejercicio 4. Diccionario de notas de estudiantes. Escribe un programa que permita al usuario ingresar las notas de varios estudiantes.
# Cada estudiante tendra un nombre y una nota. Utiliza un diccionario para almacenar esta informacion, donde la clave sera el nombre,
# y el valor sera la nota. El programa debe permitir ingresar hasta 5 estudiantes. Al final, muestra todas las notas y 
# calcula el promedio de las mismas.

notas = {}

for i in range(5):
    nombre = str(input("Dame nombre de estudiante: "))  # Pedimos nombre de estudiante
    try:
        nota = float(input("Dame nota de estudiante: "))    # Pedimos nota de estudiante
        notas[nombre] = nota    # Para el nombre "i" le asignamos (=) la nota introducida (nota) y lo anadimos al diccionario
        
    except ValueError:
        print("Ingrese nota valida...")

print(f"Los estudiantes y sus notas: {notas}")

promedio = sum(notas.values())/(len(notas)) # Sacar el promedio de notas:(suma(notas.values()) dividido entre el num de notas de mi diccionario(len(notas))
                             
print(f"El promedio de notas de los 5 alumnos es de:, {promedio}")
