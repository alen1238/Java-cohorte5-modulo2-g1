# Ejercicio Avanzado de POO: Mini-Spotify en Java

*Modelamiento con clases, arreglos, herencia, interfaces, polimorfismo y
sobrecarga.*

Este proyecto tiene como propósito que el estudiante aplique de manera
integrada varios pilares de la programación orientada a objetos,
utilizando únicamente **clases**, **arreglos** y **relaciones entre
objetos**, sin colecciones avanzadas ni bases de datos. El sistema debe
simular un entorno básico similar a Spotify, con reproducción de
canciones, gestión de playlists y administración de una cuenta de
usuario.

## 1. Interfaz Reproducible

Cree una interfaz llamada **Reproducible** que represente cualquier
elemento capaz de ser reproducido.

-   Métodos:
    -   `void reproducir();`
    -   `void detener();`

Cualquier clase que pueda ser "reproducida" deberá implementarla,
permitiendo luego hacer uso de **polimorfismo**.

## 2. Clase base Multimedia (Herencia y Encapsulamiento)

Cree una clase abstracta llamada **Multimedia** que servirá como
superclase para diferentes tipos de elementos de audio.

-   Atributos protegidos:
    -   `String titulo`
    -   `int duracionSegundos`
-   Métodos:
    -   Constructores (incluya **sobrecarga**).
    -   Getters y setters.
    -   Método abstracto `String getInfo();`

## 3. Clase Cancion (Herencia + Polimorfismo)

Esta clase hereda de **Multimedia** e implementa **Reproducible**.

-   Atributos:
    -   `String artista`
-   Métodos:
    -   Implementación de los métodos abstractos.
    -   Implementación polimórfica de `reproducir()` y `detener()`.
    -   Sobrescritura de `toString()`.

## 4. Clase Playlist (Agregación + Sobrecarga)

-   Atributos:
    -   `String nombre`
    -   `Cancion[] canciones`
    -   `int contadorCanciones`
    -   `int maxCanciones`
-   Métodos:
    -   `agregarCancion(Cancion c)`
    -   **Sobrecarga**:
        `agregarCancion(String titulo, String artista, int duracion)`
    -   `listarCanciones()`
    -   `reproducirCancion(int index)`
    -   `estaLlena()`

## 5. Clase BibliotecaMusical

-   Atributos:
    -   `Cancion[] catalogo`
    -   `int contadorCatalogo`
    -   `int maxCatalogo`
-   Métodos:
    -   `agregarCancion(Cancion c)`
    -   `buscarPorNombre(String nombre)`
    -   `listarCatalogo()`

## 6. Clase CuentaSpotify

-   Atributos:
    -   `String usuario`
    -   `String password`
    -   `Playlist[] playlists`
    -   `BibliotecaMusical biblioteca`
    -   `boolean sesionIniciada`
-   Métodos:
    -   `iniciarSesion(String u, String p)`
    -   `agregarPlaylist(Playlist p)`
    -   `agregarCancionAPlaylist(String playlist, Cancion c)`
    -   `reproducir(String playlist, int indexCancion)`
    -   `cerrarSesion()`

## 7. Clase SpotifyApp (Simulación Completa por Menú Textual)

La clase **SpotifyApp** será el punto de entrada del programa
(`public static void main`). Su función principal es simular el
funcionamiento básico del mini-Spotify mediante un **menú interactivo en
consola**, donde el usuario pueda iniciar sesión, gestionar su
biblioteca musical, manipular playlists y reproducir canciones.

### A. Preparación antes del menú

1.  Crear una instancia de `CuentaSpotify`.
2.  Crear una instancia de `BibliotecaMusical`.
3.  Cargar canciones de prueba.
4.  Asociar la biblioteca a la cuenta.

### B. Menú principal esperado

    === MINI-SPOTIFY ===
    1. Iniciar sesión
    2. Gestionar Biblioteca Musical
    3. Gestionar Playlists
    4. Reproducir Canciones
    5. Cerrar sesión
    6. Salir del programa

### C. Submenús y funcionamiento

#### 1. Iniciar sesión

Validar usuario y contraseña e impedir acceso a opciones si la sesión no
está activa.

#### 2. Gestionar Biblioteca Musical

Submenú:

    1. Listar canciones
    2. Agregar canción
    3. Buscar por nombre
    4. Volver

#### 3. Gestionar Playlists

Submenú:

    1. Crear playlist
    2. Listar playlists
    3. Agregar canción a playlist
    4. Ver canciones
    5. Volver

#### 4. Reproducir Canciones

Submenú:

    1. Reproducir canción desde playlist
    2. Detener reproducción
    3. Volver

Uso explícito de la interfaz **Reproducible** y polimorfismo.

#### 5. Cerrar sesión

Desactiva `sesionIniciada`.

#### 6. Salir

Finaliza el programa.

## 8. Tareas del estudiante

1.  Implementar todas las clases.
2.  Demostrar uso de herencia, interfaces, sobrecarga y polimorfismo.
3.  Implementar menú funcional con manejo de errores.
4.  Crear y reproducir playlists.

## 9. Estructura de carpetas sugerida del proyecto

📦 mini-spotify/
│
├── 📁 src/
│   │
│   ├── 📁 modelo/
│   │   ├── Reproducible.java
│   │   ├── Multimedia.java
│   │   ├── Cancion.java
│   │   ├── Playlist.java
│   │   ├── BibliotecaMusical.java
│   │   └── CuentaSpotify.java
│   │
│   ├── 📁 app/
│   │   └── SpotifyApp.java
│   │
│   └── 📁 utils/   *(Opcional, según complejidad del estudiante)*
│       └── Entrada.java
│
├── 📁 docs/
│   ├── enunciado_spotify_avanzado.md
│   ├── diagrama_clases_plantuml.puml
│   └── estructura_proyecto.md
│
├── 📁 diagrams/
│   └── clases.png  
│
├── README.md
└── .gitignore

# Ejemplo de Ejecución del Mini-Spotify (Simulación por Consola)

A continuación se presenta una simulación completa del funcionamiento de
la aplicación Mini-Spotify en consola. El objetivo es mostrar cómo se
visualizan los menús, la interacción del usuario y el flujo general del
sistema una vez implementado.

    === MINI-SPOTIFY ===
    1. Iniciar sesión
    2. Gestionar Biblioteca Musical
    3. Gestionar Playlists
    4. Reproducir Canciones
    5. Cerrar sesión
    6. Salir del programa
    Seleccione una opción: 1

    --- INICIAR SESIÓN ---
    Usuario: enrique
    Contraseña: 1234
    Inicio de sesión exitoso. Bienvenido, enrique.


    === MINI-SPOTIFY ===
    1. Iniciar sesión
    2. Gestionar Biblioteca Musical
    3. Gestionar Playlists
    4. Reproducir Canciones
    5. Cerrar sesión
    6. Salir del programa
    Seleccione una opción: 2

    --- GESTIÓN DE BIBLIOTECA ---
    1. Listar canciones
    2. Agregar canción
    3. Buscar por nombre
    4. Volver
    Seleccione: 1

    --- LISTA DE CANCIONES EN BIBLIOTECA ---
    [0] Shape of You - Ed Sheeran (240s)
    [1] Believer - Imagine Dragons (210s)
    [2] Thunderstruck - AC/DC (290s)
    [3] Someone Like You - Adele (300s)
    ------------------------------------------
    Total: 4 canciones

    Presione ENTER para continuar...


    --- GESTIÓN DE BIBLIOTECA ---
    1. Listar canciones
    2. Agregar canción
    3. Buscar por nombre
    4. Volver
    Seleccione: 2

    --- AGREGAR CANCIÓN ---
    Título: Perfect
    Artista: Ed Sheeran
    Duración en segundos: 263
    Canción agregada exitosamente a la biblioteca.

    Presione ENTER para continuar...


    --- GESTIÓN DE BIBLIOTECA ---
    1. Listar canciones
    2. Agregar canción
    3. Buscar por nombre
    4. Volver
    Seleccione: 3

    --- BUSCAR CANCIÓN ---
    Ingrese nombre o fragmento: Thunder
    Resultado encontrado:
    Thunderstruck - AC/DC (290s)

    Presione ENTER para continuar...

    Volviendo al menú principal...


    === MINI-SPOTIFY ===
    1. Iniciar sesión
    2. Gestionar Biblioteca Musical
    3. Gestionar Playlists
    4. Reproducir Canciones
    5. Cerrar sesión
    6. Salir del programa
    Seleccione una opción: 3

    --- GESTIÓN DE PLAYLISTS ---
    1. Crear playlist
    2. Listar playlists
    3. Agregar canción a playlist
    4. Ver canciones de una playlist
    5. Volver
    Seleccione: 1

    --- CREAR PLAYLIST ---
    Ingrese nombre: Favoritas 2025
    Playlist creada correctamente.

    Presione ENTER para continuar...


    --- GESTIÓN DE PLAYLISTS ---
    1. Crear playlist
    2. Listar playlists
    3. Agregar canción a playlist
    4. Ver canciones de una playlist
    5. Volver
    Seleccione: 3

    --- AGREGAR CANCIÓN A PLAYLIST ---
    Nombre de la playlist: Favoritas 2025
    Seleccione canción del catálogo:

    [0] Shape of You - Ed Sheeran
    [1] Believer - Imagine Dragons
    [2] Thunderstruck - AC/DC
    [3] Someone Like You - Adele
    [4] Perfect - Ed Sheeran

    Ingrese índice de canción: 0
    Canción agregada correctamente a la playlist.

    Presione ENTER para continuar...


    --- GESTIÓN DE PLAYLISTS ---
    1. Crear playlist
    2. Listar playlists
    3. Agregar canción a playlist
    4. Ver canciones de una playlist
    5. Volver
    Seleccione: 4

    --- VER CANCIONES EN PLAYLIST ---
    Playlist: Favoritas 2025
    [0] Shape of You - Ed Sheeran (240s)
    ------------------------------------------
    Total: 1 canción

    Presione ENTER para continuar...


    Volviendo al menú principal...

    === MINI-SPOTIFY ===
    1. Iniciar sesión
    2. Gestionar Biblioteca Musical
    3. Gestionar Playlists
    4. Reproducir Canciones
    5. Cerrar sesión
    6. Salir del programa
    Seleccione una opción: 4

    --- REPRODUCCIÓN ---
    1. Reproducir canción desde playlist
    2. Detener reproducción
    3. Volver
    Seleccione: 1

    --- REPRODUCIR DESDE PLAYLIST ---
    Nombre de la playlist: Favoritas 2025
    Canciones disponibles:
    [0] Shape of You - Ed Sheeran

    Ingrese índice de canción: 0

    Reproduciendo...
    ♪ Shape of You - Ed Sheeran (duración: 240s)

    Presione ENTER para continuar...

    --- REPRODUCCIÓN ---
    1. Reproducir canción desde playlist
    2. Detener reproducción
    3. Volver
    Seleccione: 2

    Reproducción detenida.


    Volviendo al menú principal...

    === MINI-SPOTIFY ===
    1. Iniciar sesión
    2. Gestionar Biblioteca Musical
    3. Gestionar Playlists
    4. Reproducir Canciones
    5. Cerrar sesión
    6. Salir del programa
    Seleccione una opción: 5

    Sesión cerrada.

    === MINI-SPOTIFY ===
    1. Iniciar sesión
    2. Gestionar Biblioteca Musical
    3. Gestionar Playlists
    4. Reproducir Canciones
    5. Cerrar sesión
    6. Salir del programa
    Seleccione una opción: 6

    Gracias por usar Mini-Spotify. ¡Hasta pronto!