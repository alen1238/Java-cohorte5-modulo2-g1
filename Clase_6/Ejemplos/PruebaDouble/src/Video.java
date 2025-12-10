public class Video {
    private String titulo;
    private Comentario[] comentarios;
    private static final int maxComentarios = 100;

    public Video(String titulo) {
        this.titulo = titulo;
        this.comentarios = new Comentario[maxComentarios]; //relacion de composición
    }
}
