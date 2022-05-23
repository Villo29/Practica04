package com.david.practica04.models;

public class Vehiculo {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public short getModelo() {
        return modelo;
    }

    public void setModelo(short modelo) {
        this.modelo = modelo;
    }

    private String marca;
    private short modelo;
}
