package com.milts;

public class Cliente {
    //pk
    private String nif;
    private String nombre;
    private String ciudad;
    private String direccionç;
    private int telefono;

    public Cliente(String nif, String nombre, String ciudad, String direccionç, int telefono) {
        this.setNif(nif);
        this.setNombre(nombre);
        this.setCiudad(ciudad);
        this.setDireccionç(direccionç);
        this.setTelefono(telefono);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccionç() {
        return direccionç;
    }

    public void setDireccionç(String direccionç) {
        this.direccionç = direccionç;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", direccionç='" + direccionç + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
