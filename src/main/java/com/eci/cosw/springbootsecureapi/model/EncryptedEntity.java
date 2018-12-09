package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class EncryptedEntity {



    private String nombre;

    private Integer cedula;

    private String key;

    private Double amount;

    public EncryptedEntity(String nombre, Integer cedula, String key) {
        this.nombre =nombre;
        this.cedula = cedula;
        this.key = key;
        this.amount=0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCedula() { return cedula;}

    public String getKey() {
        return key;
    }

    public Double getAmount(){return amount;}

    public Double setAmount(){return amount;}
}

