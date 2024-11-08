'''Programa que lea una cantidad en segundos y muestre su equivalente
en semanas, días, minutos y segundos, según el formato de los 
siguientes ejemplos:
2178585 segundos quivalen a [ 3] semanas, 4 días, 05:09: 45'''

# Declaramos constantes (tienen el mismo valor siempre), EN MAYÚSCULAS:

SEG_MIN = 60
MIN_HORA = 60
HORAS_DIA = 24
DIA_SEMANA = 7

# Hago conversiones pero siguen siendo constantes, esta vez para saber cuantos segundos tiene una hora, dia y semana:
SEG_HORA = SEG_MIN * MIN_HORA   #
SEG_DIA = SEG_HORA * HORAS_DIA
SEG_SEMANA = SEG_DIA * DIA_SEMANA

seg_totales = int(input("Introduzca segundos: "))

semanas = seg_totales // SEG_SEMANA #En lugar de dividir (/) si usamos (//) es para sacar la división entera, por ejemplo 7 // 2 = 3 (es 3.5 pero nos devuelve el 3)
resto = seg_totales % SEG_SEMANA

dias = resto // SEG_DIA
resto = resto % SEG_DIA

horas = resto // SEG_HORA
resto = resto % SEG_HORA

minutos = resto // SEG_MIN
segundos = resto % SEG_MIN

print(f"{seg_totales} equivalen a [ {semanas:2}] semanas, {dias}, dias, {horas:02}:{minutos:02}:{segundos:02} ")
# {variable:n} inserta el valor y asegura que tenga n espacios.
# {variable:0n} inserta el valor y lo rellena con ceros a la izquierda. Así me aseguro de que tenga al menos n dígitos.