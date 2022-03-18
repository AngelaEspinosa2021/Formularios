package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class FormularioPersonas extends AppCompatActivity {

    public CardView CardRegistroPersona;
    public TextView TituloPersonas;
    public TextView NombrePersona;
    public EditText TxtNombrePersona;
    public TextView ApellidosPersona;
    public EditText TxtApellidoPersona;
    public TextView Genero;
    public CheckBox F;
    public CheckBox M;
    public CheckBox OTRO;
    public TextView TxtOtroGenero;
    public TextView TipoDocumento;
    public TextView NumeroDocumentoPersona;
    public RadioButton CC;
    public RadioButton CE;
    public RadioButton PA;
    public TextView TxtNumeroDocumento;
    public TextView PaisPersona;
    public EditText TxtPaisPersona;
    public TextView DptoPersona;
    public EditText TxtDptoPersona;
    public TextView CiudadPersona;
    public EditText TxtCiudadPersona;
    public TextView DireccionPersona;
    public EditText TxtDireccionPersona;
    public TextView EmailPersona;
    public EditText TxtEmailPersona;
    public TextView TelefonoPersona;
    public EditText TxtTelefonoPersona;
    public Button BtnRegistrarPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_personas);
        setContentAtributes();
    }

    private void setContentAtributes(){
        CardRegistroPersona = findViewById(R.id.CardRegistroPersona);
        TituloPersonas = findViewById(R.id.TituloPersonas);
        NombrePersona = findViewById(R.id.NombrePersona);
        TxtNombrePersona = findViewById(R.id.TxtNombrePersona);
        ApellidosPersona = findViewById(R.id.ApellidosPersona);
        TxtApellidoPersona = findViewById(R.id.TxtApellidoPersona);
        Genero = findViewById(R.id.Genero);
        F = findViewById(R.id.F);
        M = findViewById(R.id.M);
        OTRO = findViewById(R.id.OTRO);
        TxtOtroGenero = findViewById(R.id.TxtOtroGenero);
        TipoDocumento = findViewById(R.id.TipoDocumento);
        NumeroDocumentoPersona = findViewById(R.id.NumeroDocumentoPersona);
        CC = findViewById(R.id.CC);
        CE = findViewById(R.id.CC);
        PA = findViewById(R.id.CC);
        TxtNumeroDocumento = findViewById(R.id.TxtNumeroDocumento);
        PaisPersona = findViewById(R.id.PaisPersona);
        TxtPaisPersona = findViewById(R.id.TxtPaisPersona);
        DptoPersona = findViewById(R.id.DptoPersona);
        TxtDptoPersona = findViewById(R.id.TxtDptoPersona);
        CiudadPersona = findViewById(R.id.CiudadPersona);
        TxtCiudadPersona = findViewById(R.id.TxtCiudadPersona);
        DireccionPersona = findViewById(R.id.DireccionPersona);
        TxtDireccionPersona = findViewById(R.id.TxtDireccionPersona);
        EmailPersona = findViewById(R.id.EmailPersona);
        TxtEmailPersona = findViewById(R.id.TxtEmailPersona);
        TelefonoPersona = findViewById(R.id.TelefonoPersona);
        TxtTelefonoPersona = findViewById(R.id.TxtTelefonoPersona);
        BtnRegistrarPersona = findViewById(R.id.BtnRegistrarPersona);




    }
}