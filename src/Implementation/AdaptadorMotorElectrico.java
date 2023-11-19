package Implementation;

import Servicice.Motor;

public class AdaptadorMotorElectrico implements Motor {
    private MotorElectrico motorElectrico;
    public AdaptadorMotorElectrico(MotorElectrico motorElectrico) {
        super();
        System.out.println("Creando el Adaptador del motor eléctrico \n");
        this.motorElectrico = motorElectrico;
    }
    @Override
    public void encender() {
        System.out.println("Encendiendo motor eléctrico Adpater \n");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando motor eléctrico Adpater \n");
        this.motorElectrico.moverRapido();
    }
    @Override
    public void apagar() {
        System.out.println("Apagando motor eléctrico Adpater \n");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
