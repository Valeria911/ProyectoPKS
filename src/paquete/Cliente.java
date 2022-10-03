package paquete;
public class Cliente extends Usuario{
    //declaración de atributos de la subclase
    private String telefono;
    private String afp;
    private Integer sistSalud;
    private String direccion;
    private String comuna;
    private Integer edad;

    public Cliente(){

    }

    public Cliente(String nombreCompleto, String fechaNacimiento, Integer run, String tipo, String telefono, String afp, Integer sistSalud, String direccion, String comuna, Integer edad) {
        super(nombreCompleto, fechaNacimiento, run, tipo);
        this.telefono = telefono;
        this.afp = afp;
        this.sistSalud = sistSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
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
        do {
            System.out.println("Ingrese el sistema de salud");
            System.out.println("1. Fonasa");
            System.out.println("2. Isapre");
            sistSalud = sc.nextInt();
            this.sistSalud = sistSalud;
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
            this.edad = edad;
        }while(edad <= 0 || edad > 150);
        System.out.println("Registrado exitosamente");
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistSalud=" + sistSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                ", tipo='" + tipo + '\'' +
                "} ";
    }

    public String obtenerNombre(String nombreCompleto){
       return "El nombre completo del cliente es: " + nombreCompleto;
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
