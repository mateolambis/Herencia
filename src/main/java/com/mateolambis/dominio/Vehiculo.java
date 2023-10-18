package com.mateolambis.dominio;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int anioModelo;

    public void avanzar(){
        System.out.println("acelerar");
    }
    public void frenar(){
        System.out.println("frenaste");
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return modelo;
    }

    public int getAnioModelo() {
        return anioModelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
