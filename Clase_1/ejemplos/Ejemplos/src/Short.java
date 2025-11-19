
public class Short {

    //atributos
    private String titulo; 
    private String img;
    private String url;
    private int likes; //encapsulamiento
    private int visualizaciones;

    //métodos

    //Constructor(es)
    public Short() { //por defecto
        
    }

    public Short(String titulo, String img) {
        this.titulo = titulo;
        this.img = img;
    }

    public Short(String titulo, int likes){
        this.titulo = titulo;
        this.likes = likes;
    }

    //getters: permiten consultar los valores de los atributos.
    public int getLikes() {
        return this.likes;
    }

    public String getTitulo() {
        return this.titulo;
    }

    //setters: permiten modificar los valores de los atributos.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setImg(String img) {
        this.img = img;
    }

    // public void setLikes(int likes) {
    //     this.likes = likes;
    // } NO tiene sentido permitir modificar los likes directamente.


    public void darLike() {
        this.likes++;
    }

    // public void setVisualizaciones(int visualizaciones) {
    //     this.visualizaciones = visualizaciones;
    // }


    public void visualizar() {
        this.visualizaciones++;
    }
}
