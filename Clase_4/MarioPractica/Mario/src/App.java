import estrategias.ataque.AtaqueFuego;
import personajes.Mario;

public class App {
    public static void main(String[] args) throws Exception {
        Mario mario = new Mario("Mario1");

        System.out.println("===Mario con habilidades iniciales===");
        mario.atacar();

        System.out.println("===El jugador asciende a Mario Avanzado===");
        mario.setEstrategiaAtaque(new AtaqueFuego());
        mario.atacar();

        
    }
}
