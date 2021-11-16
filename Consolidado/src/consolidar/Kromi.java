package consolidar;

public class Kromi extends Carro{

    private String anioFabricacion;
    private String marca;

    public Kromi(){

    }

    public Kromi(int cantOcupantes, String fechaIngreso, String tipo, String anioFabricacion, String marca) {
        super(cantOcupantes, fechaIngreso, tipo);
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Kromi{" +
                "cantOcupantes=" + cantOcupantes +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", anioFabricacion='" + anioFabricacion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
