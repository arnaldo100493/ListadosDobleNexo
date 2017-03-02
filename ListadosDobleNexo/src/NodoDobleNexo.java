/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class NodoDobleNexo {

    private Sintonia dato;
    private NodoDobleNexo siguiente;
    private NodoDobleNexo anterior;

    public NodoDobleNexo() {
        this.dato = null;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoDobleNexo(Sintonia dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoDobleNexo(Sintonia dato, NodoDobleNexo siguiente, NodoDobleNexo anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Sintonia getDato() {
        return dato;
    }

    public void setDato(Sintonia dato) {
        this.dato = dato;
    }

    public NodoDobleNexo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleNexo siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDobleNexo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleNexo anterior) {
        this.anterior = anterior;
    }

}
