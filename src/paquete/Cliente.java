package paquete;

import java.util.Scanner;

public class Cliente extends Usuario{
    Scanner sc = new Scanner(System.in);

    //declaración de atributos de la subclase
    private Integer rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private Integer sistSalud;
    private String direccion;
    private String comuna;
    private Integer edad;

    public Cliente(){

    }

    public Cliente(String nombre, String fechaNac, Integer run, String tipo, Integer rut, String nombres, String apellidos, String telefono, String afp, Integer sistSalud, String direccion, String comuna, Integer edad) {
        super(nombre, fechaNac, run, tipo);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistSalud = sistSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        System.out.println("Ingrese rut sin guión ni dígito verificador");
        rut = sc.nextInt();
        while(rut > 99999999){
            System.out.println("Ingrese rut menor a 99999999");
        }if(rut <= 99999999){
            this.rut = rut;
            System.out.println("Registrado con éxito");
            sc.nextLine();
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        do{
            System.out.println("Ingrese nombres: ");
            nombres = sc.nextLine();
            if(nombres.length() > 5){
                if(nombres.length() < 30){
                    if(!nombres.isEmpty()){
                        if(!nombres.isBlank()){
                            this.nombres = nombres;
                        }
                    }
                }
            }
        }while(nombres.isEmpty() || nombres.isBlank() || nombres.length() <5 || nombres.length() > 30);
        System.out.println("Registrado con éxito");
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        do{
            System.out.println("Ingrese apellidos: ");
            apellidos = sc.nextLine();
            if(apellidos.length() > 5){
                if(apellidos.length() < 30){
                    if(!apellidos.isEmpty()){
                        this.apellidos = apellidos;
                    }
                }
            }
        }while(apellidos.isEmpty() || apellidos.isBlank() || apellidos.length()<5 || apellidos.length()>30);
        System.out.println("Registrado con éxito");
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombres, String apellidos){
        this.nombre = this.nombres + " " + this.apellidos;
    }

    public Integer getRun(){
        return run;
    }

    public void setRun(Integer rut){
        this.run = rut;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        do{
            System.out.println("Ingrese teléfono");
            telefono = sc.nextLine();
            this.telefono = telefono;
        }while(telefono.isEmpty() || telefono.isBlank());
        System.out.println("Registrado exitosamente");
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        do{
            System.out.println("Ingrese AFP");
            afp = sc.nextLine();
            this.afp = afp;
        }while(afp.length() < 4 || afp.length() > 30);
        System.out.println("Ingresado exitosamente");
    }

    public Integer getSistSalud() {
        return sistSalud;
    }

    public void setSistSalud(Integer sistSalud) {
        System.out.println("Ingrese el sistema de salud");
        System.out.println("1. Fonasa");
        System.out.println("2. Isapre");
        sistSalud = sc.nextInt();
        do {
            switch (sistSalud) {
                case 1:
                    break;
                case 2:
                    this.sistSalud = sistSalud;
                    break;
                default:
                    System.out.println("Ingrese opción 1: Fonasa, o 2: Isapre");
            }
        }while (sistSalud != 1 && sistSalud != 2) ;
        System.out.println("Registrado con éxito");
        sc.nextLine();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        do{
            System.out.println("Ingrese dirección");
            direccion = sc.nextLine();
            this.direccion = direccion;
        }while(direccion.length() > 70 || direccion.isEmpty() || direccion.isBlank());
        System.out.println("Registrado exitosamente");
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        do{
            System.out.println("Ingrese comuna");
            comuna = sc.nextLine();
            this.comuna = direccion;
        }while(comuna.length() > 50 || comuna.isEmpty() || comuna.isBlank());
        System.out.println("Registrado exitosamente");
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        do{
            System.out.println("Ingrese edad");
            edad = sc.nextInt();
            if(edad >= 0 && edad < 150){
                this.edad = edad;
            }
        }while(edad.equals(null));
        System.out.println("Registrado exitosamente");
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = "Cliente";
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistSalud=" + sistSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", run=" + run +
                '}';
    }

    public String obtenerNombre(String nombres, String apellidos){
        String nombreCompleto = "Nombre completo del cliente es: " +this.nombres+ " " +this.apellidos;
        return nombreCompleto;
    }

    public void obtenerSistemaSalud(Integer sistSalud){
        String prevision = "";
        if(sistSalud == 1){
            prevision = "Fonasa";
        }else{
            prevision = "Isapre";
        }
        System.out.println("El sistema de salud del cliente es: " + prevision);
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Su dirección es " +this.direccion+ " , comuna: " +this.comuna);
    }
}
