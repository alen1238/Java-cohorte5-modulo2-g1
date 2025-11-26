package personajes;

import estrategias.ataque.AtaqueBasico;

public class Mario extends Personaje {

    public Mario(String nombre){
        super(nombre);
        this.estrategiaAtaque = new AtaqueBasico();
    }
}
