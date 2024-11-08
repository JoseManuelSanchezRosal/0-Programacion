# Ejercicios de repaso con funciones

lista = []
def dame_nombre():
    
    for i in range(1,6):
        n = str(input("Dame nombre: "))
        lista.append(n)
    return lista

lista_nombres = dame_nombre()
print(lista_nombres)