public class App {
    public static void main(String[] args) throws Exception {
        //Album album = new Album("The Dark Side of the Moon", "Pink Floyd", 3);

        // Cancion cancion1 = new Cancion("Speak to Me", "Pink Floyd");
        // Cancion cancion2 = new Cancion("Breathe", "Pink Floyd");
        // Cancion cancion3 = new Cancion("Time", "Pink Floyd");

        // album.agregarCancion("Speak to Me", "Pink Floyd", 0);
        // album.agregarCancion("Breathe", "Pink Floyd", 1);

        Album album2 = new Album("Abbey Road", "The Beatles", 2);
        Cancion cancion4 = new Cancion("Come Together", "The Beatles");
        Cancion cancion5 = new Cancion("Something", "The Beatles");
        album2.agregarCancion(cancion4, 0);
        album2.agregarCancion(cancion5, 1);

        Album album3 = new Album("Revolver", "The Beatles", 2);
        album3.agregarCancion(cancion5, 0);
        // album2.agregarCancion("Come Together", "The Beatles", 0);
        // album2.agregarCancion("Something", "The Beatles", 1);
        album2.mostrarDetalles();
        //album.mostrarDetalles();
        // album.agregarCancion(cancion1, 0);
        // album.agregarCancion(cancion2, 1);
        // album.agregarCancion(cancion3, 2);

        // System.out.println("Álbum: " + album.getNombre() + " - Artista: " + album.getArtista());
        // for (Cancion cancion : album.getCanciones()) {
        //     System.out.println("Canción: " + cancion.getTitulo() + " - Artista: " + cancion.getArtista());
        // }

        // Album album2 = new Album("Abbey Road", "The Beatles", 2);
        // album2.agregarCancion(cancion3, 0);

        VideoYoutube video = new VideoYoutube("Tutorial Java", "http://youtube.com/tutorial-java", 600);
        video.agregarComentario("usuario1", "¡Gran tutorial!", 0);
        video.agregarComentario("usuario2", "Muy útil, gracias.", 1);

        
    
    
    
    }
}
