#Números impares entre 2 números.
inicio = int(input("Ingresa primer número: "))
fin = int(input("Ingresa segundo número: "))
for i in range(inicio, fin + 1):
    if i % 2 != 0:
        print(i)
