package com.example.tarjetafelicitacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asignación de fuente en tiempo de ejecución.
        // Creación de objeto Typeface desde "resources".
        Typeface tfBeautyAndBeast =  ResourcesCompat.getFont(this, R.font.beauty_and_the_beast);
        TextView tvNombre = findViewById(R.id.tvNombre);
        tvNombre.setTypeface(tfBeautyAndBeast);

        // Ejecutamos la reproducción del archivo MP3 "happy_birthday".
        MediaPlayer reproductor = MediaPlayer.create(this, R.raw.happy_birthday);
        reproductor.start();

        // Creamos una animación de zoom y giro sobre un TextView (etiqueta/label).
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        TextView tvFelicidades = findViewById(R.id.tvFelicidades);
        tvFelicidades.startAnimation(animacion);

        // Creamos una animación de "cortinilla" sobre un TextView (etiqueta/label).
        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        TextView tvDepartede = findViewById(R.id.tvDepartede);
        tvDepartede.startAnimation(slideUp);
        tvNombre.startAnimation(slideUp);
    }
}