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
    opcion = int(input("Introduzca opcion: "))
    print(f"Ha seleccionado la opcion {opcion}")
    return(opcion)

opt = 0
while(opt!=7):
    opt = menu()
