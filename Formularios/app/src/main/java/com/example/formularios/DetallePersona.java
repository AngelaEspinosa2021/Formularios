package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetallePersona extends AppCompatActivity {

    public TextView TituloDetallePersona;
    public TextView NombreDetalleP;
    public EditText TxtNombreDetalleP;
    public TextView ApellidosDetalleP;
    public EditText TxtApellidosDetalleP;
    public TextView TipoDocDetalleP;
    public EditText TxtTipoDocDetalleP;
    public TextView NumeroDocDetalleP;
    public EditText TxtNumDocDetalleP;
    public TextView GeneroDetalleP;
    public EditText TxtGeneroDetalleP;
    public TextView PaisDetalleP;
    public EditText TxtPaisDetalleP;
    public TextView DptoDetalleP;
    public EditText TxtDptoDetalleP;
    public TextView CiudadDetalleP;
    public EditText TxtCiudadDetalleP;
    public TextView EmailDetalleP;
    public EditText TxtEmailDetalleP;
    public TextView DireccionDetalleP;
    public EditText TxtDireccionDetalleP;
    public TextView TelefonoDetalleP;
    public EditText TxtTelefonoDetalleP;
    public Button BtnSalirDetallePersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_persona);
    }

    public void setContentAtributtes(){
        TituloDetallePersona = findViewById(R.id.TituloDetallePersona);
        NombreDetalleP = findViewById(R.id.NombreDetalleP);
        TxtNombreDetalleP = findViewById(R.id.TxtNombreDetalleP);
        ApellidosDetalleP = findViewById(R.id.ApellidosDetalleP);
        TxtApellidosDetalleP = findViewById(R.id.TxtApellidosDetalleP);
        TipoDocDetalleP = findViewById(R.id.TipoDocDetalleP);
        TxtTipoDocDetalleP = findViewById(R.id.TxtTipoDocDetalleP);
        NumeroDocDetalleP = findViewById(R.id.NumeroDocDetalleP);
        TxtNumDocDetalleP = findViewById(R.id.TxtNumDocDetalleP);
        GeneroDetalleP = findViewById(R.id.GeneroDetalleP);
        TxtGeneroDetalleP = findViewById(R.id.TxtGeneroDetalleP);
        PaisDetalleP = findViewById(R.id.PaisDetalleP);
        TxtPaisDetalleP = findViewById(R.id.TxtPaisDetalleP);
        DptoDetalleP = findViewById(R.id.DptoDetalleP);
        TxtDptoDetalleP = findViewById(R.id.TxtDptoDetalleP);
        CiudadDetalleP = findViewById(R.id.CiudadDetalleP);
        TxtCiudadDetalleP = findViewById(R.id.TxtCiudadDetalleP);
        EmailDetalleP = findViewById(R.id.EmailDetalleP);
        TxtEmailDetalleP = findViewById(R.id.TxtEmailDetalleP);
        DireccionDetalleP = findViewById(R.id.DireccionDetalleP);
        TxtDireccionDetalleP = findViewById(R.id.TxtDireccionDetalleP);
        TelefonoDetalleP = findViewById(R.id.TelefonoDetalleP);
        TxtTelefonoDetalleP = findViewById(R.id.TxtTelefonoDetalleP);
        BtnSalirDetallePersona = findViewById(R.id.BtnSalirDetallePersona);

    }
}