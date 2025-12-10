public class Playlist {
    //atributos
        private String nombre;
        private Cancion[] canciones;
        private int contadorCanciones;
        private int maxCanciones;

    //constructor
    public Playlist(String nombre) { //Composición respecto a listado de canciones
        this.nombre = nombre;
        this.canciones = new Cancion[100];
        this.contadorCanciones = 0;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Cancion[] getCanciones() {
        return canciones;
    }

    public boolean agregarCancion(Cancion cancion) { //aqui hay agregación respecto a la clase Canción
        if (contadorCanciones < canciones.length) {
            canciones[contadorCanciones] = cancion;
            contadorCanciones++;
            return true;
        } else {
            return false;
        }
    }

    public String listarCanciones() {
        StringBuilder listado = new StringBuilder();
        for (int i = 0; i < contadorCanciones; i++) {
            listado.append((i + 1) + ". " + canciones[i].getTitulo() + " - " + canciones[i].getArtista() + "\n");
        }
        return listado.toString();
    }

    
}
