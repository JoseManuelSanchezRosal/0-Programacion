# Ejercicio 5. Crear una lista de ingredientes para hacer una pizza. Escribe un programa que permita seleccionar ingredientes de una lista
# de ingredientes predefinidos para hacer una pizza. El usuario puede elegir hasta 5 ingredientes, al final, mostrar los ing. seleccionados.

print('''
      
      *******************************
      ****Ingredientes para pizza****
      *******************************
      1. Tomate.
      2. Cebolla.
      3. Pollo.
      4. Queso.
      5. Mozzarella.
      6. Champpinones.
      7. Bacon.
      8. York.
      9. Kebab.
      
      Nota: Pulse un numero e intro para anadir ingreidiente''')

tupizza = []

for i in range(5):
    
    ing = int(input("Introduzca ingrediente: "))
    if ing == 1:
        tupizza.append("Tomate")
    elif ing == 2:
        tupizza.append("Cebolla")
    elif ing == 3:
        tupizza.append("Pollo")
    elif ing == 4:
        tupizza.append("Queso")
    elif ing == 5:
        tupizza.append("Mozzarella")
    elif ing == 6:
        tupizza.append("Champinones")
    elif ing == 7:
        tupizza.append("Bacon")
    elif ing == 8:
        tupizza.append("York")
    elif ing == 9:
        tupizza.append("Kebab")  

print(f"Marchando tu pizza con los ingredientes:{tupizza}")