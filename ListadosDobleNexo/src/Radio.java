/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Radio {

    private ListadoDobleNexo listado;

    public Radio() {
        this.listado = new ListadoDobleNexo();
    }

    public String agregarSintonia(int numero, String nombreRadio) {
        Sintonia sintonia = new Sintonia(numero, nombreRadio);
        return this.listado.ingresar(sintonia);
    }

    public String getListadoRadios() {
        return this.listado.imprimir();
    }

    public String avanzarDerecha() {
        return this.listado.avanzarDerecha();
    }

    public String avanzarIzquierda() {
        return this.listado.avanzarIzquierda();
    }

    public String buscarDerecha() {
        return this.listado.buscarDerecha();
    }

    public String buscarIzquierda() {
        return this.listado.buscarIzquierda();
    }

    public String play() {
        return this.listado.play();
    }

}
