package com.nasa.projectcesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

    }

    public void irCadastro(View view) {
        Intent intent = new Intent(this, cadastro.class);
        startActivity(intent);
    }

    public void irLogin(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

}
