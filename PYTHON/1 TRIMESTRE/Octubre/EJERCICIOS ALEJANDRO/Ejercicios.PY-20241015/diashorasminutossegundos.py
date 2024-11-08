''' Programa que lea una cantidad en segundos y muestre su equivalente en semanas, días, horas, minutos y segundos, según el formato de los siguientes ejemplos:

2178585 segundos equivalen a [ 3] semanas, 4 días, 05:09:45'''

#Declaro constantes

SEG_MIN = 60
MIN_HORA = 60
HORAS_DIA = 24
DIAS_SEMANA = 7

# Hago conversiones, pero siguen siendo constantes

SEG_HORA = SEG_MIN * MIN_HORA
SEG_DIA = SEG_HORA * HORAS_DIA
SEG_SEMANA = SEG_DIA * DIAS_SEMANA

seg_totales = int(input("Introduce segundos: "))

# 
semanas = seg_totales // SEG_SEMANA
resto = seg_totales % SEG_SEMANA

dias = resto // SEG_DIA
resto = resto % SEG_DIA

horas = resto // SEG_HORA
resto = resto % SEG_HORA

minutos = resto // SEG_MIN
segundos = resto % SEG_MIN

print(f"{seg_totales} equivalen a [{semanas:2}] semanas, {dias} dias, {horas:02}:{minutos:02}:{segundos:02} ")


# {variable:n} inserta el valor y asegura que tenga n espacios
# {variable:0n} inserta el valor y lo rellena con ceros a la izquierda. Así me aseguro de que tenga al menos n dígitos.