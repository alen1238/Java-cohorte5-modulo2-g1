public class PerfilInstagram {
    
    //atributos
    private String userName;
    private int seguidores;
    private String biografia;


    //constructores
    public PerfilInstagram(String userName){
        this.userName = userName;
        this.seguidores = 0;
        this.biografia = "";
    }

    public PerfilInstagram(String userName, String biografia){
        this.userName = userName;
        this.seguidores = 0;
        this.biografia = biografia;
    }

    //getters
    public String getUserName(){
        return userName;
    }

    public int getSeguidores(){
        return seguidores;
    }

    public String getBiografia(){
        return biografia;
    }

    //setters: Establecer los valores o editar los atributos
    public void setUserName(String newUserName){
        this.userName = newUserName;
    }

    //  public void setSeguidores(int numeroDeSeguidores){
    //     this.eguidores = numeroDeSeguidores;
    // }

    public void setBiografia(String nuevaBio){
        this.biografia = nuevaBio;
    }


    public void follow(){
        this.seguidores++;
    }

    public String toString(){
        return "usuario: " + this.userName + "\n" + 
               "seguidores: " + this.seguidores + "\n" +
               "biografía: " + this.biografia;
    }










}
