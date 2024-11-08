# Ejercicio que solicita leer dos número enteros de teclado y sumar todos los numeros pares en el intervalo. También se debe definir un procedimiento para la lectura correcta del intervalo y una función para calcular la suma

def leer_intervalo():
    a = int(input("Primer numero: "))
    b = int(input("Segundo numero: "))
    while(a >b):
        print("El primer numero debe ser menor")
        a = int(input("Primer numero: "))
        b = int(input("Segundo numero: "))
    return a, b

def suma_pares(a, b):   # Con esta funcion vamos sumando a la variable "suma" todos los numeros pares entre los numeros introducidos.
    suma = 0
    for i in range(a, b+1):
        if i % 2 == 0:  # Si i % 2 == 0 (numero par). Si i % 2 !=0 (numero impar)
            suma += i   # Con esto vamos sumando el valor de "i" a la variable suma.
    return suma

def main():
    a, b = leer_intervalo() # Llamamos a la funcion de lectura. A y b se correspondera a lo que el usuario haya introducido
    resultado = suma_pares(a, b)
    print(f"La suma de los números pares entre {a} y {b} es: {resultado}")
    
main()    