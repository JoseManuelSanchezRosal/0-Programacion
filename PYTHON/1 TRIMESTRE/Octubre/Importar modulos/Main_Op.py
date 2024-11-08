# Creamos archivo Main_Op y usamos esas funciones.

# Para usar el contenido de un módulo en otro archivo -> import

import Operaciones # De esta forma importamos un archivo entero. Para imprimir CASOS 1, 2 y 3
from Operaciones import multiplicar # Para importar sólo una funcion dentro de un archivo, en este caso "multiplicar" CASO 4

resultado_sumar = Operaciones.sumar(10, 5)  #1
print(resultado_sumar)

resultado_restar = Operaciones.restar(10, 5)    #2
print(resultado_restar)

resultado_dividir = Operaciones.dividir(10, 5)  #3
print(resultado_dividir)

print(multiplicar(10, 5))   #4


