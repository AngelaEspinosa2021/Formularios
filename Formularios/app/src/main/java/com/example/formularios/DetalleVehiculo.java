package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetalleVehiculo extends AppCompatActivity {

    public TextView TituloDetalleVehiculo;
    public TextView DatosModeloDetalleVehiculo;
    public TextView MarcaModeloDetalleVehiculo;
    public EditText TxtMarcaModeloDetalleVehiculo;
    public TextView AñoModeloDetalleVehiculo;
    public EditText TxtAñoModeloDetalleVehiculo;
    public TextView ModeloDetalleVehiculo;
    public EditText TxtModeloDetalleVehiculo;
    public TextView PaisOrigenDetalleVehiculo;
    public EditText TxtPaisOrigenDetalleVehiculo;
    public TextView ClaseModeloDetalleVehiculo;
    public EditText TxtClaseModeloDetalleVehiculo;
    public TextView TipoModeloDetalleVehiculo;
    public EditText TxtTipoModeloDetalleVehiculo;
    public TextView PesoModeloDetalleVehiculo;
    public EditText TxtPesoModeloDetalleVehiculo;
    public TextView TituloPropietarioDetalleVehiculo;
    public TextView TipoDocPropDetalleVehiculo;
    public EditText TxtTipoDocPropDetalleVehiculo;
    public TextView NumDocPropDetalleVehiculo;
    public EditText TxtNumDocPropDetalleVehiculo;
    public TextView RazonSocialPropDetalleVehiculo;
    public EditText TxtRazonSocialPropDetalleVehiculo;
    public TextView DetalleModeloDetalleVehiculo;
    public TextView AireAcondDetalleVehiculo;
    public EditText TxtAireAcondDetalleVehiculo;
    public TextView CilindrajeDetalleVehiculo;
    public EditText TxtCilindrajeDetalleVehiculo;
    public TextView NumPuertasDetalleVehiculo;
    public EditText TxtNumPuertasDetalleVehiculo;
    public TextView NumCabinasDetalleVehiculo;
    public EditText TxtNumCabinasDetalleVehiculo;
    public TextView TipoCombustibleDetalleVehiculo;
    public EditText TxtTipoCombustibleDetalleVehiculo;
    public TextView TipoTransmisionDetalleVehiculo;
    public EditText TxtTipoTransmisionDetalleVehiculo;
    public Button BtnSalirDetalleVehiculo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_vehiculo);
    }

    public void setContenctAtributtes()
    {
        TituloDetalleVehiculo = findViewById(R.id.TituloDetalleVehiculo);
        DatosModeloDetalleVehiculo = findViewById(R.id.DatosModeloDetalleVehiculo);
        MarcaModeloDetalleVehiculo = findViewById(R.id.MarcaModeloDetalleVehiculo);
        TxtMarcaModeloDetalleVehiculo = findViewById(R.id.TxtMarcaModeloDetalleVehiculo);
        AñoModeloDetalleVehiculo = findViewById(R.id.AñoModeloDetalleVehiculo);
        TxtAñoModeloDetalleVehiculo = findViewById(R.id.TxtAñoModeloDetalleVehiculo);
        ModeloDetalleVehiculo = findViewById(R.id.ModeloDetalleVehiculo);
        TxtModeloDetalleVehiculo = findViewById(R.id.TxtModeloDetalleVehiculo);
        PaisOrigenDetalleVehiculo = findViewById(R.id.PaisOrigenDetalleVehiculo);
        TxtPaisOrigenDetalleVehiculo = findViewById(R.id.TxtPaisOrigenDetalleVehiculo);
        ClaseModeloDetalleVehiculo = findViewById(R.id.ClaseModeloDetalleVehiculo);
        TxtClaseModeloDetalleVehiculo = findViewById(R.id.TxtClaseModeloDetalleVehiculo);
        TipoModeloDetalleVehiculo = findViewById(R.id.TipoModeloDetalleVehiculo);
        TxtTipoModeloDetalleVehiculo = findViewById(R.id.TxtTipoModeloDetalleVehiculo);
        PesoModeloDetalleVehiculo = findViewById(R.id.PesoModeloDetalleVehiculo);
        TxtPesoModeloDetalleVehiculo = findViewById(R.id.TxtPesoModeloDetalleVehiculo);
        TituloPropietarioDetalleVehiculo = findViewById(R.id.TituloPropietarioDetalleVehiculo);
        TipoDocPropDetalleVehiculo = findViewById(R.id.TipoDocPropDetalleVehiculo);
        TxtTipoDocPropDetalleVehiculo = findViewById(R.id.TxtTipoDocPropDetalleVehiculo);
        NumDocPropDetalleVehiculo = findViewById(R.id.NumDocPropDetalleVehiculo);
        TxtNumDocPropDetalleVehiculo = findViewById(R.id.TxtNumDocPropDetalleVehiculo);
        RazonSocialPropDetalleVehiculo = findViewById(R.id.RazonSocialPropDetalleVehiculo);
        TxtRazonSocialPropDetalleVehiculo = findViewById(R.id.TxtRazonSocialPropDetalleVehiculo);
        DetalleModeloDetalleVehiculo = findViewById(R.id.DetalleModeloDetalleVehiculo);
        AireAcondDetalleVehiculo = findViewById(R.id.AireAcondDetalleVehiculo);
        TxtAireAcondDetalleVehiculo = findViewById(R.id.TxtAireAcondDetalleVehiculo);
        CilindrajeDetalleVehiculo = findViewById(R.id.CilindrajeDetalleVehiculo);
        TxtCilindrajeDetalleVehiculo = findViewById(R.id.TxtCilindrajeDetalleVehiculo);
        NumPuertasDetalleVehiculo = findViewById(R.id.NumPuertasDetalleVehiculo);
        TxtNumPuertasDetalleVehiculo = findViewById(R.id.TxtNumPuertasDetalleVehiculo);
        NumCabinasDetalleVehiculo = findViewById(R.id.NumCabinasDetalleVehiculo);
        TxtNumCabinasDetalleVehiculo = findViewById(R.id.TxtNumCabinasDetalleVehiculo);
        TipoCombustibleDetalleVehiculo = findViewById(R.id.TipoCombustibleDetalleVehiculo);
        TxtTipoCombustibleDetalleVehiculo = findViewById(R.id.TxtTipoCombustibleDetalleVehiculo);
        TipoTransmisionDetalleVehiculo = findViewById(R.id.TipoTransmisionDetalleVehiculo);
        TxtTipoTransmisionDetalleVehiculo = findViewById(R.id.TxtTipoTransmisionDetalleVehiculo);
        BtnSalirDetalleVehiculo = findViewById(R.id.BtnSalirDetalleVehiculo);
    }
}