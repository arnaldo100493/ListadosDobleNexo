/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class ListadoDobleNexo {

    private NodoDobleNexo first;
    private NodoDobleNexo actual;

    public ListadoDobleNexo() {
        this.first = null;
        this.actual = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public String ingresar(Sintonia dato) {
        NodoDobleNexo nodo = new NodoDobleNexo(dato);
        if (!this.isEmpty()) {
            nodo.setSiguiente(this.first);
            this.first.setAnterior(nodo);
        }
        this.first = nodo;
        this.actual = nodo;
        return "Elemento Ingresado.";
    }

    public String imprimir() {
        String s = "";
        NodoDobleNexo auxiliar = this.first;
        while (auxiliar != null) {
            s += "\n" + auxiliar.getDato().toString();
            auxiliar = auxiliar.getSiguiente();
        }
        return s;
    }

    public String avanzarDerecha() {
        if (this.isEmpty()) {
            return "No hay sintonias.";
        }
        if (this.actual.getSiguiente() != null) {
            this.actual = this.actual.getSiguiente();
        }
        return this.actual.getDato().toString();
    }

    public String avanzarIzquierda() {
        if (this.isEmpty()) {
            return "No hay sintonias.";
        }
        if (this.actual.getAnterior() != null) {
            this.actual = this.actual.getAnterior();
        }
        return this.actual.getDato().toString();
    }

    public String buscarDerecha() {
        if (this.isEmpty()) {
            return "No hay sintonias.";
        }
        if (this.actual.getSiguiente() != null) {
            NodoDobleNexo auxiliar = this.actual.getSiguiente();
            while (auxiliar != null) {
                if (auxiliar.getDato().isTieneRadio()) {
                    this.actual = auxiliar;
                    return this.actual.getDato().toString();
                }
                auxiliar = auxiliar.getSiguiente();
            }

        }
        return this.actual.getDato().toString();
    }

    public String buscarIzquierda() {
        if (this.isEmpty()) {
            return "No hay sintonias.";
        }
        if (this.actual.getAnterior() != null) {
            NodoDobleNexo auxiliar = this.actual.getAnterior();
            while (auxiliar != null) {
                if (auxiliar.getDato().isTieneRadio()) {
                    this.actual = auxiliar;
                    return this.actual.getDato().toString();
                }
                auxiliar = auxiliar.getAnterior();
            }

        }
        return this.actual.getDato().toString();
    }

    public String play() {
        if (this.isEmpty()) {
            return "No hay sintonias.";
        }
        return this.actual.getDato().toString();
    }

}
