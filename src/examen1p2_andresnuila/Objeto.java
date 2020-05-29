package examen1p2_andresnuila;

import java.awt.Color;

public class Objeto {
    protected Color color;
    protected String marca,tamaño,calidad;
    protected Persona entrega;

    public Objeto() {
    }

    public Objeto(Color color, String marca, String tamaño, String calidad, Persona entrega) {
        this.color = color;
        this.marca = marca;
        this.tamaño = tamaño;
        this.calidad = calidad;
        this.entrega = entrega;
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
        return "Objeto{" + "color=" + color + ", marca=" + marca + ", tama\u00f1o=" + tamaño + ", calidad=" + calidad + ", entrega=" + entrega + '}';
    }
    
    
}
