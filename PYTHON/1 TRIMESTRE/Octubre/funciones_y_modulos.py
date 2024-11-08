# Argumentos y parámetros flexibles

# Parámetro posicional indefinido: *args
def suma(*numeros):
    total = 0
    for num in numeros:
        total += num
    return total

# Llamada a la función:
print(suma(1, 2, 3, 4))
# *args permite recibir una tupla con todos los valores que se pasan como argumentos adicionales


# Parámetros nombrados indefinido: **kwargs (permite recibir un número indefinido de parámetros con nombre en forma de un diccionario).
def mostrar_datos(**datos):
    for clave, valor in datos.items():
        print(f"{clave}:{valor}")   #clave es nombre, edad y dni, valor es sara, 27 y 12314585

dicc1 = {
    "Nombre": "Sara",
    "Edad": 27,
    "DNI": 12314585
}
print(dicc1)


# Funciones anidadas (función dentro de función) y ámbito de variables. Es útil cuando una función necesita lógica adicional
# que no se utilizará fuera de su contexto:
def operacion(opcion):
    def suma(a, b):
        return a + b
    def resta(a, b):
        return a - b
    if opcion == "sumar":
        return suma
    elif opcion == "restar":
        return resta

func = operacion("sumar")
print(func(5, 3) )   #Salida: 8)
func = operacion("restar")
print(func(5, 3))   #Salida: 8)

# Ámbito de variables: las variables definidas dentro de una función tienen un ámbito local, lo que significa que no son accesibles
#fuera de esa función
def saludo():   #Definimos función
    mensaje = "Hola, DAM1"
    print(id(mensaje))  #con id(variable) vemos la dirección de la variable-

saludo()    #llamamos a función
mensaje = 0
print(mensaje) #La variable mensaje de aquí es diferente de la definida en la funcion saludo.


# Funciones Lambda: funciones anónimas. Son funciones pequeñas y rápidas definidas en una sola línea que son útiles
# cuando se necesita una función para un uso temporal
# Uso de lambda: parámetros: expresión.
# Ejemplo. función lambda para sumar 2 números.
suma = lambda a, b: a + b
print(suma(5, 3))

numeros = [1, 2, 3, 4, 5]   #Para multiplicar x 2 los números de mi lista.
dobles = list(map(lambda x: x * 2, numeros))
print(dobles)


# Funciones como objetos. Es decir, las funciones pueden ser asignadas a variables, pasarlas como argumentos y
# retornarlas desde otras funciones:
def saludo():
    return "Hola"
def despedida():
    return "Adiós"

# Asigno una función a una variable
accion = saludo
print(accion())

# Pasar funciones como argumento
def ejecutar_funcion(func):
    print(func())

ejecutar_funcion(despedida)


# Decoradores. Son funciones avanzadas que permiten modificar el comportamiento de una función sin cambiar su código.
# Son funciones que reciben otra función como argumento y devuelven una nueva función.
def decorador(func):
    def nueva_funcion():
        print("Antes de la función original")
        func()
        print("DESPUÉS de la función orginal")
    return nueva_funcion
@decorador
def saludar():
    print("hola")
saludar()