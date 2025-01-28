# Diseño de pruebas para los algoritmos

Este documento describe el diseño de pruebas para los algoritmos a realizar en el proyecto.

## Objetivo

El objetivo de este diseño de pruebas es asegurar que los algoritmos funcionen correctamente para cada caso.

---

# Problem 1: Binary search

La función de búsqueda binaria se utiliza para encontrar un elemento en una secuencia ordenada.

| Objetivo de la prueba | Clase | Método | Escenario | Datos de entrada | Resultado esperado |
|---|---|---|---|---|---|
| Verificar que la búsqueda binaria devuelve los índices correctos para elementos encontrados en la secuencia | TestsP1 | search | La secuencia tiene elementos encontrados | `List(5, 1, 5, 8, 12, 13)`, `List(5, 8, 1, 23, 1, 11)` | `List(2, 0, -1, 0, -1)` |
| Verificar que la búsqueda binaria devuelve -1 para elementos que no están presentes en la secuencia | TestsP1 | search | La secuencia no tiene elementos encontrados | `List(5, 1, 5, 8, 12, 13)`, `List(1, 7)` | `List(-1)` |
| Verificar que la búsqueda binaria devuelve los índices correctos para múltiples elementos encontrados en la secuencia | TestsP1 | search | La secuencia tiene múltiples elementos encontrados | `List(5, 1, 5, 8, 12, 13)`, `List(3, 5, 12, 1)` | `List(1, 3, 0)` |
| Verificar que la búsqueda binaria devuelve -1 para una secuencia vacía | TestsP1 | search | La secuencia está vacía | `List(0)`, `List(3, 5, 12, 1)` | `List(-1, -1, -1)` |
| Verificar que la búsqueda binaria devuelve -1 para una clave que es mayor que todos los elementos de la secuencia | TestsP1 | search | La clave es mayor que todos los elementos de la secuencia | `List(5, 1, 3, 5, 7, 9)`, `List(1, 10)` | `List(-1)` |

## Escenario

* La secuencia es una lista de números enteros, en el que el primer elemento n hace referencia a la cantidad de n elementos de la lista.
* La clave es un número entero.

## Datos de entrada

* **Secuencia con elementos encontrados:** `List(5, 1, 5, 8, 12, 13)`, `List(5, 8, 1, 23, 1, 11)`
* **Secuencia sin elementos encontrados:** `List(5, 1, 5, 8, 12, 13)`, `List(1, 7)`
* **Secuencia con múltiples elementos encontrados:** `List(5, 1, 5, 8, 12, 13)`, `List(3, 5, 12, 1)`
* **Secuencia vacía:** `List(0)`, `List(3, 5, 12, 1)`
* **Clave mayor que todos los elementos de la secuencia:** `List(5, 1, 3, 5, 7, 9)`, `List(1, 10)`

## Resultado esperado

* **Secuencia con elementos encontrados:** `List(2, 0, -1, 0, -1)`
* **Secuencia sin elementos encontrados:** `List(-1)`
* **Secuencia con múltiples elementos encontrados:** `List(1, 3, 0)`
* **Secuencia vacía:** `List(-1, -1, -1)`
* **Clave mayor que todos los elementos de la secuencia:** `List(-1)`

---

# Problem 2: Majority element

La función "MajorityElement" busca un elemento en una secuencia que aparezca más de la mitad de las veces en la secuencia.

| Objetivo de la prueba | Clase | Método | Escenario | Datos de entrada | Resultado esperado |
|---|---|---|---|---|---|
| Verificar que la función `isMajorityElement` devuelve 1 para una secuencia con un elemento mayoritario | TestsP2 | isMajorityElement | La secuencia tiene un elemento mayoritario | `List(2, 3, 9, 2, 2)` | `1` |
| Verificar que la función `isMajorityElement` devuelve 0 para una secuencia sin un elemento mayoritario | TestsP2 | isMajorityElement | La secuencia no tiene un elemento mayoritario | `List(1, 2, 3, 4)` | `0` |
| Verificar que la función `isMajorityElement` devuelve 0 para una secuencia sin un elemento mayoritario (repetido) | TestsP2 | isMajorityElement | La secuencia tiene un elemento mayoritario repetido | `List(1, 2, 3, 1)` | `0` |
| Verificar que la función `isMajorityElement` devuelve 1 para una secuencia con un solo elemento | TestsP2 | isMajorityElement | La secuencia tiene un solo elemento | `List(5)` | `1` |
| Verificar que la función `isMajorityElement` devuelve 0 para una secuencia grande sin un elemento mayoritario | TestsP2 | isMajorityElement | La secuencia no tiene un elemento mayoritario | `List(1, 2, 3, 4, 4, 4, 4, 4, 5, 6)` | `0` |

## Escenario

* La secuencia es una lista de números enteros.
* El elemento mayoritario es el elemento que aparece más veces en la secuencia.

## Datos de entrada

* **Secuencia con un elemento mayoritario:** `List(2, 3, 9, 2, 2)`
* **Secuencia sin un elemento mayoritario:** `List(1, 2, 3, 4)`
* **Secuencia sin un elemento mayoritario repetido:** `List(1, 2, 3, 1)`
* **Secuencia con un solo elemento:** `List(5)`
* **Secuencia grande sin un elemento mayoritario:** `List(1, 2, 3, 4, 4, 4, 4, 4, 5, 6)`

## Resultado esperado

* **Secuencia con un elemento mayoritario:** `1`
* **Secuencia sin un elemento mayoritario:** `0`
* **Secuencia sin un elemento mayoritario repetido:** `0`
* **Secuencia con un solo elemento:** `1`
* **Secuencia grande sim un elemento mayoritario:** `0`
  
---

# Problem 3: Organizing a lottery 

Calcular cuántos segmentos contienen cada punto en una línea. Los segmentos están definidos por sus extremos, y los puntos son números en esa línea.

| Objetivo de la prueba | Clase | Método | Escenario | Datos de entrada | Resultado esperado |
|---|---|---|---|---|---|
| Verificar que la función `countNumber` devuelve la lista correcta de conteos de segmentos para un conjunto de segmentos y puntos | TestsP3 | countNumber | La secuencia de segmentos y puntos no está vacía | `List(2, 0, 5, 7, 10), List(3, 1, 6, 11)` | `List(1, 0, 0)` |
| Verificar que la función `countNumber` devuelve la lista correcta de conteos de segmentos para un conjunto de segmentos y puntos | TestsP3 | countNumber | La secuencia de segmentos solo tiene un segmento | `List(1, -10, 10), List(3, -100, 100, 0)` | `List(0, 0, 1)` |
| Verificar que la función `countNumber` devuelve la lista correcta de conteos de segmentos para un conjunto de segmentos y puntos | TestsP3 | countNumber | La secuencia de segmentos tiene segmentos negativos | `List(3, 0, 5, -3, 2, 7, 10), List(2, 1, 6)` | `List(2, 0)` |
| Verificar que la función `countNumber` devuelve la lista correcta de conteos de segmentos para un conjunto de segmentos y puntos | TestsP3 | countNumber | La secuencia de segmentos solo tiene segmentos coincidentes | `List(3, 0, 0, 0, 0, 0, 0), List(3, 0, 0, 0)` | `List(3, 3, 3)` |
| Verificar que la función `countNumber` devuelve la lista correcta de conteos de segmentos para un conjunto de segmentos y puntos | TestsP3 | countNumber | La secuencia de segmentos tiene segmentos que se superponen | `List(4, -10, 0, 0, 10, 5, 15, -5, 5), List(4, -5, 0, 5, 10)` | `List(2, 3, 3, 2)` |

## Escenario

* La secuencia de segmentos no está vacía.
* La secuencia de puntos no está vacía.

## Datos de entrada

* **Secuencia de segmentos:**
* `List(2, 0, 5, 7, 10)
* `List(1, -10, 10)
* `List(3, 0, 5, -3, 2, 7, 10)
* `List(3, 0, 0, 0, 0, 0, 0)
* `List(4, -10, 0, 0, 10, 5, 15, -5, 5)

* **Secuencia de puntos:** 
*  ````List(3, 1, 6, 11)
* ``List(3,-100, 100, 0)
* ``List(2, 1, 6)
* ``List(3, 0, 0, 0)
* ``List(4, -5, 0, 5, 10)`
## Resultado esperado

* **Lista de conteos de segmentos:**
*  `List(1, 0, 0)`
*  `List(0, 0, 1)`
*  `List(2, 0)`
*  `List(3, 3, 3)`
*  `List(2, 3, 3, 2)




