package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rub-em
 */
class Contacto {
    /**
     * @variable name nombre del contacto
     * @variable phones telefonos del contacto
     */
    private String name;
    private List<String> phones;

    /**
     * @param name nombre del contacto
     * @param phone telefono del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     *
     * @return nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return telefono del contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}