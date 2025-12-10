public class Llanta {
    private String marca;
    private String modelo;
    private int diametro;

    public Llanta(String marca, String modelo, int diametro) {
        this.marca = marca;
        this.modelo = modelo;
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getDiametro() {
        return diametro;
    }
}
