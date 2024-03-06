package com.example.layout1;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);

        setContentView(R.layout.first_layout);

        EditText name = findViewById(R.id.input_name);
        EditText email = findViewById(R.id.inputEmail);
        EditText phone = findViewById(R.id.inputPhone);

        Button btnSave= findViewById(R.id.btnSave);

        btnSave.setOnClickListener( e -> {
            Log.i("AGENDA_CONTATO", "Nome" + name.getText());
            Log.i("AGENDA_CONTATO", "Email" + email.getText());
            Log.i("AGENDA_CONTATO", "Telefone" + phone.getText());

        });





    }
}
