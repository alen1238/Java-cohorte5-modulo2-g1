public class Comentario {
    private String autor;
    private String contenido;

    //constructor
    public Comentario(String autor){
        this.autor = autor;
        contenido = "";
    }
    //getters y setters
    public String getAutor(){
        return this.autor;
    }
}
