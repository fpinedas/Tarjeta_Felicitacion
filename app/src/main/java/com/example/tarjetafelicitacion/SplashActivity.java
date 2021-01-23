package com.example.tarjetafelicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

// Implementar el interface "AnimationListener" nos permite controlar que ocurrirá con
// la activity cuando terminen de ejecutarse las animaciones.
public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Ocultamos la barra superior en esta activity.
        getSupportActionBar().hide();

        // Asignación de fuente en tiempo de ejecución.
        // Creación de objeto Typeface desde "assets".
        Typeface tfTimeToParty = Typeface.createFromAsset(getAssets(), "time_to_party.ttf");
        // Búsqueda de TextView por su ID.
        TextView tvSplash = findViewById(R.id.tvSplash);
        // Asignación del objeto Typeface al TextView buscado.
        tvSplash.setTypeface(tfTimeToParty);

        // Creamos una animación sobre un TextView (etiqueta/label).
        // Para ver los detalles de la animación, ver el código fuente del recurso.
        Animation aniSplash = AnimationUtils.loadAnimation(this, R.anim.splash);
        tvSplash.startAnimation(aniSplash);

        // Al objeto animación creado, le asignamos un listener de tipo "AnimationListener".
        // Como el "AnimationListener" pertenece a esta misma clase, le pasamos como
        // parámetro "this".
        aniSplash.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        // Este método se ejecutará cuando la animación haya terminado.
        // Llamamos a la activity "MainActivity".
        Intent i = new Intent(SplashActivity.this, MainActivity.class );
        startActivity(i);
        // Terminamos la activity "SplashActivity".
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}