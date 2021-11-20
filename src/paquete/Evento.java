package paquete;

import java.util.Scanner;

public class Evento {
    Scanner sc = new Scanner(System.in);
    protected Long id;
    protected Integer rutCliente;
    protected String dia;
    protected String hora;
    protected String lugar;

    public Evento(){

    }

    public Evento(Long id, Integer rutCliente, String dia, String hora, String lugar) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        do{
            System.out.println("Indique número de ID");
            id = sc.nextLong();
            this.id = id;
        }while(id.equals(null));
        System.out.println("Registrado existosamente");
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        do{
            System.out.println("Ingrese Rut del Cliente");
            rutCliente = sc.nextInt();
            this.rutCliente = rutCliente;
        }while(rutCliente.equals(null));
        System.out.println("Registrado exitosamente");
        sc.nextLine();
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
                System.out.println("Indique qué día de la semana será la capacitación");
                dia = sc.nextLine();
        if(dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || dia.equals("Jueves") || dia.equals("Viernes")) {
                this.dia = dia;
            System.out.println("Registrado con éxito");
            }else{
            this.dia = null;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        do{
            System.out.println("Ingrese la hora de la capacitación HH:MM");
            hora = sc.nextLine();
            this.hora = hora;
        }while(!hora.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$"));
        System.out.println("Registrado exitosamente");
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        do{
            System.out.println("Ingrese el lugar donde se realizará la capacitación");
            lugar = sc.nextLine();
            this.lugar = lugar;
        }while(lugar.isBlank() || lugar.isEmpty() || lugar.length() < 10 || lugar.length() > 50);
        System.out.println("Registrado con éxito");
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
