package com.example.raulsimon.quiz;

import android.app.Application;
import android.app.Fragment;
import android.content.Intent;
import android.media.audiofx.EnvironmentalReverb;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class QuizActivity extends AppCompatActivity {

    public static final String TAG="KPI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Log.d("KPI", "starting app...");

        Toast.makeText(this, "how many tasks pending!", Toast.LENGTH_SHORT).show();

        findViewById(R.id.text2).setMinimumHeight(200);  //busca por la ID guardada en R desde XML


        /*
        //bloque para los ENTRAR
        final Button bEnter=(Button)findViewById(R.id.enter);
        OnClickListener aListener=new OnClickListener() {
            @Override
            public void onClick(View v) {
                bEnter.setOnClickListener(this);
                //crear el Intent
                Intent intentSaludo=new Intent(QuizActivity.this,Saludo.class);

            }
        };


        //bloque para el botón SALIR
        final Button bExit=(Button)findViewById(R.id.exit);
        OnClickListener bListener=new OnClickListener() {
            @Override
            public void onClick(View v) {
                bExit.setOnClickListener(this);
                //crear el Intent
                Intent inttentExit=new Intent(QuizActivity.this, Salida.class);
            }
        };
        //para cuando pase el cursor por encima, que alga un Toast

     */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intentA = new Intent(this, SettingsActivity.class);   //no concluido !!!!!!
            startActivity(intentA);
            Intent intentB=new Intent(this, EnvironmentalReverb.Settings.class);
            intentB.putExtra("ejemplo", true);
            startActivity(intentB);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
