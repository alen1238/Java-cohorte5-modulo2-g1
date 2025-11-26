public class App {
    public static void main(String[] args) throws Exception {
        
        Tickete ticket = new Tickete();
        Tickete.contador++;
        Tickete ticket2 = new Tickete();
        Tickete.contador++;

         Tickete ticket3 = new Tickete();
        Tickete.contador++;

        ticket3.contador++;

        System.out.println("Ticketes comprados: " + Tickete.contador);

        miMetodoNoEstatico();
    }

    public static void miMetodoNoEstatico(){
        System.out.println("Soy un metodo no estático...");
    }
}
