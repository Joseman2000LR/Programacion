<div align="justify">

# Tarea3

<!-- Recuerda que

## 1. Subtítulo tarea

### 1.1 Subtítulo de la tarea

-- Incluir imagenes

<div align="center">
    <img src="images/diagrama-flujo.png"/> 
</div>

-->
# Ejercicio1

## Escribe un programa en Java que imprima el patrón siguiente:
 ```
1 

2 3 

4 5 6 

7 8 9 10 
```
## Diagrama de flujos

## Pseudocódigo
Inicio

1. Para `i` desde 1 hasta 1, haz lo siguiente:
    a. Si `i` es igual a 1, entonces:
        i. Imprimir el valor de `i`.
        ii. Imprimir un salto de línea.
        iii. Imprimir un espacio en blanco.
    b. // primer bucle hace el 2 y 3
    c. Para `h` desde 2 hasta 3, haz lo siguiente:
        i. Imprimir el valor de `h` seguido de un espacio en blanco.
    d. Imprimir un salto de línea.
    e. Imprimir dos líneas en blanco.
    f. // segundo bucle hace el 4, 5, 6
    g. Para `p` desde 4 hasta 6, haz lo siguiente:
        i. Imprimir el valor de `p` seguido de un espacio en blanco.
    h. Imprimir un salto de línea.
    i. Imprimir dos líneas en blanco.
    j. // tercer bucle hace el 7, 8, 9 y 10
    k. Para `d` desde 7 hasta 10, haz lo siguiente:
        i. Imprimir el valor de `d` seguido de un espacio en blanco.
    l. Imprimir un salto de línea.
2. Fin del programa.

Fin


# Ejercicio2 

##  Escribe un programa en Java que encuentre el máximo común divisor *(MCD)*  de dos números. Se debe solicitar los números por teclado.

## Diagrama de flujos

## Pseudocódigo
inicio 

1. Definir las variables `numero1` y `numero2`.
2. Imprimir "Introduce primer número:".
3. Leer un entero desde la entrada estándar y almacenarlo en la variable `numero1`.
4. Imprimir "Introduce segundo número:".
5. Leer un entero desde la entrada estándar y almacenarlo en la variable `numero2`.
6. Mientras `numero2` no sea igual a 0, haz lo siguiente:
    a. Definir una variable `contador` y asignarle el valor de `numero2`.
    b. Calcular `numero2` como el residuo de la división de `numero1` entre `numero2`.
    c. Asignar el valor de `contador` a `numero1`.
7. Imprimir "MCD es " seguido del valor de `numero1`.
8. Fin del programa.

Fin
## Referencias

# Ejercicio3

##  Escribe un programa en Java que encuentre el número de *Fibonacci* en la posición n.  Se debe solicitar el número por teclado.

## Diagrama de flujos

## Pseudocódigo
Inicio 

1. Definir las variables: `numero`, `i`, `anterio`, `actual`, `resultado` y `posicion`.
2. Imprimir "Dime un número".
3. Leer un entero desde la entrada estándar y almacenarlo en la variable `numero`.
4. Si `numero` es menor o igual a 0, entonces:
    a. Imprimir "El número debe ser mayor que 0".
5. De lo contrario, hacer lo siguiente:
    a. Inicializar `anterio` en 0 y `actual` en 1.
    b. Para `i` desde 3 hasta `numero - 1`, hacer lo siguiente:
        i. Asignar el valor de `actual` a `resultado`.
        ii. Calcular `actual` como la suma de `actual` y `anterio`.
        iii. Asignar el valor de `resultado` a `anterio`.
        iv. Incrementar `posicion` en 1.
    c. Imprimir "El número indicado " seguido de `numero` y " está en la posición " seguido de `posicion`.
6. Fin del programa.

Fin

## Referencias
# Ejercicio4

##  Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.

## Diagrama de flujos

## Pseudocódigo
inicio 

1. Definir las variables: `numero`, `original` e `inverso`.
2. Imprimir "Dime un número".
3. Leer un entero desde la entrada estándar y almacenarlo en la variable `numero`.
4. Asignar el valor de `numero` a la variable `original`.
5. Inicializar `inverso` en 0.
6. // Bucle que descompone el número en dígitos y lo invierte
7. Mientras `numero` sea mayor que 0, hacer lo siguiente:
    a. Calcular el residuo de `numero` entre 10 y asignarlo a la variable `digito`.
    b. Calcular `inverso` como `inverso` multiplicado por 10 más `digito`.
    c. Dividir `numero` por 10 para eliminar el último dígito.
8. Si `inverso` es igual a `original`, entonces:
    a. Imprimir `original` seguido de " es un número palíndromo."
9. De lo contrario, hacer lo siguiente:
    a. Imprimir `original` seguido de " no es un número palíndromo."
10. Fin del programa.

Fin
## Referencias

# Ejercicio5

##  Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.

## Diagrama de flujos

## Pseudocódigo
inicio

 1. Definir las variables: `numero`, `i`, `anterio`, `actual` y `resultado`.
 2. Imprimir "Dime un número".
 3. Leer un entero  y asignarlo a la variable `numero`.
 4. Si `numero` es menor o igual a 0, entonces:
    a. Imprimir "El número debe ser mayor que 0".
 5. De lo contrario, hacer lo siguiente:
    a. Si `numero` es mayor o igual a 1, entonces:
        i. Imprimir "0".
    b. Si `numero` es mayor o igual a 2, entonces:
        i. Imprimir "1".
    c. Inicializar `anterio` en 0 y `actual` en 1.
    d. Para `i` desde 3 hasta `numero`, hacer lo siguiente:
        i. Asignar el valor de `actual` a `resultado`.
        ii. Calcular `actual` como la suma de `actual` y `anterio`.
        iii. Asignar el valor de `resultado` a `anterio`.
        iv. Imprimir `actual`.
 6. Fin del programa.

fin
## Referencias
# Ejercicio6

##  Escribe un programa en Java que encuentre todos los números *Armstrong* entre 1 y 1000.

## Diagrama de flujos

## Pseudocódigo
inico 
Entero numero
Entero valor = 0
Entero original
Entero cuenta = 0

Escribir "Dime un número"
Leer numero
original = numero

// Bucle que desglosa un número
Mientras numero > 0
    Entero digito = (numero % 10)
    Escribir digito
    digito = original
    numero = numero / 10
    cuenta = original + (numero / 10)

Escribir cuenta
 fin
## Referencias
# Ejercicio7

##  Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura *switch*

## Diagrama de flujos

## Pseudocódigo
Entero numero
Escribir "Dime un número"
Leer numero

Según numero Hacer
    Caso 1:
        Escribir "Lunes"
        Detener
    Caso 2:
        Escribir "Martes"
        Detener
    Caso 3:
        Escribir "Miércoles"
        Detener
    Caso 4:
        Escribir "Jueves"
        Detener
    Caso 5:
        Escribir "Viernes"
        Detener
    Caso 6:
        Escribir "Sábado"
        Detener
    Caso 7:
        Escribir "Domingo"
        Detener
    En otro caso:
        Escribir "El número introducido no corresponde a un día de la semana:", numero
Fin Según

## Referencias
# Ejercicio8

## Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.

## Diagrama de flujos

## Pseudocódigo
Entero rango
Entero numero = 1
Escribir "Dime el rango que quieres"
Leer rango
Escribir "Los números perfectos hasta el rango indicado son:"

Para Entero i desde numero hasta rango hacer
    Entero sumaDivisores = 0
    Para Entero j desde 1 hasta numero - 1 hacer
        Si numero % j == 0 entonces
            sumaDivisores = sumaDivisores + j
        Fin Si
    Fin Para
    Si sumaDivisores == numero entonces
        Escribir numero
    Fin Si
Fin Para

## Referencias
# Ejercicio9

##  Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.

## Diagrama de flujos

## Pseudocódigo
Entero numero
Entero resultado
Escribir "Dime la tabla del número que quieres"
Leer numero
Escribir "La tabla del ", numero, " es:"

Para Entero i desde 0 hasta numero hacer
    resultado = numero *i
    Escribir i, "*", numero, "=", resultado
Fin Para

## Referencias
# Ejercicio10

##  Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.

## Diagrama de flujos

## Pseudocódigo
Entero numero
Entero contador = 0
Entero resultado = 0
Escribir "Dime un número"
Leer numero

Hacer
    Si numero % 2 == 0 entonces
        resultado = numero / 2
        contador = contador + 1
    Fin Si
Mientras contador <= numero

Escribir "La suma de todos los pares hasta ", numero, " es ", resultado

## Referencias
</div>