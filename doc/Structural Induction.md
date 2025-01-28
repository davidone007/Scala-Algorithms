# Problema 1: Binary Search

Definición recursiva para la función recursiva `searchIndex`: 

Definición del algoritmo

- Caso base: $\lambda$ (Lista vacía) = `result`

- Caso recursivo: h.T   (donde h ∈ N y T es una Lista) 
    

Demostración

Paso base: Sea `C` una lista tal que $\lambda$ entonces l($\lambda$) = `result`. En este caso `searchIndex(C)` = l($\lambda$) ya que al no haber ninguna clave por buscar dentro de la lista, entonces su resultado es la lista vacía `result` que no ha acumulado ningún índice de `C` hasta ese momento.

Paso inductivo: Consideremos una Lista de claves `C(x1,x2,x3…,xn+1)`. Supongamos que el algoritmo funciona para una lista `C'(x1,x2,x3..,xn)` de `C`. Si queremos hallar el índice de las claves de la lista `C` en una lista `A` , podemos usar la siguiente fórmula:

searchIndex(C) = searchIndex(C') ::: searchIndex(xn+1)

Donde:

- `searchIndex(C)` es la lista resultante de los índices de las claves  de la lista `C` en la lista `A`

- `searchIndex(C')` es la lista resultante de los índices de las claves de la lista `C'` en la lista `A`

- `xn+1` es la última clave de la lista `C`

- `searchIndex(xn+1)` es la Lista con el índice de `xn+1` en la lista `A`


Por hipótesis inductiva, sabemos que `searchIndex(C')` = `d`. Por lo tanto, podemos reemplazar `searchIndex(C')` en la fórmula anterior para obtener: 

searchIndex(C) = d ::: searchIndex(xn+1)

Por lo tanto, la lista de índices de la Lista `C` es igual a la concatenación de listas de los índices de la lista `C'` con la lista del índice de la última clave de `C`, o sea `(xn+1)`.

# Problema 2: Majority Element

La función `majorityTrigger` encuentra correctamente el elemento mayoritario en una lista `lTrigger` o devuelve 0 si no existe un elemento mayoritario.

Lo primero que se hace es definir una cadena de manera recursiva:

**Definición de Cadena (Recursiva)**:

- Caso Base: Una cadena vacía `λ` representa una lista vacía.
- Caso Recursivo: `C.x` representa una lista donde `C` es una lista de enteros y `x` es un número entero.

**Ahora definimos el caso base y el caso recursivo del algoritmo a probar:**

- Caso Base: `λ` (La cadena vacía) = 0. Cuando la lista está vacía, no hay elementos y el algoritmo devuelve 0.

- Caso recursivo: Si `x` es igual al resultado de la llamada recursiva `majorityTrigger(C)`, entonces `majorityTrigger(C.x)` debe devolver `x`. Esto significa que el elemento mayoritario encontrado en la sublista `C` es también el elemento mayoritario en la lista completa `C.x`.

- Si `x` no es igual al resultado de la llamada recursiva `majorityTrigger(C)`, entonces `majorityTrigger(C.x)` debe buscar el elemento mayoritario en la lista `C.x` y actuar en consecuencia para mantener la búsqueda del elemento mayoritario en la lista completa.

**Y por último procedemos a la demostración**:

**Paso Base**:

Cuando `lTrigger` es una lista vacía (`Nil`), la función `majorityTrigger` devuelve 0. Esto coincide con el caso base definido, por lo que el caso base está comprobado.

**Paso Recursivo**:

Supongamos que la función `majorityTrigger` funciona correctamente para todas las listas `lTrigger` de longitud `k` o menos, donde `k >= 0`.

Ahora, consideremos una lista `lTrigger` de longitud `k + 1`. La función `majorityTrigger` funciona de la siguiente manera:

1. Divide la lista en dos mitades, `left` y `right`.
2. Llama a `majorityTrigger` en ambas mitades para encontrar los elementos mayoritarios en `left` y `right`.
3. Compara los elementos mayoritarios en `left` y `right`:
   - Si son iguales, ese elemento es el elemento mayoritario en `lTrigger`.
   - Si son diferentes, cuenta cuántas veces aparece cada elemento mayoritario en `lTrigger` usando `count`. Si uno de los elementos aparece más de la mitad de las veces, se considera el elemento mayoritario en `lTrigger`.

Ahora, debemos considerar dos casos para la cabeza (primer elemento) de `lTrigger`:

**Caso 1: La cabeza de `lTrigger` es el elemento mayoritario**:

En este caso, la función `majorityTrigger` debería encontrar el elemento mayoritario correctamente, ya que es el elemento mayoritario en `lTrigger`.

**Caso 2: La cabeza de `lTrigger` no es el elemento mayoritario**:

En este caso, `majorityTrigger` podría encontrar el elemento mayoritario en `left`, `right`, o no encontrarlo. Sin embargo, la función `majorityTrigger` finalmente verifica si el elemento mayoritario encontrado es realmente mayoritario en `lTrigger` al contar cuántas veces aparece en `lTrigger`. Si el elemento encontrado es mayoritario en `lTrigger`, el algoritmo funciona correctamente.

En ambos casos, se ha demostrado que el algoritmo `majorityTrigger` funciona correctamente para una lista de longitud `k + 1`, por lo cual se ha finaliado la inducción estructural.



---

# Problema 3: Lottery

---

Definición recursiva para la función recursiva `countNumber`: 

Definición de cadena de dígitos

*       Caso base: λ (cadena vacía)
*       Caso recursivo: c . C  (c es una cadena formada por N y C ∈ N)

·        **Paso base**: Sea L una cadena tal que λ ∈ L, entonces `countNumber(L)` = acc porque al no haber ningún numero en la lista, el número de veces que el número $n$ está en los segmentos es igual a acc (acumulador)

·        **Paso recursivo:**
- Sea L una cadena de dígitos $L = a_{1a}. a_{1b}. a_{2a}. a_{2b}. a_{ka}. a_{kb}. a_{k+1a}. a_{k+1b}$ ; Donde cada dos elementos se crea un segmento, es decir, un segmento inicia en un $a_a$ y termina en un $a_b$

- Suponemos que el algoritmo funciona para $L' = a_{1a}. a_{1b}. a_{2a}. a_{2b}. a_{ka}. a_{kb}$ y que `countNumber(L') = d`

- Entonces para $L'.a_{k+1a}. a_{k+1b}$ el algoritmo entra al caso recursivo en el cual se calcula `countNumber(L') + countNumber(`$a_{k+1a}. a_{k+1b}$`)}` por hipótesis inductiva `countNumber(L') = d`
  
- Luego, d es la cantidad de veces que aparece el numero $n$ en los segmentos de la lista $L'$.

- Después calculamos `d + countNumber(`$a_{k+1a}. a_{k+1b}$`)}`.
  
- Si el número $n$ está en el segmento de  $a_{k+1a}. a_{k+1b}$ tenemos que la cantidad de veces que aparece $n$ en los segmentos dados de $L=d+1$ (donde al saber que  `countNumber(L') = d` y al volver a usar la función `countNumber` ya sabemos que es correcta)
  
- De lo contrario, si el número $n$ NO está en el segmento de  $a_{k+1a}. a_{k+1b}$  tenemos que la cantidad de veces que aparece $n$ en los segmentos dados de $L=d$
 
- Con esto demostramos que es válido para $k$ y $k+1$.
