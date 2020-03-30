package com.example.covid19apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuUtama extends AppCompatActivity {

    ImageView kondisi;
    TextView lastupdate;
    Button cek, updatekondisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        kondisi = findViewById(R.id.imageKondisi);
        lastupdate = findViewById(R.id.txtupdate);
        cek = findViewById(R.id.btnkondisi);
        updatekondisi = findViewById(R.id.btnUpdate);


    }
}
