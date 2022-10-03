package paquete;

public class VisitaTerreno extends Evento{
    private Long idVisita;
    private String comentarios;

    public VisitaTerreno(){}

    public VisitaTerreno(Integer rutCliente, String dia, String hora, String lugar, Long idVisita, String comentarios) {
        super(rutCliente, dia, hora, lugar);
        this.idVisita = idVisita;
        this.comentarios = comentarios;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        System.out.println("Indique comentarios de la visita a terreno");
        comentarios = sc.nextLine();
        this.comentarios = comentarios;
        if(comentarios.length() < 100){
            System.out.println("Registrado exitosamente");
        }
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "idVisita=" + idVisita +
                ", comentarios='" + comentarios + '\'' +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                "} ";
    }
}
