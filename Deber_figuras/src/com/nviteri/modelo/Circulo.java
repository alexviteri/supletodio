/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nviteri.modelo;

/**
 *
 * @author USER
 */
public class Circulo {
       int radio;
    Punto p;

    public Circulo() {
    }

    public Circulo(int radio, Punto p) {
        this.radio = radio;
        this.p = p;
    }

    public void setP(Punto p) {
        this.p = p;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getP() {
        return p;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "El punto del círculo es:"+p.toString()+
                "\nRadio: "+getRadio();
    }
    
    
}
