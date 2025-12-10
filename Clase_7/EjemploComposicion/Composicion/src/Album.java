public class Album {
    private String nombre;
    private String artista;
    private Cancion[] canciones;

    public Album(String nombre, String artista, int numeroDeCanciones) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new Cancion[numeroDeCanciones];
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }

    // public void agregarCancion(String titulo, String artista, int indice) {
    //     Cancion cancion = new Cancion(titulo, artista);//aqui nace la cancion del album
    //     if (indice >= 0 && indice < canciones.length) {
    //         canciones[indice] = cancion;
    //     } else {
    //         throw new IndexOutOfBoundsException("Índice fuera de rango para agregar canción.");
    //     }
    // }

    public void agregarCancion(Cancion cancion, int indice) {
        if (indice >= 0 && indice < canciones.length) {
            canciones[indice] = cancion;
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango para agregar canción.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Álbum: " + nombre + " - Artista: " + artista);
        for (Cancion cancion : canciones) {
            if (cancion != null) {
                System.out.println("Canción: " + cancion.getTitulo() + " - Artista: " + cancion.getArtista());
            }
        }
    }
}
