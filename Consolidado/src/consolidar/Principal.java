package consolidar;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tablero tab1 = new Tablero();
        tab1.crearTableroLlenar();
        tab1.crearTableroJugar();
        tab1.mostrarTableroJugar();
        tab1.crearKromi();
        tab1.crearCaguano();
        tab1.crearTrupalla();
        tab1.mostrarTableroLlenar();
        tab1.mostrarListadoCarros();
        tab1.mostrarLanzamientos();


       boolean salir = false;
        System.out.println("Bienvenido al juego");

        do {
        System.out.println("Seleccione la opción que desea realizar: ");
        System.out.println("1. Ver tablero");
        System.out.println("2. Jugar");
        System.out.println("3. Ver listado de carros");
        System.out.println("4. Ver listado de lanzamientos y puntaje");
        System.out.println("5. Salir");
        String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    tab1.mostrarTableroJugar();
                    break;
                case "2":
                    tab1.jugar();
                    break;
                case "3":
                    tab1.mostrarListadoCarros();
                    break;
                case "4":
                    tab1.mostrarLanzamientos();
                    break;
                case "5":
                    System.out.println("Has seleccionado salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese opción válida");
            }
        }while(!salir);
    }
    }

