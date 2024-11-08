# Desarrolla un programa en Python que permita gestionar los pedidos de una pizzeria durante un durante un dia.
# El programa debe permitir almacenar informacion sobre los pedidos y proporcionoar funcionalidades para la gestion de los mismos.


def menu(): # Definimos nuestro menu de pizeria
    print('''
    MENU PIZZERIA
    1. Inicializar Pizzeria.
    2. Anadir pedido
    3. Eliminar pedido.
    4. Buscar pedido.
    5. Ingrediente preferido.
    6. Mostrar pedidos.
    7. SALIR
    ''')
    return(int(input))

def pedido():
    print('''''''''
        **********************************
        ****Ingredientes para tu pizza****
        **********************************
        0. Tomate.
        1. Queso.
        2. Nata.
        3. Cebolla.
        4. Pollo.
        5. Huevo.
        6. Salami.
        7. Anchoa.
        8. Bacon.
        9. Gamba.
        
        Nota: seleccione numero de ingrediente y pulse enter.
        ''')
    pedido = []

def main():
    opcion = menu()
    if opcion == 2:
        pedido()
        


if __name__ == "__main__":
        menu()