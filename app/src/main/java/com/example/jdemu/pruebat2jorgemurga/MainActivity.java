package com.example.jdemu.pruebat2jorgemurga;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(TextView)findViewById(R.id.nameApp);
        String carpetaFuente = "fonts/AmaticSC-Regular.ttf";
        Typeface fuente = Typeface.createFromAsset(getAssets(), carpetaFuente);
        nombre.setTypeface(fuente);
        Thread timerTread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(MainActivity.this, MyLogin.class);
                    startActivity(intent);
                }
            }
        };
        timerTread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
