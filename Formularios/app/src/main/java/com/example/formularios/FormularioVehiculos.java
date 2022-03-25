package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class FormularioVehiculos extends AppCompatActivity {

    public TextView TituloFormularioVehiculo;
    public TextView DatosModeloFormVehiculo;
    public TextView MarcaFormVehiculo;
    public EditText TxtMarcaFormVehiculo;
    public TextView AñoModeloFormVehiculo;
    public EditText TxtAñoModeloFormVehiculo;
    public TextView ModeloFormVehiculo;
    public EditText TxtModeloFormVehiculo;
    public TextView PaisOrigenFormVehiculo;
    public EditText TxtPaisOrigenFormVehiculo;
    public TextView ClaseVehiculoFormVehiculo;
    public EditText TxtClaseVehiculoFormVehiculo;
    public TextView TipoVehiculoFormVehiculo;
    public EditText TxtTipoVehiculoFormVehiculo;
    public TextView PesoFormVehiculo;
    public EditText TxtPesoFormVehiculo;
    public TextView PropietarioFormVehiculo;
    public RadioButton CCFormVehiculo;
    public RadioButton RUCFormVehiculo;
    public RadioButton PAFormVehiculo;
    public RadioButton NITFormVehiculo;
    public TextView NumeroDocPropietarioFormVehiculo;
    public EditText TxtNumeroDocPropietarioFormVehiculo;
    public TextView RazonSocialPropietarioFormVehiculo;
    public EditText TxtRazonSocialPropietarioFormVehiculo;
    public TextView DetalleModeloFormVehiculo;
    public TextView AireAcondicionadoFormVehiculo;
    public RadioButton SiFormVehiculo;
    public RadioButton NoFormVehiculo;
    public TextView CilindrajeFormVehiculo;
    public EditText TxtCilindrajeFormVehiculo;
    public TextView NumPuertasFormVehiculo;
    public EditText TxtNumPuertasFormVehiculo;
    public TextView NumCabinasFormVehiculo;
    public RadioButton CabinaSimpleFormVehiculo;
    public RadioButton CabinaDobleFormVehiculo;
    public TextView TipoCombustibleFormVehiculo;
    public RadioButton GasolinaFormVehiculo;
    public RadioButton DieselFormVehiculo;
    public RadioButton HibridoFormVehiculo;
    public RadioButton ElectircoFormVehiculo;
    public TextView TransmisiónFormVehiculo;
    public RadioButton TransManualFormVehiculo;
    public RadioButton TransAutoFormVehiculo;
    public Button BtnRegistrarFormVehiculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_vehiculos);
    }

    public void setContentAtributes(){
        TituloFormularioVehiculo = findViewById(R.id.TituloFormularioVehiculo);
        DatosModeloFormVehiculo = findViewById(R.id.DatosModeloFormVehiculo);
        MarcaFormVehiculo = findViewById(R.id.MarcaFormVehiculo);
        TxtMarcaFormVehiculo = findViewById(R.id.TxtMarcaFormVehiculo);
        AñoModeloFormVehiculo = findViewById(R.id.AñoModeloFormVehiculo);
        TxtAñoModeloFormVehiculo = findViewById(R.id.TxtAñoModeloFormVehiculo);
        ModeloFormVehiculo = findViewById(R.id.ModeloFormVehiculo);
        TxtModeloFormVehiculo = findViewById(R.id.TxtModeloFormVehiculo);
        PaisOrigenFormVehiculo = findViewById(R.id.PaisOrigenFormVehiculo);
        TxtPaisOrigenFormVehiculo = findViewById(R.id.TxtPaisOrigenFormVehiculo);
        ClaseVehiculoFormVehiculo = findViewById(R.id.ClaseVehiculoFormVehiculo);
        TxtClaseVehiculoFormVehiculo = findViewById(R.id.TxtClaseVehiculoFormVehiculo);
        TipoVehiculoFormVehiculo = findViewById(R.id.TipoVehiculoFormVehiculo);
        TxtTipoVehiculoFormVehiculo = findViewById(R.id.TxtTipoVehiculoFormVehiculo);
        PesoFormVehiculo = findViewById(R.id.PesoFormVehiculo);
        TxtPesoFormVehiculo = findViewById(R.id.TxtPesoFormVehiculo);
        PropietarioFormVehiculo = findViewById(R.id.PropietarioFormVehiculo);
        CCFormVehiculo = findViewById(R.id.CCFormVehiculo);
        RUCFormVehiculo = findViewById(R.id.RUCFormVehiculo);
        PAFormVehiculo = findViewById(R.id.PAFormVehiculo);
        NITFormVehiculo = findViewById(R.id.NITFormVehiculo);
        NumeroDocPropietarioFormVehiculo = findViewById(R.id.NumeroDocPropietarioFormVehiculo);
        TxtNumeroDocPropietarioFormVehiculo = findViewById(R.id.TxtNumeroDocPropietarioFormVehiculo);
        RazonSocialPropietarioFormVehiculo = findViewById(R.id.RazonSocialPropietarioFormVehiculo);
        TxtRazonSocialPropietarioFormVehiculo = findViewById(R.id.TxtRazonSocialPropietarioFormVehiculo);
        DetalleModeloFormVehiculo = findViewById(R.id.DetalleModeloFormVehiculo);
        AireAcondicionadoFormVehiculo = findViewById(R.id.AireAcondicionadoFormVehiculo);
        SiFormVehiculo = findViewById(R.id.SiFormVehiculo);
        NoFormVehiculo = findViewById(R.id.NoFormVehiculo);
        CilindrajeFormVehiculo = findViewById(R.id.CilindrajeFormVehiculo);
        TxtCilindrajeFormVehiculo = findViewById(R.id.TxtCilindrajeFormVehiculo);
        NumPuertasFormVehiculo = findViewById(R.id.NumPuertasFormVehiculo);
        TxtNumPuertasFormVehiculo = findViewById(R.id.TxtNumPuertasFormVehiculo);
        NumCabinasFormVehiculo = findViewById(R.id.NumCabinasFormVehiculo);
        CabinaSimpleFormVehiculo = findViewById(R.id.CabinaSimpleFormVehiculo);
        CabinaDobleFormVehiculo = findViewById(R.id.CabinaDobleFormVehiculo);
        TipoCombustibleFormVehiculo = findViewById(R.id.TipoCombustibleFormVehiculo);
        GasolinaFormVehiculo = findViewById(R.id.GasolinaFormVehiculo);
        DieselFormVehiculo = findViewById(R.id.DieselFormVehiculo);
        HibridoFormVehiculo = findViewById(R.id.HibridoFormVehiculo);
        ElectircoFormVehiculo = findViewById(R.id.ElectircoFormVehiculo);
        TransmisiónFormVehiculo = findViewById(R.id.TransmisiónFormVehiculo);
        TransManualFormVehiculo = findViewById(R.id.TransManualFormVehiculo);
        TransAutoFormVehiculo = findViewById(R.id.TransAutoFormVehiculo);
        BtnRegistrarFormVehiculo = findViewById(R.id.BtnRegistrarFormVehiculo);
    }
}