package com.example.tarjetafelicitacion;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asignación de fuente en tiempo de ejecución.
        Typeface miFuente = Typeface.createFromAsset(getAssets(), "time_to_party.ttf");
        TextView tv = (TextView) findViewById(R.id.tvNombre);
        tv.setTypeface(miFuente);

        // Ejecutamos la reproducción del archivo MP3 "happy_birthday".
        MediaPlayer reproductor = MediaPlayer.create(this, R.raw.happy_birthday);
        reproductor.start();
    }
}