package com.example.formularios;

public class Concesionario
{
    //atributos de la clase
    public Persona[] listaPersonas = new Persona[10];
    public Vehiculo[] listaVehiculos = new Vehiculo[15];
    public Producto[] listaProductos = new Producto[7];

    //métodos

    public Persona[] getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Persona[] listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(Vehiculo[] listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Producto[] getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Producto[] listaProductos) {
        this.listaProductos = listaProductos;
    }
}
