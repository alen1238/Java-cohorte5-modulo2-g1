# Ejercicio: Spotify en Java



El sistema debe permitir gestionar canciones, playlists, un catálogo
musical y una cuenta de usuario capaz de iniciar sesión, crear
playlists, agregar canciones y reproducirlas. No se permiten colecciones
avanzadas ni bases de datos. Todo debe manejarse con clases y arreglos.

## Requisitos

### Clase Cancion

-   Atributos:
    -   String titulo
    -   String artista
    -   int duracionSegundos
-   Constructor con parámetros.
-   Método toString.

### Clase Playlist

-   Atributos:
    -   String nombre
    -   Cancion\[\] canciones
    -   int contadorCanciones
    -   int maxCanciones
-   Métodos:
    -   agregarCancion(Cancion c)
    -   listarCanciones()
    -   reproducirCancion(int index)
    -   estaLlena()

### Clase BibliotecaMusical

-   Atributos:
    -   Cancion\[\] catalogo
    -   int contadorCatalogo
    -   int maxCatalogo
-   Métodos:
    -   agregarCancion(Cancion c)
    -   buscarPorNombre(String nombre)
    -   listarCatalogo()

### Clase CuentaSpotify

-   Atributos:
    -   String usuario
    -   String password
    -   Playlist\[\] playlists
    -   BibliotecaMusical biblioteca
    -   boolean sesionIniciada
-   Métodos:
    -   iniciarSesion(String u, String p)
    -   agregarPlaylist(Playlist p)
    -   agregarCancionAPlaylist(String playlist, Cancion c)
    -   reproducir(String playlist, int indexCancion)
    -   cerrarSesion()

### Clase SpotifyApp

Debe permitir simular el uso del sistema mediante un menú textual o un
flujo predefinido.

## Tareas del estudiante

1.  Implementar todas las clases.
2.  Crear una simulación funcional.
3.  Probar la reproducción de canciones.
4.  Manejar errores comunes como índices inválidos o playlists llenas.
