package paquete;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Principal {

    public static void main(String[] args) {
        Usuario u = new Usuario();
        Cliente c = new Cliente();
        Profesional p = new Profesional();
        Administrativo a = new Administrativo();
        Capacitacion cap = new Capacitacion();
        Accidente ac = new Accidente();
        VisitaTerreno vt = new VisitaTerreno();
        Revision rev = new Revision();
        Contenedor cont = new Contenedor();

        System.out.println("------Bienvenido al Sistema de Registro------");
        //Comienzo del menu
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        while(!salir){
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Profesional");
            System.out.println("3. Registrar Administrativo");
            System.out.println("4. Registrar Capacitación");
            System.out.println("5. Registrar Accidente");
            System.out.println("6. Registrar Visita en Terreno");
            System.out.println("7. Registrar Revision");
            System.out.println("8. Eliminar Usuario");
            System.out.println("9. Mostrar lista de usuarios");
            System.out.println("10. Mostrar lista de usuarios por tipo");
            System.out.println("11. Mostrar lista de capacitaciones");
            System.out.println("12. Salir");

            opcion = parseInt(sc.nextLine());

            switch(opcion){
                case 1:
                    c.setTipo("Cliente");
                    c.setNombreCompleto(c.getNombreCompleto());
                    c.setRun(c.getRun());
                    c.setFechaNacimiento(c.getFechaNacimiento());
                    c.setAfp(c.getAfp());
                    c.setSistSalud(c.getSistSalud());
                    c.setDireccion(c.getDireccion());
                    c.setComuna(c.getComuna());
                    c.setEdad(c.getEdad());
                    c.setTelefono(c.getTelefono());
                    cont.almacenarCliente(c);
                    break;
                case 2:
                    p.setTipo("Profesional");
                    p.setNombreCompleto(p.getNombreCompleto());
                    p.setRun(p.getRun());
                    p.setFechaNacimiento(p.getFechaNacimiento());
                    p.setTitulo(p.getTitulo());
                    p.setFechaIngreso(p.getFechaIngreso());
                    cont.almacenarProfesional(p);
                    break;
             case 3:
                    a.setTipo("Administrativo");
                    a.setNombreCompleto(a.getNombreCompleto());
                    a.setRun(a.getRun());
                    a.setFechaNacimiento(a.getFechaNacimiento());
                    a.setArea(a.getArea());
                    a.setExperienciaPrevia(a.getExperienciaPrevia());
                    cont.almacenarAdministrativo(a);
                    break;
               case 4:
                    cap.setIdCapacitacion(cap.getIdCapacitacion());
                    cap.setRutCliente(cap.getRutCliente());
                    cap.setDuracion(cap.getDuracion());
                    cap.setDia(cap.getDia());
                    cap.setHora(cap.getHora());
                    cap.setLugar(cap.getLugar());
                    cap.setCantidadAsistentes(cap.getCantidadAsistentes());
                    cont.agregarCapacitacion(cap);
                    break;
                   case 5:
                       ac.setIdAccidente(ac.getIdAccidente());
                       ac.setRutCliente(ac.getRutCliente());
                       ac.setDia(ac.getDia());
                       ac.setHora(ac.getHora());
                       ac.setLugar(ac.getLugar());
                       ac.setOrigen(ac.getOrigen());
                       ac.setConsecuencias(ac.getConsecuencias());
                    break;
                case 6:
                    vt.setIdVisita(vt.getIdVisita());
                    vt.setRutCliente(vt.getRutCliente());
                    vt.setDia(vt.getDia());
                    vt.setHora(vt.getHora());
                    vt.setLugar(vt.getLugar());
                    vt.setComentarios(vt.getComentarios());
                    break;
                case 7:
                    rev.setIdRevision(rev.getIdRevision());
                    rev.setIdVisita(rev.getIdVisita());
                    rev.setNombreRevision(rev.getNombreRevision());
                    rev.setDetalle(rev.getDetalle());
                    rev.setEstado(rev.getEstado());
                    break;
                 case 8:
                     cont.eliminarUsuario(u.getRun());
                    break;
                case 9:
                    cont.mostrarListaUsuarios();
                    break;
                case 10:

                    cont.listarPorTipo(u.getTipo());
                    break;
                case 11:
                    cont.mostrarListaCapaciones();
                    break;
                case 12:
                    System.out.println("Gracias por preferirnos, hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
    }
}
