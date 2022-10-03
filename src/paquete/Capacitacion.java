package paquete;
public class Capacitacion extends Evento{
    private Long idCapacitacion;
    private String duracion;
    private Integer cantidadAsistentes;

    public Capacitacion(){

    }

    public Capacitacion(Integer rutCliente, String dia, String hora, String lugar, Long idCapacitacion, String duracion, Integer cantidadAsistentes) {
        super(rutCliente, dia, hora, lugar);
        this.idCapacitacion = idCapacitacion;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public Long getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(Long idCapacitacion) {
        do{
            System.out.println("Indique número de ID de la capacitación");
            idCapacitacion = sc.nextLong();
            this.idCapacitacion = idCapacitacion;
        }while(idCapacitacion.equals(null));
        System.out.println("Registrado existosamente");
    }

    public Integer getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(Integer cantidadAsistentes) {
        do{
            System.out.println("Ingrese la cantidad de asistentes a la capacitación");
            cantidadAsistentes = sc.nextInt();
            this.cantidadAsistentes = cantidadAsistentes;
        }while (cantidadAsistentes == null || cantidadAsistentes > 1000);
        System.out.println("Registrado exitosamente");
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        System.out.println("Ingrese duración de la capacitación en minutos");
        duracion = sc.nextLine();
        this.duracion = duracion;
        if(duracion.length() < 70){
            System.out.println("Registrado exitosamente");
        }
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion=" + idCapacitacion +
                ", duracion='" + duracion + '\'' +
                ", cantidadAsistentes=" + cantidadAsistentes +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                "} ";
    }

    public void mostrarDetalle(){
        System.out.println("La capacitación será en " + lugar + " a las " + hora + "\n" +
                "del día " + dia + " y durará " + duracion + " minutos.");
    }
}
