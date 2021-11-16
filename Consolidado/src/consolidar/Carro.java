package consolidar;

import java.util.Random;

//Superclase, declarar atributos y métodos
public class Carro{

    protected int cantOcupantes;
    protected String fechaIngreso;
    //protected int fila;
    //protected int columna;
    protected String tipo;

    public Carro(){

    }

    public Carro(int cantOcupantes, String fechaIngreso, String tipo) {
        this.cantOcupantes = cantOcupantes;
        this.fechaIngreso = fechaIngreso;
        this.tipo = tipo;
    }

    public int getCantOcupantes() {
        return cantOcupantes;
    }

    public void setCantOcupantes(int cantOcupantes) {
        this.cantOcupantes = cantOcupantes;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cantOcupantes=" + cantOcupantes +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", tipo=" + tipo +
                '}';
    }

}
