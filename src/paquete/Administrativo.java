package paquete;

import java.util.Scanner;

public class Administrativo extends Usuario{
    Scanner sc = new Scanner(System.in);
    private String area;
    private String expPrevia;

    public Administrativo(){

    }

    public Administrativo(String nombre, String fechaNac, Integer run, String tipo, String area, String expPrevia) {
        super(nombre, fechaNac, run, tipo);
        this.area = area;
        this.expPrevia = expPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        do{
            System.out.println("Ingrese área");
            area = sc.nextLine();
            this.area = area;
        }while(area.isEmpty() || area.isBlank() || area.length() < 5 || area.length() > 20);
        System.out.println("Registrado con éxito");
    }

    public String getExpPrevia() {
        return expPrevia;
    }

    public void setExpPrevia(String expPrevia) {
        System.out.println("Ingrese experiencia previa");
        expPrevia = sc.nextLine();
        if(expPrevia.length() <= 100){
            this.expPrevia = expPrevia;
            System.out.println("Registrado con éxito");
        }else{
            this.expPrevia = null;
        }
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", expPrevia='" + expPrevia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", run=" + run +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Su área es " +this.area+ " y su experiencia previsa es de " + this.expPrevia);
    }
}
