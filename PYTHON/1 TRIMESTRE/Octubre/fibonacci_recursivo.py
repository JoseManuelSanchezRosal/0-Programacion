
def fibonacci_recursivo(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci_recursivo(n-1) + fibonacci_recursivo(n-2)  # Aqui es donde usamos la recursividad. con n-1 + n-2
        
    
    # Ejemplo de uso
print(fibonacci_recursivo(7))   #Aqui decimos que n = 7 en lugar de poner un input