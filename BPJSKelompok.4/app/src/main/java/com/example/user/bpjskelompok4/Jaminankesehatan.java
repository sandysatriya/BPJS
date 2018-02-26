package com.example.user.bpjskelompok4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Jaminankesehatan extends AppCompatActivity {
Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jaminankesehatan);
    }

    public void manfaat(View view) {

        startActivity(new Intent(this, Manfaat.class));
    }
    public void iuran(View view) {

        startActivity(new Intent(this, Iuran.class));
    }

    public void peserta(View view) {

        startActivity(new Intent(this, Peserta.class));
    }
}
