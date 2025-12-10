public class VideoYoutube {
    private String titulo;
    private String url;
    private int duracion; // en segundos
    private Comentario[] comentarios;//declaracion del arreglo

    public VideoYoutube(String titulo, String url, int duracion) {
        this.titulo = titulo;
        this.url = url;
        this.duracion = duracion;
        this.comentarios = new Comentario[100]; // Capacidad para 100 comentarios
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUrl() {
        return url;
    }

    public int getDuracion() {
        return duracion;
    }

    public void agregarComentario(String usuario, String mensaje, int indice) {
        Comentario comentario = new Comentario(usuario, mensaje);
        if (indice >= 0 && indice < comentarios.length) {
            comentarios[indice] = comentario;
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango para agregar comentario.");
        }
    }
}
