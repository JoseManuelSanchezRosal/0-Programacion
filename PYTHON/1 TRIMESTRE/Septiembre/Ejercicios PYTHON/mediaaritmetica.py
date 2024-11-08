'''Programa que calcule y escriba la media aritmética
de 3 números enteros leídos de teclado'''

n1, n2, n3 = map(int, input("Dame 3 números separados por espacio: ").split())  #Para declarar las 3 variables como entero en entrada(=map) separado por espacios(.split)

print(f"Los números son {n1}, {n2}, {n3}")  #Otra manera de imprimir sin tener que meter tantas comillas es con la funcin f y meter las variables en corchetes

print(type(n1)) #Imprimir tipo de variable en n1

media = float(n1 + n2 + n3) / 3
print(f"La media obtenida es {round(media, 2)}")   #Usamos round(), 2 para que el resultado que saquemos por pantalla sea con 2 decimales (media, 2)