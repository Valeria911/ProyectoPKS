package paquete;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Principal {

    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setNombre(u.getNombre());
        u.setFechaNac(u.getFechaNac());
        u.setRun(u.getRun());
        Cliente c = new Cliente();
        Profesional p = new Profesional();
        Administrativo a = new Administrativo();
        Capacitacion cap = new Capacitacion();
        Contenedor cont = new Contenedor();
        cont.agregarUsuario(u);
        cont.mostrarListaUsuarios();
        cont.eliminarUsuario(u, u.getRun());

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
                    c.setRut(c.getRut());
                    c.setNombres(c.getNombres());
                    c.setApellidos(c.getApellidos());
                    c.setTelefono(c.getTelefono());
                    c.setAfp(c.getAfp());
                    c.setSistSalud(c.getSistSalud());
                    c.setDireccion(c.getDireccion());
                    c.setComuna(c.getComuna());
                    c.setEdad(c.getEdad());
                    cont.listaUsuarios.add(c);
                    break;
                case 2:
                    p.setNombre(p.getNombre());
                    p.setRun(p.getRun());
                    p.setFechaNac(p.getFechaNac());
                    p.setTipo(p.getTipo());
                    p.setTitulo(p.getTitulo());
                    p.setFechaIngreso(p.getFechaIngreso());
                    cont.listaUsuarios.add(p);
                    break;
                case 3:
                    a.setNombre(a.getNombre());
                    a.setFechaNac(a.getFechaNac());
                    a.setRun(a.getRun());
                    a.setTipo(a.getTipo());
                    a.setArea(a.getArea());
                    a.setExpPrevia(a.getExpPrevia());
                    cont.listaUsuarios.add(a);
                    break;
                case 4:
                    cap.setId(cap.getId());
                    cap.setRutCliente(cap.getRutCliente());
                    cap.setDia(cap.getDia());
                    cap.setHora(cap.getHora());
                    cap.setLugar(cap.getLugar());
                    cont.listaCapacitacion.add(cap);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    cont.listaUsuarios.toString();
                    break;
                case 10:
                    break;
                case 11:
                    cont.listaCapacitacion.toString();
                    break;
                case 12:
                    break;
                default:
            }
        }
    }
}
