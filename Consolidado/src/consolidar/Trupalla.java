package consolidar;

public class Trupalla extends Carro{

    private int nivelArmadura;
    private String nombre;

    public Trupalla(){

    }

    public Trupalla(int cantOcupantes, String fechaIngreso, String tipo, int nivelArmadura, String nombre) {
        super(cantOcupantes, fechaIngreso, tipo);
        this.nivelArmadura = nivelArmadura;
        this.nombre = nombre;
    }

    public int getNivelArmadura() {
        return nivelArmadura;
    }

    public void setNivelArmadura(int nivelArmadura) {
        this.nivelArmadura = nivelArmadura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Trupalla{" +
                "cantOcupantes=" + cantOcupantes +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", nivelArmadura=" + nivelArmadura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
