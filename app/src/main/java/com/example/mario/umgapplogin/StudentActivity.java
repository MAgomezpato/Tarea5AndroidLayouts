package com.example.mario.umgapplogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {

    EditText et1, et2, et3;
    RadioGroup grupo1;
    CheckBox c1, c2, c3, c4, c5;
    TextView tv2;
    SeekBar skb1;
    int progreso=24;
    Spinner opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        opciones = (Spinner)findViewById(R.id.sp1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);

        opciones.setAdapter(adapter);

        skb1 = (SeekBar) findViewById(R.id.seekBar1);
        skb1.setMax(100);
        skb1.setProgress(progreso);

        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(""+progreso);
        tv2.setTextSize(progreso);

        skb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progreso = i;
                tv2.setText(""+progreso);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void ingresar(View view){

        Toast notification=Toast.makeText(this, "Encuesta Ingresada",Toast.LENGTH_SHORT);
        notification.show();

        grupo1=(RadioGroup) findViewById(R.id.grb1);
        grupo1.clearCheck();

        et1=(EditText) findViewById(R.id.et1);
        et1.setText("");
        et3=(EditText) findViewById(R.id.et3);
        et3.setText("");

        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("");

        opciones = (Spinner) findViewById(R.id.sp1);
        opciones.clearAnimation();

        c1 = (CheckBox) findViewById(R.id.cb1);
        c1.setChecked(false);

        c2 = (CheckBox) findViewById(R.id.cb2);
        c2.setChecked(false);

        c3 = (CheckBox) findViewById(R.id.cb3);
        c3.setChecked(false);

        c4 = (CheckBox) findViewById(R.id.cb4);
        c4.setChecked(false);

        c5 = (CheckBox) findViewById(R.id.cb5);
        c5.setChecked(false);
    }

}
