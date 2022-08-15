package one.digitalinnovation.gof.strategy;

import lombok.Setter;


public class Robo {
    @Setter
    private  Comportamento comportamento;

    public void mover(){
        comportamento.mover();
    }
}

