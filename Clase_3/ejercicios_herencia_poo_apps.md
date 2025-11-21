# Herencia, Polimorfismo e Interfaces 

## Nivel 1 --- Herencia Básica

### 1. Usuarios YouTube

Crea la clase `UsuarioYouTube` con atributos `nombreUsuario`,
`suscriptores` y un método `mostrarPerfil()`.\
Crea la subclase `CreadorContenido` que agrega `categoria` y sobrescribe
`mostrarPerfil()`.

### 2. Productos MercadoLibre

Superclase `ProductoML` con `nombre`, `precio`, y método
`mostrarProducto()`.\
Subclase `ProductoTecnologia` que añade `garantiaMeses` y sobrescribe
`mostrarProducto()`.

------------------------------------------------------------------------

## Nivel 2 --- Sobrescritura + Polimorfismo

### 3. Reproductor Spotify

Superclase `ContenidoSpotify` con `reproducir()`.\
Subclases: `Cancion` y `Podcast`, cada una sobrescribe `reproducir()`.

### 4. Envíos Amazon

Superclase `EnvioAmazon` → `calcularCosto()`.\
Subclases: `EnvioNormal`, `EnvioPrime`, `EnvioInternacional`
(sobrescriben el método).

------------------------------------------------------------------------

## Nivel 3 --- Sobrecarga (Overloading)

### 5. Buscador Google

Clase `BuscadorGoogle` con métodos `buscar()` sobrecargados: -
buscar(texto) - buscar(texto, cantidadResultados) - buscar(texto,
incluirVideos)

### 6. Mensajería WhatsApp

Métodos sobrecargados: - enviarMensaje(texto) - enviarMensaje(texto,
contacto) - enviarMensaje(texto, contacto, esUrgente)

------------------------------------------------------------------------

## Nivel 4 --- Interfaces + Polimorfismo

### 7. Reacciones TikTok

Interfaz `Reaccionable` → método `reaccionar()`.\
Implementaciones: `Like`, `Corazon`, `Risa`, `Enojo`.

### 8. Métodos de Pago (Amazon / MercadoLibre)

Interfaz `MetodoPago` → `procesarPago(monto)`.\
Clases que la implementan: `PagoTarjeta`, `PagoPayPal`,
`PagoCriptomonedas`, `PagoContraEntrega`.

------------------------------------------------------------------------

## Nivel 5 --- Integración Completa

### 9. Plataforma Estudiantil (Cursos Virtuales)

Interfaz `Calificable`.\
Superclase `Curso`.\
Subclases: `CursoVideo`, `CursoLectura`, `CursoExamen`.

### 10. Plataforma Streaming (Netflix / Disney+)

Interfaz `Reproducible`.\
Superclase `ContenidoStreaming`.\
Subclases: `Pelicula`, `Serie`, `Documental`.

------------------------------------------------------------------------
