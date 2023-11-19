package Implementation;

public class MotorElectrico {
    private boolean conectado = false;

    public MotorElectrico() {
        System.out.println("Creando motor electrico ");
        this.conectado = conectado;
    }

    public void conectar(){
        System.out.println("\nSe está conectando el motor eléctrico \n");
        this.conectado = true;
    }

    public void activar() {
        if (!this.conectado) {
            System.out.println("\nNo se puede activar porque el motor eléctrico no está conectado. \n");
        } else {
            System.out.println("\nEl motor se ha conectado satisfactoriamente. \n");
        }
    }

    public void moverRapido() {
        if (!this.conectado) {
            System.out.println("\nNo se puede mover rápido debido a que el motor eléctrico no está conectado \n");
        } else {
            System.out.println("\nMoviendo más rápido, el voltaje del motor eléctrico está aumentando \n");
        }
    }

    public void detener() {
        if (!this.conectado) {
            System.out.println("\nNo se puede detener el motor debido a que el motor eléctrico no está conectado \n");
        } else {
            System.out.println("\nEl motor eléctrico se está deteniendo. \n");
        }
    }

    public void desconectar() {
        System.out.println("\nSe está desconectando el motor eléctrico \n");
        this.conectado = false;
    }
}
