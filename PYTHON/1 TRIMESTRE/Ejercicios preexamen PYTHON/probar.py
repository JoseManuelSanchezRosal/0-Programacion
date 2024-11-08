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
    for i in range(5):
        ing = int(input("Introduzca ingrediente: "))
        if ing == 0:
            pedido.append("Tomate")
        elif ing == 1:
            pedido.append("Queso")
        elif ing == 2:
            pedido.append("Nata") 
        elif ing == 3:
            pedido.append("Cebolla")
        elif ing == 4:
            pedido.append("Pollo")
        elif ing == 5:
            pedido.append("Huevo")
        elif ing == 6:
            pedido.append("Salami")
        elif ing == 7:
            pedido.append("Anchoa")
        elif ing == 8:
            pedido.append("Bacon")    
        elif ing == 7:
            pedido.append("Gamba")
    return pedido
print(pedido())
pedido()



