package paquete;
public class Administrativo extends Usuario{

    private String area;
    private String experienciaPrevia;

    public Administrativo(){

    }

    public Administrativo(String nombreCompleto, String fechaNacimiento, Integer run, String tipo, String area, String experienciaPrevia) {
        super(nombreCompleto, fechaNacimiento, run, tipo);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
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

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        System.out.println("Ingrese experiencia previa");
        experienciaPrevia = sc.nextLine();
        this.experienciaPrevia = experienciaPrevia;
        if(experienciaPrevia.length() <= 100){
            System.out.println("Registrado con éxito");
        }
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                ", tipo='" + tipo + '\'' +
                "} ";
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Su área es " +this.area+ " y su experiencia previa es de " + this.experienciaPrevia);
    }
}
