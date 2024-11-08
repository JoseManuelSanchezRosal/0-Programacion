# Crea un programa que imprima todas las tablas de multiplicar del 1 al 9, ambos inclusive.
# Por ejemplo: 1*1 = 1
# Pista de eficiencia: Utiliza 2 for anidados

def es_primo(n):
    if n < 2:
        return False
    
    for i in range(2, n):
        if n % i == 0:
            return False
        
    return True

inicio = int(input("Introduce un nº: "))
fin = int(input("Introduce otro nº: "))

primos = []
for i in range (inicio, fin):
    if es_primo(i):
        primos.append(i)

print(f"Lista de números primos desde {inicio} hasta {fin}: {primos}")
        

    
