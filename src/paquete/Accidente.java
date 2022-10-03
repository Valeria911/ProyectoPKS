package paquete;

public class Accidente extends Evento{
    private Long idAccidente;
    private String origen;
    private String consecuencias;

    public Accidente(){}

    public Accidente(Integer rutCliente, String dia, String hora, String lugar, Long idAccidente, String origen, String consecuencias) {
        super(rutCliente, dia, hora, lugar);
        this.idAccidente = idAccidente;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public Long getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(Long idAccidente) {
        do{
            System.out.println("Indique número de ID del accidente");
            idAccidente = sc.nextLong();
            this.idAccidente = idAccidente;
        }while(idAccidente.equals(null));
        System.out.println("Registrado existosamente");
        sc.nextLine();
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        System.out.println("Indique el origen que tuvo el Accidente");
        origen = sc.nextLine();
        this.origen = origen;
        if(origen.length() < 100){
            System.out.println("Registrado exitosamente");
        }
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        System.out.println("Indique las consecuencias del Accidente");
        consecuencias = sc.nextLine();
        this.consecuencias = consecuencias;
        if(consecuencias.length() < 100){
            System.out.println("Registrado exitosamente");
        }
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "idAccidente=" + idAccidente +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                "} ";
    }
}
