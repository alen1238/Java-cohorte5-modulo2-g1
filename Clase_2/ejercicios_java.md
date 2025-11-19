# Ejercicios Prácticos de Java  
Integración de Clases, Objetos, Encapsulamiento, Abstracción y Getters/Setters

## 1. Perfil de Usuario tipo Instagram
Crea una clase `PerfilInstagram` que represente un perfil básico de red social.  
Debe contener atributos privados como `username`, `seguidores` y `biografia`, además de métodos getters y setters.  
En el `main`, crea dos perfiles, modifica sus datos y simula un “follow”.

## 2. Carrito de Compras tipo MercadoLibre
Crea la clase `Producto` y la clase `Carrito`.  
Simula agregar productos y calcular el total.  
Debes aplicar abstracción: el usuario solo debe ver métodos simples como `agregarProducto` o `mostrarTotal`.

## 3. Sistema de Pedidos estilo Rappi
Crea la clase `Pedido` con atributos privados como `restaurante`, `plato`, `precio` y `estado`.  
Implementa métodos para cambiar el estado del pedido simulando su progreso.

## 4. Canción estilo Spotify
Crea una clase `Cancion` con atributos como `titulo`, `artista`, `duracion` y `reproducciones`.  
Agrega un método `reproducir()` que aumente el contador.  
En el `main`, crea canciones y determina cuál fue más reproducida.

## 5. Noticia tipo Google News
Crea una clase `Noticia` con atributos `titulo`, `categoria`, `contenido` y `vistas`.  
El setter de `contenido` debe impedir cambios cuando supere 100 vistas.  
Incluye el método `leer()` que incremente vistas.

## 6. Sistema de Login básico
Crea una clase `CuentaUsuario` con `email`, `password` y `intentosFallidos`.  
No debe existir un getter de la contraseña.  
Simula intentos de inicio de sesión y bloquea la cuenta tras 3 fallos.

## 7. Inventario en videojuegos
Una clase `Item` y una clase `Personaje`.  
Permite equipar un ítem y mostrar el estado del personaje.

## 8. Sistema de Likes tipo TikTok o YouTube
Crea la clase `Video` con atributos `titulo`, `creador`, `likes` y `vistas`.  
Implementa `darLike()` y `ver()`.  
Simula vistas y likes desde el `main`.
