package one.digitalinnovation.gof;

/**
 * Singleton "Apressado"
 * @author AlcidesThiago2016
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
