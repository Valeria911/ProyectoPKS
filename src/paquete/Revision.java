package paquete;

import java.util.Scanner;

public class Revision {
    Scanner sc = new Scanner(System.in);
    private Long idRevision;
    private Long idVisita;
    private String nombreRevision;
    private String detalle;
    private Integer estado;

    public Revision(){}

    public Revision(Long idRevision, Long idVisita, String nombreRevision, String detalle, Integer estado) {
        this.idRevision = idRevision;
        this.idVisita = idVisita;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    public Long getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(Long idRevision) {
        do{
            System.out.println("Indique número de ID de la revisión");
            idRevision = sc.nextLong();
            this.idRevision = idRevision;
        }while(idRevision.equals(null));
        System.out.println("Registrado existosamente");
        sc.nextLine();
    }

    public Long getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Long idVisita) {
        do{
            System.out.println("Indique número de ID de la visita a terreno");
            idVisita = sc.nextLong();
            this.idVisita = idVisita;
        }while(idVisita.equals(null));
        System.out.println("Registrado existosamente");
        sc.nextLine();
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        do{
            System.out.println("Ingrese nombre asociado a la revisión");
            nombreRevision = sc.nextLine();
            this.nombreRevision = nombreRevision;
        }while(nombreRevision.length() < 10 || nombreRevision.length() > 50);
        System.out.println("Ingresado exitosamente");
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        System.out.println("Ingrese detalles");
        detalle = sc.nextLine();
        this.detalle = detalle;
        if(detalle.length() < 100){
            System.out.println("Registrado exitosamente");
        }
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        do {
            System.out.println("Ingrese el estado de la revisión:");
            System.out.println("1. Sin problemas \n" +
                    "2. Con observaciones \n" +
                    "3. No aprobada");
            estado = sc.nextInt();
            this.estado = estado;
        }while (estado != 1 && estado != 2 && estado != 3) ;
        System.out.println("Registrado con éxito");
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", idVisita=" + idVisita +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
