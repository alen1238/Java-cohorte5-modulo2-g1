public class Cuenta {
    private String id;
    private String password;
    

    public Cuenta(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }

    public void seguir(Autor autor) {
        System.out.println("La cuenta con ID: " + id + " ahora sigue al autor: " + autor.getNombre());
    }
}
