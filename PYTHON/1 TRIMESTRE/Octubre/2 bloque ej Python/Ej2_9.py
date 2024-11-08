# Ejercicio 2_9: Contraseña correcta. Escribe un programa que pida una contraseña y vuelva
# a pedirla hasta que el usuario la introduzca correctamente.

password = str(input("Introduzca contraseña: "))
while password != "correcta":
    password = str(input("Contraseña incorrecta, por favor, introduzca contraseña válida: "))

print("CONTRASEÑA CORRECTA, !!ADELANTE!!")
