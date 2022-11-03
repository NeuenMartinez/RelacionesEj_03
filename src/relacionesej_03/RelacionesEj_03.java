/*
 * @author NeuenMartinez
 */
package RelacionesEj_03;

import Servicios03.BarajaService;
import java.util.Scanner;

public class RelacionesEj_03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        BarajaService bs = new BarajaService();
        bs.crearCarta();
        boolean loop = true;
        boolean loop2 = true;
        do {
            System.out.println("Menu: ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1. Barajar.\n"
                    + "2. Siguiente carta.\n"
                    + "3. Cartas disponibles. \n"
                    + "4. Dar cartas. \n"
                    + "5. Mostrar monton. \n"
                    + "6. Mostrar baraja. \n"
                    + "7. Salir.");
            System.out.println("Ingrese el numero de la opcion a seleccionar:");
            switch (read.nextInt()) {
                case 1:
                    bs.barajar();
                    break;
                case 2:
                    bs.siguienteCarta();
                    break;
                case 3:
                    bs.cartasDisponibles();
                    break;
                case 4:
                    bs.darCartas();
                    break;
                case 5:
                    bs.cartasMonton();
                    break;
                case 6:
                    bs.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Desea salir del Programa? s/n");
                    loop = true;
                    loop2 = true; //reset
                    do {
                        switch (read.next()) {
                            case "s":
                                loop = false;
                                loop2 = false;
                                break;
                            case "n":
                                loop2 = false;
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida.");
                        }
                    } while (loop2);
            }
        } while (loop);

    }
}
