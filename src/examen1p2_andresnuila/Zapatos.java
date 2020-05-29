package examen1p2_andresnuila;

import java.awt.Color;

public class Zapatos extends Objeto {

    private String suela;
    private int talla,comodidad;

    public Zapatos() {
    }

    public Zapatos(int talla, String suela, int comodidad, Color color, String marca, String tamaño, String calidad, Persona entrega, String descripcion) {
        super(color, marca, tamaño, calidad, entrega, descripcion);
        this.talla = talla;
        this.suela = suela;
        this.comodidad = comodidad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
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
        return "talla=" + talla + ", suela=" + suela + ", comodidad=" + comodidad;
    }

}
