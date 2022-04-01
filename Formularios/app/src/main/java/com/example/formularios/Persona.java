package com.example.formularios;

import android.provider.ContactsContract;

public class Persona
{
    //variables nativas de la clase
    public String nombres;
    public String apellidos;
    public String genero;
    public String tipoDocumento;
    public String numeroDocumento;
    public String paisResidencia;
    public String departamento;
    public String ciudad;
    public String direccionResidencia;
    public String email;
    public String telefono;


    //constructores
    public Persona()
    {
        nombres="Angela María";
        apellidos="Espinosa Granada";
        genero="Femenino";
        tipoDocumento="CC";
        numeroDocumento="1053777489";
        paisResidencia="Colombia";
        departamento="Caldas";
        ciudad="Manizales";
        direccionResidencia="Carrera 28 N° 48 - 100";
        email="Titagena@gmail.com";
        telefono="3193452785";
    }

    public Persona(String nombres, String apellidos, String genero, String tipoDocumento, String numeroDocumento, String paisResidencia, String departamento, String ciudad, String direccionResidencia, String email, String telefono)
    {
        this();
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.genero=genero;
        this.tipoDocumento=tipoDocumento;
        this.numeroDocumento=numeroDocumento;
        this.paisResidencia=paisResidencia;
        this.departamento=departamento;
        this.ciudad=ciudad;
        this.direccionResidencia=direccionResidencia;
        this.email=email;
        this.telefono=telefono;

    }
    // fin constructores

    //métodos
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    //fin métodos
}
