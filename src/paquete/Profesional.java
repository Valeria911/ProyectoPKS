package paquete;

import java.util.Scanner;

public class Profesional extends Usuario{
    Scanner sc = new Scanner(System.in);
    private String titulo;
    private String fechaIngreso;

    public Profesional(){

    }

    public Profesional(String nombre, String fechaNac, Integer run, String tipo, String titulo, String fechaIngreso) {
        super(nombre, fechaNac, run, tipo);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        do{
            System.out.println("Ingrese título");
            titulo = sc.nextLine();
            if(titulo.length() >= 10 && titulo.length() <= 50){
                this.titulo = titulo;
            }
        }while(titulo.isBlank() || titulo.isEmpty());
        System.out.println("Registrado exitosamente");
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        System.out.println("Indique fecha de ingreso DD/MM/AAAA");
        fechaIngreso = sc.nextLine();
        if(fechaNac.isBlank() || fechaNac.isEmpty() || !fechaNac.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")){
            this.fechaIngreso = fechaIngreso;
            System.out.println("Registrado exitosamente");
        }else{
            this.fechaIngreso = null;
        }

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = "Profesional";
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", run=" + run +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Su título es: " +this.titulo+ ", y la fecha en que ingresó a la empresa es: " + this.fechaNac);
    }
}
