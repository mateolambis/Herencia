package com.mateolambis.dominio;

public class Taxi extends Vehiculo {
    private String registroCircular;
    private String empresa;
    private int nroPasajeros;

    public String getRegistroCircular() {
        return registroCircular;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setNroPasajeros(int nroPasajeros) {
        this.nroPasajeros = nroPasajeros;
    }
}
