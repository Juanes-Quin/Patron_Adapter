package Implementation;

import Servicice.Motor;

public class MotorComun implements Motor {

    public MotorComun() {
        super();
        System.out.println("Creando un motor común ");
    }
    @Override
    public void encender() {
        System.out.println("\n El motor común se está encendiendo \n");
    }

    @Override
    public void acelerar() {
        System.out.println("\n El motor común se está acelerando \n");
    }

    @Override
    public void apagar() {
        System.out.println("\n El motor común se está apagando \n");
    }
}
