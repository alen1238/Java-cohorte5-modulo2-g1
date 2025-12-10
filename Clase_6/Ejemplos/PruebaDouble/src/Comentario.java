public class Comentario {
    private String texto;
    private Empleado autor;

    public Comentario(String texto, Empleado autor) {
        this.texto = texto;
        this.autor = autor;
    }
    public String getTexto() {
        return texto;
    }
    public Empleado getAutor() {
        return autor;
    }
}
