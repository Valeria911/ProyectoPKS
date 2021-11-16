package consolidar;

import javax.swing.table.TableColumn;
import java.awt.font.TextLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tablero implements TableroInterface {

    //No tiene atributos sino listas e instancias para el tablero
    String[] totalCarros = new String[]{"K", "K", "K", "C", "C", "C", "C", "C", "T", "T", "T", "T", "T", "T", "T", "T", "T", "T"}; //total carros posibles para posicionar
    String[][] tableroLlenar = new String[15][15]; //mostrará al final carros y huevos
    String[][] tableroJugar = new String[15][15]; //muestra tablero vacío para jugar y achuntar
    List<Carro> carros = new ArrayList<>();
    List<Huevo> lanzamientos = new ArrayList<>();

    public Tablero() {
    }

    //Armar el tablero vacío, para verlo lo lleno con []
    //Imprimir el tablero en pantalla con los números de fila y columna

    @Override
    public void crearTableroLlenar() {
        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j <= 14; j++) {
                tableroLlenar[i][j] = " [ ] ";
            }
        }
    }

    public void crearTableroJugar() {
        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j <= 14; j++) {
                tableroJugar[i][j] = " [ ] ";
            }
        }
    }

    public void mostrarTableroJugar() {
        for (int j = 0; j <= 14; j++) {
            System.out.print("  " + (j) + "   ");//2 y 3 espacios
        }
        System.out.println(" "); //1 espacio
        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j <= 14; j++) {
                System.out.print(tableroJugar[i][j] + " "); //1 espacio al final
            }
            System.out.println(i);
        }
    }

    @Override
    public void mostrarTableroLlenar() {
        for (int j = 0; j <= 14; j++) {
            System.out.print("  " + (j) + "   ");//2 y 3 espacios
        }
        System.out.println(" "); //1 espacio
        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j <= 14; j++) {
                System.out.print(tableroLlenar[i][j] + " "); //1 espacio al final
            }
            System.out.println(i);
        }
    }

    @Override
    public void crearKromi() {
        for (int i = 0; i <= 14; i++) {
            boolean condicion = false; //Es necesario para salir del while
            while (condicion == false && totalCarros[i] == "K") {
                //ubicación máxima posible de K es fila 12
                int fila = (int) (Math.random() * 12);
                int columna = (int) (Math.random() * 14);

                if (tableroLlenar[fila][columna] == " [ ] " && tableroLlenar[fila + 1][columna] == " [ ] " && tableroLlenar[fila + 2][columna] == " [ ] ") {
                    //lleno tablero
                    tableroLlenar[fila][columna] = " [K] "; //esto mismo debo verificar después para los puntajes
                    tableroLlenar[fila + 1][columna] = " [K] ";
                    tableroLlenar[fila + 2][columna] = " [K] ";
                    condicion = true;
                }
            }
        }

        //creo instancias de Kromi para ingresar a lista de carros
        Kromi k1 = new Kromi(12, "24/02/2018", "Kromi", "2016", "Ford");
        Kromi k2 = new Kromi(16, "30/03/2019", "Kromi", "2018", "Chevrolet");
        Kromi k3 = new Kromi(12, "05/06/2020", "Kromi", "2019", "Chevrolet");
        carros.add(k1);
        carros.add(k2);
        carros.add(k3);
    }

    @Override
    public void crearCaguano() {
        for (int i = 0; i <= 14; i++) {
            boolean condicion = false;
            while (condicion == false && totalCarros[i] == "C") {
                int fila = (int) (Math.random() * 14);
                int columna = (int) (Math.random() * 13); //esta vez el limite es de columna

                if (tableroLlenar[fila][columna] == " [ ] " && tableroLlenar[fila][columna + 1] == " [ ] ") {
                    //lleno tablero
                    tableroLlenar[fila][columna] = " [C] ";
                    tableroLlenar[fila][columna + 1] = " [C] ";
                    condicion = true;
                }
            }
        }
        //creo instancias de caguanos
        Caguano c1 = new Caguano(3, "25/01/2018", "Caguano", 4.60, "Gris");
        Caguano c2 = new Caguano(2, "20/02/2018", "Caguano", 4.0, "Verde");
        Caguano c3 = new Caguano(3, "27/01/2017", "Caguano", 4.60, "Gris");
        Caguano c4 = new Caguano(4, "13/02/2021", "Caguano", 6.8, "Blanco");
        Caguano c5 = new Caguano(2, "26/11/2016", "Caguano", 4.0, "Verde");
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);
    }

    @Override
    public void crearTrupalla() {
        for (int i = 0; i <= 14; i++) {
            boolean condicion = false;
            while (condicion == false && totalCarros[i] == "T") {

                int fila = (int) (Math.random() * 14);
                int columna = (int) (Math.random() * 14);

                if (tableroLlenar[fila][columna] == " [ ] ") {
                    tableroLlenar[fila][columna] = " [T] ";
                    condicion = true;
                }
            }
        }

        Trupalla t1 = new Trupalla(1, "12/02/2012", "Trupalla", 1, "Juan Perez");
        Trupalla t2 = new Trupalla(1, "10/07/2019", "Trupalla", 2, "Pablo Molina");
        Trupalla t3 = new Trupalla(1, "09/09/2015", "Trupalla", 3, "Diego Lopez");
        Trupalla t4 = new Trupalla(1, "18/04/2017", "Trupalla", 4, "Mario Jimenez");
        Trupalla t5 = new Trupalla(1, "01/06/2014", "Trupalla", 5, "Ivan Lopez");
        Trupalla t6 = new Trupalla(1, "31/12/2020", "Trupalla", 1, "Felipe Toro");
        Trupalla t7 = new Trupalla(1, "10/05/2019", "Trupalla", 2, "Victor Mena");
        Trupalla t8 = new Trupalla(1, "29/07/2019", "Trupalla", 3, "Gino Brito");
        Trupalla t9 = new Trupalla(1, "03/08/2020", "Trupalla", 4, "Tito Rojas");
        Trupalla t10 = new Trupalla(1, "26/10/2016", "Trupalla", 5, "Carlos Gomez");

        carros.add(t1);
        carros.add(t2);
        carros.add(t3);
        carros.add(t4);
        carros.add(t5);
        carros.add(t6);
        carros.add(t7);
        carros.add(t8);
        carros.add(t9);
        carros.add(t10);
    }

    public void mostrarListadoCarros() {
        for (int i = 0; i <= 17; i++) {
            System.out.println(carros.get(i));
        }
    }

    @Override
    public void jugar() {
        //método para lanzar huevos y contar puntos obtenidos
        Scanner sc = new Scanner(System.in); //pedir opciones y coordenadas

        int puntajek = 0, puntajec = 0, puntajet = 0, puntos = 0; //acumulador de puntos

        System.out.println("Ingresa coordenadas para el lanzamiento");
        System.out.println("Ingresa Fila");
        int fila = sc.nextInt();
        System.out.println("Ingresa Columna");
        int columna = sc.nextInt();

        //en la coordenada entregada se pone la H, en tablero sin carros
        tableroJugar[fila][columna] = " [H] ";

        //se evalúa la misma posición en tablero con carros para asignar los puntajes si llega a un kromi
        if (tableroLlenar[fila][columna] == " [K] ") {
            puntajek = puntajek + 3;
            System.out.println("Buen tiro, obtuviste " + puntajek + " puntos!");

            //si llega a un caguano
        } else if (tableroLlenar[fila][columna] == " [C] ") {
            puntajec = puntajec + 2;
            System.out.println("Buen tiro, obtuviste " + puntajec + " puntos!");

            //si llega a una trupalla
        } else if (tableroLlenar[fila][columna] == " [T] ") {
            puntajet = puntajet + 1;

            System.out.println("Buen tiro, obtuviste " + puntajet + " puntos!");
        }
        puntos = puntajek + puntajec + puntajet;
    }


    public void mostrarLanzamientos() {
        int puntaje = 0, bono = 0, bono2 = 0;
        int total = 0, total1 = 0, total2 = 0, total3 = 0, totalFinal1 = 0, totalFinal2 = 0;
        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j <= 14; j++) {
                Huevo h = new Huevo();
                if (tableroJugar[i][j] == " [H] " && tableroLlenar[i][j] == " [K] ") {
                    puntaje = 3;
                    h.setFila(i);
                    h.setColumna(j);
                    h.setPuntaje(puntaje);
                    lanzamientos.add(h);
                    total1 = total1 + puntaje;
                    if (tableroLlenar[i][j] == " [K] " && tableroLlenar[i + 1][j] == " [K] " && tableroLlenar[i + 2][j] == " [K] ") {
                        //tableroJugar tiene los huevos, evaluo mismas posiciones en ambos tableros
                        if (tableroJugar[i][j] == " [H] " && tableroJugar[i + 1][j] == " [H] " && tableroJugar[i + 2][j] == " [H] ") {
                            bono = 10;
                        }
                    }
                }

                if (tableroJugar[i][j] == " [H] " && tableroLlenar[i][j] == " [C] ") {
                    puntaje = 2;
                    h.setFila(i);
                    h.setColumna(j);
                    h.setPuntaje(puntaje);
                    lanzamientos.add(h);
                    total2 = total2 + puntaje;
                    if (tableroLlenar[i][j] == " [C] " && tableroLlenar[i][j + 1] == " [C] ") {
                        if (tableroJugar[i][j] == " [H] " && tableroJugar[i][j + 1] == " [H] ") {
                            bono2 = 7;
                        }
                    }
                    }

                if (tableroJugar[i][j] == " [H] " && tableroLlenar[i][j] == " [T] ") {
                    puntaje = 1;
                    h.setFila(i);
                    h.setColumna(j);
                    h.setPuntaje(puntaje);
                    lanzamientos.add(h);
                    total3 = total3 + puntaje;
                }

                if (tableroJugar[i][j] == " [H] " && tableroLlenar[i][j] == " [ ] ") {
                    puntaje = 0;
                    h.setFila(i);
                    h.setColumna(j);
                    h.setPuntaje(puntaje);
                    lanzamientos.add(h);
                }
            }
        }
        total = total1 + total2 + total3 + bono + bono2;
        System.out.println("Puntaje total: "+ total);
        System.out.println(lanzamientos.toString());
    }

    }



