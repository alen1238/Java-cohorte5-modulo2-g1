public class App {
    public static void main(String[] args) throws Exception {
        Short otroShort = new Short();
        Short miShort = new Short("Cantando vallenato", "img1.jpg");
        
        miShort.setTitulo("Cantando vallenato en Colombia");


        otroShort.setTitulo("Cantando regueton");

        miShort.darLike();
        miShort.darLike();
        otroShort.darLike();
        otroShort.titulo = "Nuevo titulo"; //No recomendado por encapsulamiento
        // miShort.setLikes(100); 
        // miShort.setLikes(10000); 
        miShort.setVisualizaciones(5000);

    }
}
