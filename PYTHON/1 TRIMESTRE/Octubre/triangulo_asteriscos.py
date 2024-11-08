# Ejercicio. Dibujar un triangulo de asteriscos con altura N
# El ejercicio solicita leer un numero entero N del teclado para dibujar un triangulo de asteriscos.
# Se deben definir al menos 3 subprogramas

def dibujar_linea(n):   # Definimos dibujar linea que simplemente imprime "*" un numero "n" de veces 
    print("*" * n)
    
def dibujar_triangulo(n):
    for i in range(1, n+1): # Definimos el rango de nuestro print de dibujar linea (segun las lineas "n" introducidas)
        dibujar_linea(2*i-1)    # Para hacer el salto de 1 a 3, 5, 7, etc asteriscos.
        
def main():
    n = int(input("Introduce la altura del triangulo: "))   # Pedimos al usuario que introduzca la altura del triangulo.
    dibujar_triangulo(n)    # Llamamos a la funcion de dibujar triangulo

main()    # simpre tenemos llamado el main