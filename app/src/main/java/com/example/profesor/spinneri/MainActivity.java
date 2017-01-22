package com.example.profesor.spinneri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner miSp;
    private String op[] = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op[1]= getString(R.string.suma);
        op[2]= getString(R.string.resta);
        op[3]= getString(R.string.mutiplicar);
        op[4]= getString(R.string.divifir);
        miSp=(Spinner) findViewById(R.id.spnOperaciones);
        ArrayAdapter<String> adaptador=new
                ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op);
        miSp.setAdapter(adaptador);
    }

    public void mostrar(View view){
        //int id=
        String selec=miSp.getSelectedItem().toString();
        switch(selec){
            case "sumar":
                Toast.makeText(this,String.format("%s %s",getString(R.string.tst_mensaje),"sumar"),Toast.LENGTH_LONG).show();
                break;
            case "restar":
                Toast.makeText(this,String.format("%s %s",getString(R.string.tst_mensaje),"restar"),Toast.LENGTH_LONG).show();
                break;
            case "multiplicar":
                Toast.makeText(this,String.format("%s %s",getString(R.string.tst_mensaje),"multiplicar"),Toast.LENGTH_LONG).show();
                break;
            case "dividir":
                Toast.makeText(this,String.format("%s %s",getString(R.string.tst_mensaje),"dividir"),Toast.LENGTH_LONG).show();
                break;
        }
        /*if(selec.equals("restar")){
            Toast.makeText(this,String.format("%s %s",getString(R.string.tst_mensaje),"restar"),Toast.LENGTH_LONG).show();
        }*/
    }
}
