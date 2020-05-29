package examen1p2_andresnuila;

import java.awt.Color;

public class Ropa extends Objeto {

    private String talla, tela, pais;

    public Ropa() {
    }

    public Ropa(String talla, String tela, String pais, Color color, String marca, String tamaño, String calidad, Persona entrega) {
        super(color, marca, tamaño, calidad, entrega);
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
        return "talla=" + talla + ", tela=" + tela + ", pais=" + pais;
    }

}
