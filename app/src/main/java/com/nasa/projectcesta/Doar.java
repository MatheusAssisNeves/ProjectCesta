package com.nasa.projectcesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Doar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doar);
    }
    public void irFinalD(View view) {
        Intent intent = new Intent(this, finalDoar.class);
        startActivity(intent);
    }
}