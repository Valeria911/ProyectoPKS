package paquete;
public class Profesional extends Usuario{
    private String titulo;
    private String fechaIngreso;

    public Profesional(){

    }

    public Profesional(String nombreCompleto, String fechaNacimiento, Integer run, String tipo, String titulo, String fechaIngreso) {
        super(nombreCompleto, fechaNacimiento, run, tipo);
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
            this.titulo = titulo;
        }while(titulo.isBlank() || titulo.length() < 10 || titulo.length() > 50);
        System.out.println("Registrado exitosamente");
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        System.out.println("Indique fecha de ingreso DD/MM/AAAA");
        fechaIngreso = sc.nextLine();
        this.fechaIngreso = fechaIngreso;
        if(fechaIngreso.isBlank() || fechaIngreso.isEmpty() || !fechaIngreso.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")){
            System.out.println("Registrado exitosamente");
        }
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                ", tipo='" + tipo + '\'' +
                "} ";
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Su título es: " +this.titulo+ ", y la fecha en que ingresó a la empresa es: " + this.fechaIngreso);
    }
}
