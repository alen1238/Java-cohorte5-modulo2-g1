public class Carro {
    String marca;
    String modelo;
    int anio;
    Llanta[] llantas;

    public Carro(String marca, String modelo, int anio, int numeroDeLlantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.llantas = new Llanta[numeroDeLlantas];
    }

    public void cambiarLlanta(Llanta llanta, int indice) {
        if (indice >= 0 && indice < llantas.length) {
            llantas[indice] = llanta;
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango para cambiar llanta.");
        }
    }
}
