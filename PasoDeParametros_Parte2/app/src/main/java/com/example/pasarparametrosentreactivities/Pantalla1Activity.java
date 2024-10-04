package com.example.pasarparametrosentreactivities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pasarparametrosentreactivities.R;
import com.example.pasarparametrosentreactivities.beans.Usuario;
import com.example.pasarparametrosentreactivities.datos.SeasData;

public class Pantalla1Activity extends AppCompatActivity {
    private EditText edtUser;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);

        edtUser = (EditText)findViewById(R.id.edtUsuario);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegarEntrePantallas=new Intent(getBaseContext(), Pantalla2Activity.class);
                /*navegarEntrePantallas.putExtra("Usuario", edtUser.getText().toString());*/

                Usuario miUsuario= new Usuario();
                miUsuario.setEmail(edtUser.getText().toString());
                SeasData.setUsuario(miUsuario);
                startActivity(navegarEntrePantallas);
            }
        });
    }
}