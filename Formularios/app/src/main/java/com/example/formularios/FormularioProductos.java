package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormularioProductos extends AppCompatActivity {

    public TextView TituloProducto;
    public TextView DatosClienteProducto;
    public TextView NombreClienteProducto;
    public TextView TipoDocClienteProducto;
    public TextView NumDocClienteProducto;
    public TextView TelefonoClienteProducto;
    public EditText TxtNombreClienteProducto;
    public EditText TxtTipoDocClienteProducto;
    public EditText TxtNumDocClienteProducto;
    public EditText TxtTelfClienteProducto;
    public TextView DatosProducto;
    public TextView IdProducto;
    public TextView CantidadProducto;
    public TextView PrecioUnitarioProducto;
    public TextView ImporteTotalProducto;
    public EditText TxtIdProducto;
    public EditText TxtCantidadProducto;
    public EditText TxtPrecioUProducto;
    public EditText TxtImportTProducto;
    public Button BtnRegistrarProducto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_productos);
        setContenctAtributtes();
    }

    public void setContenctAtributtes(){
        TituloProducto = findViewById(R.id.TituloProducto);
        DatosClienteProducto = findViewById(R.id.DatosClienteProducto);
        NombreClienteProducto = findViewById(R.id.NombreClienteProducto);
        TipoDocClienteProducto = findViewById(R.id.TipoDocClienteProducto);
        NumDocClienteProducto = findViewById(R.id.NumDocClienteProducto);
        TelefonoClienteProducto = findViewById(R.id.TelefonoClienteProducto);
        TxtNombreClienteProducto = findViewById(R.id.TxtNombreClienteProducto);
        TxtTipoDocClienteProducto = findViewById(R.id.TxtTipoDocClienteProducto);
        TxtNumDocClienteProducto = findViewById(R.id.TxtNumDocClienteProducto);
        TxtTelfClienteProducto = findViewById(R.id.TxtTelfClienteProducto);
        DatosProducto = findViewById(R.id.DatosProducto);
        IdProducto = findViewById(R.id.IdProducto);
        CantidadProducto = findViewById(R.id.CantidadProducto);
        PrecioUnitarioProducto = findViewById(R.id.PrecioUnitarioProducto);
        ImporteTotalProducto = findViewById(R.id.ImporteTotalProducto);
        TxtIdProducto = findViewById(R.id.TxtIdProducto);
        TxtCantidadProducto = findViewById(R.id.TxtCantidadProducto);
        TxtPrecioUProducto = findViewById(R.id.TxtPrecioUProducto);
        TxtImportTProducto = findViewById(R.id.TxtImportTProducto);
        BtnRegistrarProducto = findViewById(R.id.BtnRegistrarProducto);
    };
}