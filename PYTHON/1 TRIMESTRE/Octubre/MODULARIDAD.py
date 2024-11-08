# MODULARIDAD. Un módulo en Python es un archivo que contiene definiciones y declaraciones de variables, funciones y clases.
# Los módulos permiten organizar el código en partes reutilizables y separar funcionalidades dentro de un proyecto.
# Para usar el contenido de un módulo en otro archivo -> import

import modulo_mates

resultado_sumar = modulo_mates.sumar(5, 3)
print(resultado_sumar)

resultado_restar = modulo_mates.restar(5, 3)
print(resultado_restar)

# Creamos archivo operaciones.py con + - * y /
# Creamos archivo main.py y usamos esas funciones.