# FUNCIONES RECURSIVAS.
# Son funciones que se llaman a si mismas. Son utiles cuando un problema puede descomponerse en 
# subproblemas mas pequenos de la misma naturaleza
def factorial_recursivo(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial_recursivo(n-1)
    
print(factorial_recursivo(4))
