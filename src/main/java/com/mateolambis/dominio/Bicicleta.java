package com.mateolambis.dominio;

public class Bicicleta extends Vehiculo {
    private byte nropinones;
    private double tamanoRueda;
    private String tipoFreno;

    public byte getNropinones() {
        return nropinones;
    }

    public double getTamanoRueda() {
        return tamanoRueda;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setNropinones(byte nropinones) {
        this.nropinones = nropinones;
    }

    public void setTamanoRueda(double tamanoRueda) {
        this.tamanoRueda = tamanoRueda;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }
}
