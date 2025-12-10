package modelo;

public class Playlist {
    private String nombre;
    Cancion[] canciones; //atributo principal de la clase

    //atributos auxiliares de canciones
    private int contadorCanciones;
    int maxCanciones;

    public Playlist(String nombre, int maxCanciones) {
        this.nombre = nombre;
        this.maxCanciones = maxCanciones;
        this.canciones = new Cancion[maxCanciones];
        this.contadorCanciones = 0;
    }

    public boolean agregarCancion(Cancion cancion) { //respeta la relación de agregación entre Playlist y Cancion
        if (contadorCanciones < maxCanciones) {
            canciones[contadorCanciones] = cancion;
            contadorCanciones++;
            return true; // vamos a mandar hacia afuera si se pudo agregar la canción a través de un true o false
        } else {
            return false; // No se pudo agregar la canción, playlist llena
        }
    }

    public Cancion[] listarCanciones() {
        Cancion[] listaActual = new Cancion[contadorCanciones];
        for (int i = 0; i < contadorCanciones; i++) {
            listaActual[i] = canciones[i];
        }
        return listaActual;
    }

    public boolean reproducirCancion(int index) {
        if (index >= 0 && index < contadorCanciones) { //evaluamos que el inidice sea válido
            canciones[index].reproducir();
            return true;
        } else {
            return false; //índice inválido
        }
    }

    public boolean estaLLena() {
        return contadorCanciones >= maxCanciones;
    }
}
