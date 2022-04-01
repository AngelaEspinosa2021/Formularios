package com.example.formularios;

public class Vehiculo
{
    //variables nativas de la clase
    public String marca;
    public String añoModelo;
    public String modelo;
    public String paisOrigen;
    public String claseDeVehiculo;
    public String tipoDeVehiculo;
    public double pesoBruto;
    public String tipoDocumentoPropietario;
    public String numeroDocumentoPropietario;
    public String nombreCompletoPropietario;
    public boolean aireAcondicionado;
    public double cilindraje;
    public int cantidadPuertas;
    public String numeroCabinas;
    public String tipoCombustible;
    public String transmision;

    //constructores
    public Vehiculo()
    {
        marca="Mazda";
        añoModelo="2010";
        modelo="Mazda 3 Sedan";
        paisOrigen="Colombia";
        claseDeVehiculo="Automovil";
        tipoDeVehiculo="Coche segmento C";
        pesoBruto=1.28;
        tipoDocumentoPropietario="CC";
        numeroDocumentoPropietario="1053777489";
        nombreCompletoPropietario="Angela Maria Espinosa Granada";
        aireAcondicionado=true;
        cilindraje=1998;
        cantidadPuertas=5;
        numeroCabinas="doble";
        tipoCombustible="Gasolina";
        transmision="Automatica";
    }

    public Vehiculo(String marca, String añoModelo, String modelo, String paisOrigen, String claseDeVehiculo, String tipoDeVehiculo, double pesoBruto, String tipoDocumentoPropietario, String numeroDocumentoPropietario, String nombreCompletoPropietario, boolean aireAcondicionado, double cilindraje, int cantidadPuertas, String numeroCabinas, String tipoCombustible, String transmision)
    {
        this();
        this.marca=marca;
        this.añoModelo=añoModelo;
        this.modelo=modelo;
        this.paisOrigen=paisOrigen;
        this.claseDeVehiculo=claseDeVehiculo;
        this.tipoDeVehiculo=tipoDeVehiculo;
        this.pesoBruto=pesoBruto;
        this.tipoDocumentoPropietario=tipoDocumentoPropietario;
        this.numeroDocumentoPropietario=numeroDocumentoPropietario;
        this.nombreCompletoPropietario=nombreCompletoPropietario;
        this.aireAcondicionado=aireAcondicionado;
        this.cilindraje=cilindraje;
        this.cantidadPuertas=cantidadPuertas;
        this.numeroCabinas=numeroCabinas;
        this.tipoCombustible=tipoCombustible;
        this.transmision=transmision;
    }
    //fin constructores

    //metodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAñoModelo() {
        return añoModelo;
    }

    public void setAñoModelo(String añoModelo) {
        this.añoModelo = añoModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getClaseDeVehiculo() {
        return claseDeVehiculo;
    }

    public void setClaseDeVehiculo(String claseDeVehiculo) {
        this.claseDeVehiculo = claseDeVehiculo;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public String getTipoDocumentoPropietario() {
        return tipoDocumentoPropietario;
    }

    public void setTipoDocumentoPropietario(String tipoDocumentoPropietario) {
        this.tipoDocumentoPropietario = tipoDocumentoPropietario;
    }

    public String getNumeroDocumentoPropietario() {
        return numeroDocumentoPropietario;
    }

    public void setNumeroDocumentoPropietario(String numeroDocumentoPropietario) {
        this.numeroDocumentoPropietario = numeroDocumentoPropietario;
    }

    public String getNombreCompletoPropietario() {
        return nombreCompletoPropietario;
    }

    public void setNombreCompletoPropietario(String nombreCompletoPropietario) {
        this.nombreCompletoPropietario = nombreCompletoPropietario;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getNumeroCabinas() {
        return numeroCabinas;
    }

    public void setNumeroCabinas(String numeroCabinas) {
        this.numeroCabinas = numeroCabinas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

}
