package paquete;

import java.util.Scanner;

public class Capacitacion extends Evento{
    Scanner sc = new Scanner(System.in);
    private String duracion;
    private Integer cantAsistentes;

    public Capacitacion(){

    }

    public Capacitacion(Long id, Integer rutCliente, String dia, String hora, String lugar, String duracion, Integer cantAsistentes) {
        super(id, rutCliente, dia, hora, lugar);
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        System.out.println("Ingrese duración de la capacitación en minutos");
        duracion = sc.nextLine();
        if(duracion.length() < 70){
            this.duracion = duracion;
            System.out.println("Registrado exitosamente");
        }else {
            this.duracion = null;
        }
    }

    public Integer getCantAsistentes() {
        return cantAsistentes;
    }

    public void setCantAsistentes(Integer cantAsistentes) {
        do{
            System.out.println("Ingrese la cantidad de asistentes a la capacitación");
            cantAsistentes = sc.nextInt();
            if(cantAsistentes < 1000){
                this.cantAsistentes = cantAsistentes;
            }
        }while (cantAsistentes == null);
        System.out.println("Registrado exitosamente");
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "duracion='" + duracion + '\'' +
                ", cantAsistentes=" + cantAsistentes +
                ", id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
