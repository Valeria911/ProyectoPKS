package consolidar;

public class Caguano extends Carro{

    private double alcanceTiro;
    private String color;

    public Caguano(){

    }

    public Caguano(int cantOcupantes, String fechaIngreso, String tipo, double alcanceTiro, String color) {
        super(cantOcupantes, fechaIngreso, tipo);
        this.alcanceTiro = alcanceTiro;
        this.color = color;
    }

    public double getAlcanceTiro() {
        return alcanceTiro;
    }

    public void setAlcanceTiro(double alcanceTiro) {
        this.alcanceTiro = alcanceTiro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Caguano{" +
                "alcanceTiro=" + alcanceTiro +
                ", color='" + color + '\'' +
                ", cantOcupantes=" + cantOcupantes +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", tipo="+ tipo +
                '}';
    }
}
