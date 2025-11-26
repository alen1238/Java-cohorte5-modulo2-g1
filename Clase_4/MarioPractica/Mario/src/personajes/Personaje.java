package personajes;

import estrategias.ataque.IEstrategiaAtaque;
import estrategias.salto.IEstrategiaSalto;

public abstract class Personaje {
    protected String nombre;
    protected IEstrategiaAtaque estrategiaAtaque;
    protected IEstrategiaSalto estrategiaSalto;

    public Personaje (String nombre){
        this.nombre = nombre;
    }

    public void atacar(){
        estrategiaAtaque.atacar();
    }

    public void setEstrategiaAtaque(IEstrategiaAtaque estrategiaAtaque){
        this.estrategiaAtaque = estrategiaAtaque;
    }

    //public abstract void MiMetodoAbst();
}
