# Programa que solicite al usuario el ingreso de una temperatura en escala Fahrenheit (debe permitir decimales) y le muestre el equivalente en Celsius.
    # La fórmula de conversión que se usa para este cálculo es: Celsius = (5/9) * (Fahrenheit - 32)

fahrenheit = float(input("introduzca temperatura en fahrenteit a convertir:"))
celsius = (5 / 9) * (fahrenheit - 32)
print(celsius, "ºC")