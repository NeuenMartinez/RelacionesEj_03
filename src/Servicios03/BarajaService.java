package Servicios03;

import Entidades03.Baraja;
import Entidades03.Carta;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class BarajaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Baraja baraja = new Baraja();
    Baraja monton = new Baraja();

    public void crearCarta() {

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    for (int j = 0; j < 12; j++) {
                        if (j == 8) {
                            j = 10;
                        }
                        baraja.getBaraja().add(new Carta((j + 1), "BASTO"));
                    }
                    break;
                case 1:
                    for (int j = 0; j < 12; j++) {
                        if (j == 8) {
                            j = 10;
                        }
                        baraja.getBaraja().add(new Carta((j + 1), "ESPADA"));
                    }
                    break;
                case 2:
                    for (int j = 0; j < 12; j++) {
                        if (j == 8) {
                            j = 10;
                        }
                        baraja.getBaraja().add(new Carta((j + 1), "COPA"));
                    }
                    break;
                case 3:
                    for (int j = 0; j < 12; j++) {
                        if (j == 8) {
                            j = 10;
                        }
                        baraja.getBaraja().add(new Carta((j + 1), "ORO"));
                    }
                    break;
            }
        }
    }

    public void barajar() {
        Collections.shuffle(baraja.getBaraja());
    }

    public void siguienteCarta() {
        if (baraja.getBaraja().isEmpty()) {
            System.out.println("No hay mas cartas disponibles");
        } else {
            System.out.println("La siguiente carta es: " + baraja.getBaraja().get(0));
            monton.getBaraja().add(baraja.getBaraja().get(0));
            baraja.getBaraja().remove(0);
        }

    }
    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles es de: " + baraja.getBaraja().size()+ " cartas");
    }

    public void darCartas() {
        System.out.println("¿Cuantas cartas desea repartir?");
        int rep = leer.nextInt();
        if (rep > baraja.getBaraja().size()){
            System.out.println("No existen suficientes cartas");
        } else{
            System.out.println("La mano es:");
            for (int i = 0; i < rep; i++) {
                System.out.println(baraja.getBaraja().get(i));
                monton.getBaraja().add(baraja.getBaraja().get(i));
                baraja.getBaraja().remove(i);
            }
  
        }
    }
    
    public void cartasMonton(){
        if (monton.getBaraja().isEmpty()){
            System.out.println("No ha salido ninguna carta de la baraja aun");
        } else {
            System.out.println("Las cartas que han salido son: ");
            monton.getBaraja().forEach((aux) -> {
                System.out.println(aux);
            });
        }
    }
    
    public void mostrarBaraja(){
        if (baraja.getBaraja().isEmpty()){
            System.out.println("No hay mas cartas en la baraja");
        } else {
            System.out.println("Las cartas que hay en la baraja son: ");
            baraja.getBaraja().forEach((aux) -> {
                System.out.println(aux);
            });
        }
    }
}
