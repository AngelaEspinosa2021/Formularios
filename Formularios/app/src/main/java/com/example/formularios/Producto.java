package com.example.formularios;

public class Producto
{
    //variables nativas de la clase
    public String nombreCompletoCliente;
    public String tipoDocumentoCliente;
    public String numeroDocumentoCliente;
    public String telefonoCliente;
    public int idProducto;
    public int cantidad;
    public double precioUnitario;
    public double importeTotal;

    //constructores
    public Producto()
    {
        nombreCompletoCliente="Angela Maria Espinosa Granada";
        tipoDocumentoCliente="CC";
        numeroDocumentoCliente="1053777489";
        telefonoCliente="3193452785";
        idProducto=00001;
        cantidad=2;
        precioUnitario=1200;
        importeTotal=2400;
    }

    public Producto(String nombreCompletoCliente, String tipoDocumentoCliente, String numeroDocumentoCliente, String telefonoCliente, int idProducto, int cantidad, double precioUnitario, double importeTotal)
    {
        this();
        this.nombreCompletoCliente=nombreCompletoCliente;
        this.tipoDocumentoCliente=tipoDocumentoCliente;
        this.numeroDocumentoCliente=numeroDocumentoCliente;
        this.telefonoCliente=telefonoCliente;
        this.idProducto=idProducto;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
        this.importeTotal=importeTotal;
    }

    //fin constructores

    //metodos

    public String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }

    public void setNombreCompletoCliente(String nombreCompletoCliente) {
        this.nombreCompletoCliente = nombreCompletoCliente;
    }

    public String getTipoDocumentoCliente() {
        return tipoDocumentoCliente;
    }

    public void setTipoDocumentoCliente(String tipoDocumentoCliente) {
        this.tipoDocumentoCliente = tipoDocumentoCliente;
    }

    public String getNumeroDocumentoCliente() {
        return numeroDocumentoCliente;
    }

    public void setNumeroDocumentoCliente(String numeroDocumentoCliente) {
        this.numeroDocumentoCliente = numeroDocumentoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
}
