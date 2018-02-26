package com.example.user.bpjskelompok4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pendaftaran(View view) {
        startActivity(new Intent(this, Pendaftaran.class));
    }
    public void primarycare(View view) {
        startActivity(new Intent(this, Pcare.class));
    }
    public void prosedurpend(View view) {
        startActivity(new Intent(this, Prosedurpend.class));
    }
    public void alamat(View view) {
        startActivity(new Intent(this, Alamat.class));
    }
    public void about(View view) {
        startActivity(new Intent(this, About.class));
    }
    public void jaminan(View view) {
        startActivity(new Intent(this, Jaminankesehatan.class));
    }
    public void faskes(View view){
        startActivity(new Intent(this, FasKes.class));
    }
    public void cekiuran(View view){
        startActivity(new Intent(this, CekIuran.class));
    }
}