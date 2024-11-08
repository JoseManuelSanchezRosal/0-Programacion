# EJERCICIOS DE REPASO: LISTAS, TUPLAS, DICCIONARIOS Y ESTRUCTURAS DE CONTROL EN PYTHON.

# 1. Ejercicio: crear una lista de nombres. Crea un programa que pida al usuario que ingrese 5 nombres, uno por uno
# y los guarde en una lista. Al final, el programa debe imprimir todos los nombres ingresados.

lista = []  # Declaramos una lista vacia

n1 = str(input("Ingrese primer nombre: "))  # Pedimos ingresar 1 nombre y lo guardamos en n1
lista.append(n1)    # Anadimos el nombre guardado en la lista vacia.
n1 = str(input("Ingrese segundo nombre: ")) # Pedimos ingresar 2 nombre y lo guardamos en n1 (lo machacamos)
lista.append(n1)
n1 = str(input("Ingrese tercer nombre: "))
lista.append(n1)
n1 = str(input("Ingrese cuarto nombre: "))
lista.append(n1)
n1 = str(input("Ingrese quinto nombre: "))
lista.append(n1)

print(lista)

# 2. Ejercicio: validacion de numeros enteros. Crea un programa que pida al usuario un numero entero positivo. Si el numero no es valido
# (por ejemplo, si es negativo o no es un numero), el programa debe pedir que se ingrese de nuevo hasta que se ingrese un valor correcto.

while True:
    try:
        n = int(input("Ingrese un numero entero positivo: "))
        if n < 0:
            print(f"El numero ingresado {n} es negativo...")
        elif n == 0:
            print(f"El numero ingresado no puede ser: {n}...")
        else:
            print(f"El numero {n} es entero positivo!!!")
            break
    except ValueError:
        print("Ingrese un tipo de entrada correcto...")
        


# 3. Ejercicio: contar ocurrencias de elementos de una lista. Escribe un programa que reciba una lista de palabras y cuente
# cuantas veces aparece cada palabra. Imprime los resultados.

palabras = ["manzana", "pera", "manzana", "pera", "naranaja", "pera", "pera"]   # Creamos una lista de palabras.

conteo_palabras = {}    # Creamos el diccionario vacio, donde para cada iteracion se anade la palabra y el numero de veces que se repite.

for i in palabras:
    if i in conteo_palabras:
        conteo_palabras[i] += 1 # Si la palabra correspondiente a la iteracion o paso "i" se encuentra en el dicionario, aumenta el conteo en 1
        print(conteo_palabras)
    else:
        conteo_palabras[i] = 1  # Si la palabra correspondiente a la iteracion o paso "i" no se encuentra, mete la palabra en el diccionario
        print(conteo_palabras)

print(palabras)
print("Conteo de palabras: ", conteo_palabras)
    
    
    
# 4. Ejercicio: Diccionario de notas de estudiantes. Escribe un programa que permita al usuario ingresar las notas de varios estudiantes.
# Cada estudiante tendra un nombre y una nota. Utiliza un diccionario para almacenar esta informacion, donde la clave sera el nombre y
# el valor sera la nota. El programa debe permitir ingresar la nota de hasta 5 estudiantes. Al final muestra todas las notas y calcula el 
# promedio de las mismas.

nota1 = {}
nota2 = {}
nota3 = {}
nota4 = {}
nota5 = {}


n1 = int(input("Ingrese la nota de Alejandro: "))
nota1 ["nombre"] = "Alejandro"
nota1 ["nota"] = n1

n2 = int(input("Ingrese la nota de Maria: "))
nota2 ["nombre"] = "Maria"
nota2 ["nota"] = n2

n3 = int(input("Ingrese la nota de Rober: "))
nota3 ["nombre"] = "Rober"
nota3 ["nota"] = n3

n4 = int(input("Ingrese la nota de Jess: "))
nota4 ["nombre"] = "Jess"
nota4 ["nota"] = n4

n5 = int(input("Ingrese la nota de Cris: "))
nota5 ["nombre"] = "Cris"
nota5 ["nota"] = n5

print(nota1,nota2,nota3,nota4,nota5)
print("El promedio de notas es: ", (n1+n2+n3+n4+n5)/5)

notas_estudiantes = {}

for i in range(5):
    nombre = input(f"Ingrese el nombre del estudiante numero {i+1}: ")  # Pedimos el nombre del Alumno 1, 2, 3, 4 y 5
    
    try:
        nota = float(input(f"Ingrese la nota de {nombre}: "))   # Pedimos la nota para el alumno 1, 2, 3, 4 y 5.
        
        notas_estudiantes[nombre] = nota    # En la primera vuelta, para el alumno 1(notas_estudiantes[nombre]) le asigno (=) la nota 1(nota)
        
    except ValueError:
        print("Nota no valida, Ingrese un numero.")
        
        
print(notas_estudiantes)

promedio = sum(notas_estudiantes.values()) / len(notas_estudiantes) # Para hacer el promedio
print("El promedio :" , promedio)   # Sacar por pantalla el promedio

# 5. Ejercicio: crear una lista de ingredientes para hacer una pizza. Escribe un programa que permita al usuario seleccionar ingredientes
# predefinidos para hacer una pizza. El usuario puede elegir hasta 5 ingredientes, y al final el programa debe mostrar los ing. seleccionados.



print('''
    
        ***********************************
        Lista de ingredientes para tu pizza
        ***********************************
        
        1- Tomate.
        2- Mozzarella.
        3- Bacon.
        4- Pollo.
        5- Champinones.
        6- Pina.
        7- Jamon.
        8- York.
        9- Queso.

        NOTA: pulse numero y luego al intro para seleccionar''')
lista = []
for i in range(5):
    ing = int(input("Dame ingrediente: "))
    if ing == 1:
        lista.append("Tomate")
    elif ing == 2:
        lista.append("Mozarella")
    elif ing == 3:
        lista.append("Bacon")
    elif ing == 4:
        lista.append("Pollo")
    elif ing == 5:
        lista.append("Champinones")
    elif ing == 6:
        lista.append("Pina")
    elif ing == 7:
        lista.append("Jamon")
    elif ing == 8:
        lista.append("York")
    elif ing == 9:
        lista.append("Queso")

print(lista)


# 6. Ejercicio, busqueda en una lista. Crea un programa que permita al usuario ingresar varios nombres de personas y luego buscar si un nombre
# especifico esta en la lista; sino, indica que no se encontro.

lista_nombres = []

# Recolectar nombres:

iteracion = 1
while True:
    nombre = input(f"Ingresa el nombre: {iteracion} o end para acabar: ")
    if nombre == "end":
        break
    lista_nombres.append(nombre)
    iteracion += 1
    
# Buscar nombre en lista

nombre_a_buscar = input(f"Ingresa el nombre que quieres buscar: ")

if nombre_a_buscar in lista_nombres:
    print(f"El nombre {nombre_a_buscar} esta en la posicion {lista_nombres.index(nombre_a_buscar)+1}")  # Si el nombre esta en el indice de la lista de nombres, lo sacamos por pantalla (le sumamos 1 porque empieza en 0 la posicion)
else:
    print(f"El nombre {nombre_a_buscar} no se encuentra en la lista")
    
    
    '''PARA EXAMEN'''
    
    # MANEJO DE LISTAS, AGREGAR, QUITAR, CONTAR, LONGITUD(LEN), ELIMINAR ELEMENTOS DE LISTA
    
    # HACER DICCIONARIO DEL COCHE, BUSCAR EN EL DICCIONARIO, ELIMINAR ELEMENTOS DE UN DICCIONARIO.
    
    # HACER UN MENU.
    
    # TRY EXCEPT, VALIDACION DE ENTRADAS, MANEJO DE ERRORES, LIMITES, BUCLES FOR, WHILE E IF.
    
    