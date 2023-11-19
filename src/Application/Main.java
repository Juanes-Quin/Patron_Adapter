package Application;

import Implementation.AdaptadorMotorElectrico;
import Implementation.MotorComun;
import Implementation.MotorEconomico;
import Implementation.MotorElectrico;
import Servicice.Motor;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Motor motor;

    public static void main(String[] args) {

        int option;

        do {
            option = preguntarOpcion();
            switch (option) {
                case 1:
                    motor = new MotorComun();
                    usarMotor();
                    break;

                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;

                case 3:
                    motor = new AdaptadorMotorElectrico(new MotorElectrico());
                    usarMotor();
                    break;

                case 4:
                    System.out.println("¡Finalizar programa!");
                    break;

                default:
                    System.out.println("La opción ingresada no es válida.");
            }
            System.out.println("\n");
        } while (option != 4);
    }

    private static int preguntarOpcion () {
        System.out.println(
                "Menú de opciones, por favor elija una \n"
                        + "\n"
                        + "1. Encender el motor común. \n"
                        + "2. Encender el motor ecómico. \n"
                        + "3. Encender el motor eléctrico. \n"
                        + "4. Terminar ejecución. \n"
                        + "Seleccione una opción correcta: "
        );
        return Integer.parseInt(scanner.nextLine());
    }

    private static void usarMotor () {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}


