package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contenedor {
    Scanner sc = new Scanner(System.in);
    List<Asesoria> duda = new ArrayList<>();

    List<Capacitacion> listaCapacitacion = new ArrayList<>();

    public void almacenarCliente (Cliente cliente) {
        duda.add(cliente);
    }

    public void almacenarProfesional (Profesional profesional) {
        duda.add(profesional);
    }

    public void almacenarAdministrativo (Administrativo administrativo) {
        duda.add(administrativo);
    }

    public void mostrarListaUsuarios(){
        for (int i = 0; i < duda.size(); i++) {
            System.out.println(duda.get(i));
            System.out.println("----------------------");
        }
    }

    public void agregarCapacitacion(Capacitacion capacitacion){
        listaCapacitacion.add(capacitacion);
    }

    public void mostrarListaCapaciones(){
        System.out.println(listaCapacitacion.toString());
    }

    public void eliminarUsuario(Integer run){
        String eliminado = "Usuario ha sido eliminado correctamente";
        if(duda.size() > 0){
            System.out.println("Indique el run del usuario que desea eliminar");
            run = sc.nextInt();
            duda.remove(run);
        }
        System.out.println(eliminado);
    }

    public void listarPorTipo(String tipo){
        System.out.println("Indique el tipo de usuario a listar: \n" +
                "- Clientes \n" +
                "- Administrativos \n" +
                "- Profesionales");

        for (int i = 0; i < duda.size(); i++) {
            if (tipo.equalsIgnoreCase("clientes")){

            } else if (tipo.equalsIgnoreCase("administrativos")) {
                System.out.println(duda.contains(tipo));
                ;
            } else if (tipo.equalsIgnoreCase("profesionales")) {
                System.out.println(duda.get(i).toString());
                ;
            }
        }

    }

}
