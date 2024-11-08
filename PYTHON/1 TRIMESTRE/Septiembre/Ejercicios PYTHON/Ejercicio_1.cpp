// Example program
#include<iostream>
using namespace std;

int main()
{   
    int dato1, dato2, aux;
    cout << "Introduzca dos numeros enteros:";
    cin >> dato1 >> dato2;
    
    aux = dato1;
    dato1 = dato2;
    dato2 = aux;
    
    cout << "valor almacenado en dato1: " << dato1 << endl;
    cout << "valor almacenado en dato2: " << dato2 << endl;
    
}