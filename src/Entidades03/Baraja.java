package Entidades03;

import java.util.ArrayList;

/**
 *
 * @author NeuenMartinez
 */
public class Baraja {

    private ArrayList<Carta> baraja = new ArrayList<>();

    public Baraja() {
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja: " + baraja + '}';
    }
    
    
}
