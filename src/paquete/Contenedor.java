package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contenedor {
    List<Usuario> listaUsuarios = new ArrayList<>();
    List<Capacitacion> listaCapacitacion = new ArrayList<>();

    public void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public void agregarCapacitacion(Capacitacion capacitacion){
        listaCapacitacion.add(capacitacion);
    }

    public String mostrarListaUsuarios(){
        return listaUsuarios.toString();
    }
    public String mostrarListaCapaciones(){
        return listaCapacitacion.toString();
    }

    public void eliminarUsuario(Usuario usuario, Integer run){
        String eliminado = "Usuario ha sido eliminado correctamente";
        Scanner sc = new Scanner(System.in);
        if(listaUsuarios.size() > 0){
            System.out.println("Indique el run del usuario que desea eliminar");
            run = sc.nextInt();
            listaUsuarios.remove(usuario.run);
        }
        System.out.println(eliminado);
    }


}
