package com.example.mario.umgapplogin;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {
    private EditText edt1;
    private ListView lv1;
    private List<String> listado;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        listado =new ArrayList<>();
        listado.add("Domingo");
        listado.add("Jorge");

        edt1=(EditText) findViewById(R.id.et1);
        lv1=(ListView) findViewById(R.id.lv1);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listado);
        lv1.setAdapter(adapter);


    }
    public void  add(View view){
        String value=edt1.getText().toString();
        listado.add(value);
        adapter.notifyDataSetChanged();

    }
}
