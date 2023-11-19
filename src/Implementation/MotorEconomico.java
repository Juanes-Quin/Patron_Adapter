package Implementation;

import Servicice.Motor;

public class MotorEconomico implements Motor {
    public MotorEconomico() {
        super();
        System.out.println("\n Creando un motor económico \n");
    }
    @Override
    public void encender() {
        System.out.println("\n El motor económico se está encendiendo \n");
    }
    @Override
    public void acelerar() {
        System.out.println("\n El motor económico se está acelerando \n");
    }
    @Override
    public void apagar() {
        System.out.println("\n El motor económico se está apagando \n");
    }
}
