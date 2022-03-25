package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetalleProducto extends AppCompatActivity {

    public TextView TituloDetalleProducto;
    public TextView DatosClienteDetalleProducto;
    public TextView NombreClienteDetalleProducto;
    public TextView TipoDocClienteDetalleProducto;
    public TextView NumeroDetalleProducto;
    public TextView TelefonoClienteDetalleProducto;
    public TextView DatosProductoDetalleProducto;
    public TextView IdProductoDetalleProducto;
    public TextView CantidadProductoDetalleProducto;
    public TextView PrecioUnitarioDetalleProducto;
    public TextView ImporteTotalDetalleProducto;
    public EditText TxtNombreClienteDetalleProducto;
    public EditText TxtTipoDocDetalleProducto;
    public EditText TxtNumeroDetalleProducto;
    public EditText TxtTelefonoClienteDetalleProducto;
    public EditText TxtIdProductoDetalleProducto;
    public EditText TxtCantidadProductoDetalleProducto;
    public EditText TxtPrecioUnitarioDetalleProducto;
    public EditText TxtImporteTotalDetalleProducto;
    public Button BtnSalirDetalleProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);
        setContenctAtributtes();
    }

    public void setContenctAtributtes(){
        TituloDetalleProducto = findViewById(R.id.TituloDetalleProducto);
        DatosClienteDetalleProducto = findViewById(R.id.DatosClienteDetalleProducto);
        NombreClienteDetalleProducto = findViewById(R.id.NombreClienteDetalleProducto);
        TipoDocClienteDetalleProducto = findViewById(R.id.TipoDocClienteDetalleProducto);
        NumeroDetalleProducto = findViewById(R.id.NumeroDetalleProducto);
        TelefonoClienteDetalleProducto = findViewById(R.id.TelefonoClienteDetalleProducto);
        DatosProductoDetalleProducto = findViewById(R.id.DatosProductoDetalleProducto);
        IdProductoDetalleProducto = findViewById(R.id.IdProductoDetalleProducto);
        CantidadProductoDetalleProducto = findViewById(R.id.CantidadProductoDetalleProducto);
        PrecioUnitarioDetalleProducto = findViewById(R.id.PrecioUnitarioDetalleProducto);
        ImporteTotalDetalleProducto = findViewById(R.id.ImporteTotalDetalleProducto);
        TxtNombreClienteDetalleProducto = findViewById(R.id.TxtNombreClienteDetalleProducto);
        TxtTipoDocDetalleProducto = findViewById(R.id.TxtTipoDocDetalleProducto);
        TxtNumeroDetalleProducto = findViewById(R.id.TxtNumeroDetalleProducto);
        TxtTelefonoClienteDetalleProducto = findViewById(R.id.TxtTelefonoClienteDetalleProducto);
        TxtIdProductoDetalleProducto = findViewById(R.id.TxtIdProductoDetalleProducto);
        TxtCantidadProductoDetalleProducto = findViewById(R.id.TxtCantidadProductoDetalleProducto);
        TxtPrecioUnitarioDetalleProducto = findViewById(R.id.TxtPrecioUnitarioDetalleProducto);
        TxtImporteTotalDetalleProducto = findViewById(R.id.TxtImporteTotalDetalleProducto);
        BtnSalirDetalleProducto = findViewById(R.id.BtnSalirDetalleProducto);
    }
}