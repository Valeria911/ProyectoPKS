package paquete;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Usuario implements Asesoria {
    Scanner sc = new Scanner(System.in);
    protected String nombre;
    protected String fechaNac;
    protected Integer run;
    protected String tipo;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNac, Integer run, String tipo) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.run = run;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        do {
            System.out.println("Ingrese nombre:");
            nombre = sc.nextLine();
            this.nombre = nombre;
        } while (nombre.isBlank() || nombre.isEmpty() || nombre.length() < 10 || nombre.length() > 50);
        System.out.println("Registrado existosamente");
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        do {
            System.out.println("Ingrese fecha de nacimiento DD/MM/AAAA");
            fechaNac = sc.nextLine();
            this.fechaNac = fechaNac;
        }while(fechaNac.isBlank() || fechaNac.isEmpty() || !fechaNac.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$"));
        System.out.println("Registrado existosamente");
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        System.out.println("Ingrese run sin guión ni dígito verificador");
        run = sc.nextInt();
        while(run > 99999999){
            System.out.println("Ingrese run menor a 99999999");
        }if(run <= 99999999 && run >= 1000000){
            this.run = run;
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
                "nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", run=" + run +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del usuario es: " + this.nombre + ", y el run es: " + this.run);
    }

    public void mostrarEdad(String fechaNac){
        String descomponer = (this.fechaNac).replace("/", "");
        String anio = descomponer.substring(0,4);
        int edad = 2021 - valueOf(anio);
        System.out.println("El usuario tiene " + edad + "años.");
    }


}
