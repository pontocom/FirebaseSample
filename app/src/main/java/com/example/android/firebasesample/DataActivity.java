package com.example.android.firebasesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.android.firebasesample.models.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataActivity extends AppCompatActivity {
    protected EditText etNome, etEmail, etTelefone;
    protected DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        etNome = (EditText) findViewById(R.id.etNome);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etTelefone = (EditText) findViewById(R.id.etTelefone);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("agenda");
    }

    public void onBtnGravar(View v) {
        String nome = etNome.getText().toString();
        String email = etEmail.getText().toString();
        String telefone = etTelefone.getText().toString();

        User user = new User(nome, email, telefone);
        databaseReference.child("users").child(nome).setValue(user);
    }

}
