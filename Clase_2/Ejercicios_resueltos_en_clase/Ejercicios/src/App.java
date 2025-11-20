import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String user = sc.nextLine();

        System.out.print("Ingrese biografía: ");
        String bio = sc.nextLine();

        
        //instanciar la clase
        PerfilInstagram miPerfil = new PerfilInstagram(user, bio);
        System.out.println("El perfil fue creado exitosamente");

        miPerfil.setUserName("Catalina1238"); //editar el nombre del perfil
        // miPerfil.setSeguidores(102002); //incoherencia de la clase.
        miPerfil.follow();

        miPerfil.toString();

        PerfilInstagram miPerfil2 = new PerfilInstagram("alen456");
        
        miPerfil2.follow();
        miPerfil2.follow();
        miPerfil2.follow();

        miPerfil2.toString();

        sc.close();
    }
}
