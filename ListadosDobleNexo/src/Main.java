/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("Listados Doble Nexo");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int n = 10;   
        // for (int i = 1; i <= n; i++) {
        //}
        //c.println(lista.imprimir());
        // Ingresamos las sintonías a la radio
        Radio radio = new Radio();
        radio.agregarSintonia(10, "");
        radio.agregarSintonia(9, "");
        radio.agregarSintonia(8, "RADIO 3");
        radio.agregarSintonia(7, "");
        radio.agregarSintonia(6, "");
        radio.agregarSintonia(5, "");
        radio.agregarSintonia(4, "RADIO 2");
        radio.agregarSintonia(3, "RADIO 1");
        radio.agregarSintonia(2, "");
        radio.agregarSintonia(1, "");

        // Desplegamos las sintonías ingresadas
        c.println(radio.getListadoRadios());

        // Desplegamos menú de opciones
        menu();

        // Leemos la opción seleccionada
        c.println("Ingrese una opción:");
        int opcion = c.readInt();

        while (opcion != 0) {
            if (opcion == 1) {
                c.clear();
                c.println(radio.avanzarDerecha());
            }

            if (opcion == 2) {
                c.clear();
                c.println(radio.avanzarIzquierda());
            }

            if (opcion == 3) {
                c.clear();
                c.println(radio.buscarDerecha());
            }

            if (opcion == 4) {
                c.clear();
                c.println(radio.buscarIzquierda());
            }

            if (opcion == 5) {
                c.clear();
                c.println(radio.play());
            }

            c.println("");
            menu();
            c.println("Ingrese una opción:");
            opcion = c.readInt();

        }
        c.close();

    }

    public static void menu() {
        c.println("[1] Avanzar Derecha.");
        c.println("[2] Avanzar Izquierda.");
        c.println("[3] Buscar Derecha.");
        c.println("[4] Buscar Izquierda.");
        c.println("[5] PLAY.");
        c.println("[0] Salir.");

    }
}
