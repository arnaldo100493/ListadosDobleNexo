/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Sintonia {

    private int numero;
    private String nombreRadio;
    private boolean tieneRadio;

    public Sintonia() {
        this.numero = 0;
        this.nombreRadio = "";
        this.tieneRadio = false;
    }

    public Sintonia(int numero, String nombreRadio) {
        this.numero = numero;
        this.nombreRadio = nombreRadio;
        this.tieneRadio = true;
        if (nombreRadio.equals("")) {
            this.tieneRadio = false;
        }
    }

    public Sintonia(int numero, String nombreRadio, boolean tieneRadio) {
        this.numero = numero;
        this.nombreRadio = nombreRadio;
        this.tieneRadio = tieneRadio;
    }

    public Sintonia(Sintonia sintonia) {
        this.numero = sintonia.getNumero();
        this.nombreRadio = sintonia.getNombreRadio();
        this.tieneRadio = sintonia.isTieneRadio();
    }

    @Override
    public String toString() {
        return this.numero + " " + this.getNombreRadio();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreRadio() {
        if (this.nombreRadio.equals("")) {
            return "---";
        }
        return nombreRadio;
    }

    public void setNombreRadio(String nombreRadio) {
        this.nombreRadio = nombreRadio;
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

}
