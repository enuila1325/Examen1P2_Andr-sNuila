package examen1p2_andresnuila;

import java.awt.Color;

public class Objetos_Hogar extends Objeto {

    String lugar, instrucciones, Garantia;

    public Objetos_Hogar() {
    }

    public Objetos_Hogar(String lugar, String instrucciones, String Garantia, Color color, String marca, String tamaño, String calidad, Persona entrega) {
        super(color, marca, tamaño, calidad, entrega);
        this.lugar = lugar;
        this.instrucciones = instrucciones;
        this.Garantia = Garantia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getEntrega() {
        return entrega;
    }

    public void setEntrega(Persona entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return "lugar=" + lugar + ", instrucciones=" + instrucciones + ", Garantia=" + Garantia;
    }

}
