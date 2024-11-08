# Vamos a definir un pedido

def cliente():
    cliente = []
    nombre = str(input("Introduzca nombre de cliente: "))
    cliente.append(nombre)
    tel = int(input("Introduzca numero de telefono: "))
    cliente.append(tel)
    print(cliente)
    return cliente

cliente()