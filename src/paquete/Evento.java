package paquete;

import java.util.Scanner;

public class Evento {
    Scanner sc = new Scanner(System.in);
    protected Integer rutCliente;
    protected String dia;
    protected String hora;
    protected String lugar;

    public Evento(){

    }

    public Evento(Integer rutCliente, String dia, String hora, String lugar) {
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        do{
            System.out.println("Ingrese Rut del Cliente");
            rutCliente = sc.nextInt();
            this.rutCliente = rutCliente;
        }while(rutCliente == null);
        System.out.println("Registrado exitosamente");
        sc.nextLine();
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        System.out.println("Indique el día de la semana");
        dia = sc.nextLine();
        this.dia = dia;
        if(dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Miercoles") || dia.equalsIgnoreCase("Jueves") || dia.equalsIgnoreCase("Viernes")) {
            System.out.println("Registrado con éxito");
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        do{
            System.out.println("Ingrese la hora HH:MM");
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
            System.out.println("Ingrese el lugar");
            lugar = sc.nextLine();
            this.lugar = lugar;
        }while(lugar.isBlank() || lugar.length() < 10 || lugar.length() > 50);
        System.out.println("Registrado con éxito");
    }

    @Override
    public String toString() {
        return "Evento{" +
                "rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
