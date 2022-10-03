package paquete;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Usuario implements Asesoria {
    Scanner sc = new Scanner(System.in);
    protected String nombreCompleto;
    protected String fechaNacimiento;
    protected Integer run;
    protected String tipo;

    public Usuario() {
    }

    public Usuario(String nombreCompleto, String fechaNacimiento, Integer run, String tipo) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.tipo = tipo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        do {
            System.out.println("Ingrese nombre y apellido:");
            nombreCompleto = sc.nextLine();
            this.nombreCompleto = nombreCompleto;
        } while (nombreCompleto.isBlank() || nombreCompleto.length() < 10 || nombreCompleto.length() > 50);
        System.out.println("Registrado existosamente");
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        do {
            System.out.println("Ingrese fecha de nacimiento DD/MM/AAAA");
            fechaNacimiento = sc.nextLine();
            this.fechaNacimiento = fechaNacimiento;
        }while(fechaNacimiento.isBlank() || fechaNacimiento.isEmpty() || !fechaNacimiento.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$"));
        System.out.println("Registrado existosamente");
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        System.out.println("Ingrese run sin puntos, guión ni dígito verificador");
        run = sc.nextInt();
        this.run = run;
        while(run > 99999999){
            System.out.println("Ingrese run menor a 99999999");
        }
        if(run <= 99999999 && run >= 1000000){
            System.out.println("Registrado exitosamente");
        }
        sc.nextLine();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre completo='" + nombreCompleto + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del usuario es: " + this.nombreCompleto + ", y el run es: " + this.run);
    }

    public void mostrarEdad(String fechaNacimiento){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimientoMetodo = LocalDate.parse(this.fechaNacimiento, formato);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNacimientoMetodo, ahora);
        System.out.println("El usuario tiene " + periodo.getYears() + "años.");
    }


}
