# Dada una nota almacenadaen una variable tras ser leída, imprimir su equivalente:
    # >= 0 pero < 5 suspenso
    # >= 5 pero < 6 suficiente
    # >= 6 pero < 7 bien
    # >= 7 pero < 9 notable
    # >= 9 pero < 10 sobresaliente
    # == 10 matrícula de honor
    # cualquier otro caso, nota no válida


n = float(input("Introduzca su nota:"))

if n >= 0 and n < 5:
    print("INSUFICIENTE")
elif n >= 5 and n < 6:
    print("SUFICIENTE")
elif n >= 6 and n < 7:
    print("BIEN")
elif n >= 7 and n < 9:
    print("NOTABLE")
elif n >= 9 and n < 10:
    print("SOBRESALIENTE")
elif n == 10:
    print("MATRÍCULA")
else:
    print("Nota NO VALIDA")