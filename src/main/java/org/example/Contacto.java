package org.example;

import java.util.ArrayList;
import java.util.List;

class Contacto {
    /** Variables de clase que almacenan el nombre y telefono de un contacto*/
    private String name;
    private List<String> phones;

  /** Metodo para crear un contacto con su nombre y nº de telefono */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }
/** Metodo getter que devuelve el nombre del contacto*/
    public String getName() {
        return this.name;
    }
/** Metodo getter que devuelve el telefono del contacto*/
    public List<String> getPhones() {
        return this.phones;
    }
}