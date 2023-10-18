package com.mateolambis.app;

import com.mateolambis.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main (String[] args){
        List<Vehiculo> Vehiculos = new ArrayList<>();
        Taxi taxi1 = new Taxi();
        Bicicleta bici = new Bicicleta();
        BicicletaMontana biciMon = new BicicletaMontana();
        BicicletaRuta biciRut =  new BicicletaRuta();

        Vehiculos.add(taxi1);
        Vehiculos.add(bici);
        Vehiculos.add(biciMon);
        Vehiculos.add(biciRut);

        Vehiculo vehiculo1 = biciMon;
        ((BicicletaMontana)vehiculo1).setTipoSuspencion("");

        taxi1.setEmpresa("Transoriente");


        if(vehiculo1 instanceof Bicicleta){
            System.out.println("Este vehiculo es una bicicleta de montaña");
        }else{
            System.out.println("Este vehiculo no es una bicicleta");
        }
        System.out.println("------------------------------------------------------");
        Vehiculo vehiculo2 = taxi1;
        ((Taxi)vehiculo2).setNroPasajeros(8);

        if (vehiculo2 instanceof  Bicicleta){
            System.out.println("Este vehiculo es un taxi, de la empresa: " + taxi1.getEmpresa());
            System.out.println("El taxi lleva esta cantidad de pasajeros: " + taxi1.getNroPasajeros());
        }else{
            System.out.println("Este vehiculo no es un taxi");
        }
    }
}
