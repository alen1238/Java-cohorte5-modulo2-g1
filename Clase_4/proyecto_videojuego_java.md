# Proyecto Java -- 🎮 Videojuego con Clases, Interfaces, Polimorfismo y Patrón de Diseño

## Objetivo General

Desarrollar un proyecto en Java enfocado en un videojuego, donde los
estudiantes apliquen los conceptos de:

-   Clases y objetos\
-   Herencia\
-   Interfaces\
-   Polimorfismo\
-   Abstracción\
-   Patrón de diseño (Strategy)

El proyecto busca demostrar cómo los personajes pueden tener
comportamientos intercambiables (ataques, saltos, movimientos, etc.) que
pueden cambiar dinámicamente gracias al polimorfismo.

------------------------------------------------------------------------

#  Estructura de Carpetas Sugerida

Se propone la siguiente estructura del proyecto:

    src/
     ├── personajes/
     │     ├── Personaje.java
     │     ├── Mario.java
     │     └── Enemigo.java
     │
     ├── estrategias/
     │     ├── ataque/
     │     │      ├── EstrategiaAtaque.java
     │     │      ├── AtaqueFuego.java
     │     │      └── AtaqueEspada.java
     │     │
     │     └── salto/
     │            ├── EstrategiaSalto.java
     │            ├── SaltoAlto.java
     │            └── SaltoCorto.java
     │
     └── Main.java

> Nota:\
> Los archivos `.java` deberán crearse por los estudiantes. Esta
> estructura solamente guía la organización del proyecto.

------------------------------------------------------------------------

#  Descripción del Proyecto

Crear un **mini motor de personajes para un videojuego**.\
Cada personaje debe estar compuesto por:

-   Una **clase base abstracta** que represente un personaje genérico.\
-   Una o varias **interfaces** que definan comportamientos (ataque,
    salto, movimiento, etc.).\
-   Varias **implementaciones concretas** de esas interfaces.\
-   Personajes concretos que usen estas implementaciones.\
-   Capacidad de cambiar comportamientos en tiempo de ejecución para
    demostrar polimorfismo.

Se recomienda usar el **Patrón de Diseño Strategy** para gestionar los
comportamientos.

------------------------------------------------------------------------

# Requisitos del Proyecto

## 1. Clase base abstracta

Crear una clase `Personaje` con:

-   Un nombre\
-   Métodos generales (`atacar()`, `saltar()`)\
-   Atributos para almacenar estrategias\
-   Métodos para cambiar dichas estrategias en tiempo de ejecución

------------------------------------------------------------------------

## 2. Interfaces de comportamiento

Crear al menos dos interfaces, por ejemplo:

-   `EstrategiaAtaque`
-   `EstrategiaSalto`

Cada interfaz solo debe declarar métodos, sin implementación.

------------------------------------------------------------------------

## 3. Implementaciones concretas

Crear varias clases que implementen dichas interfaces.\
Ejemplos:

### Ataques posibles

-   Ataque con fuego\
-   Ataque con espada\
-   Ataque con rayo\
-   Ataque contundente

### Tipos de salto posibles

-   Salto alto\
-   Salto corto\
-   Salto flotado

Cada implementación debe mostrar mensajes diferentes para evidenciar el
polimorfismo.

------------------------------------------------------------------------

## 4. Clases de personajes concretos

Crear uno o más personajes que **extiendan la clase base**.

Ejemplos sugeridos:

-   `Mario`
-   `Enemigo`
-   `Guerrero`
-   `Mago`

Cada personaje debe tener comportamientos predeterminados.

------------------------------------------------------------------------

## 5. Demostración en el método main

En la clase `Main`:

-   Crear un personaje
-   Ejecutar acciones (atacar, saltar, etc.)
-   Cambiar sus estrategias en tiempo real
-   Mostrar nuevamente los comportamientos ya modificados

Esto debe evidenciar el polimorfismo.

------------------------------------------------------------------------
# Nota para los Estudiantes

Este proyecto está diseñado para que entiendas cómo los videojuegos reales utilizan objetos y estrategias para representar personajes dinámicos y flexibles. Con este enfoque verás por qué el polimorfismo es una de las herramientas más poderosas para crear software mantenible,
escalable y elegante.
