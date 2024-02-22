package org.example;

import java.util.*;

/**
 * @author Rub-em
 */
public class Agenda {
    /**
     * @see Contacto
     */
    private List<Contacto> contacts; // Lista de Contacto

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     *
     * @param name nombre del contacto a añadir
     * @param phone telefono del contacto a añadir
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }
/**
 * @param name nombre del contacto a borrar
 *
 * */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     *
     * @param name nombre del contacto a modificar
     * @param oldPhone telefono antiguo del contacto a modificar
     * @param newPhone telefono nuevo del contacto a modificar
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     *
     * @return List<Contacto> La lista de contactos.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}