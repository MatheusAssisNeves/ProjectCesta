package com.nasa.projectcesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tipo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tipo);
    }
    public void irDoar(View view) {
        Intent intent = new Intent(this, Doar.class);
        startActivity(intent);
    }
    public void irReceber(View view) {
        Intent intent = new Intent(this, Receber.class);
        startActivity(intent);
    }
}