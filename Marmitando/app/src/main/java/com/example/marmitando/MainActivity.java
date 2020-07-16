package com.example.marmitando;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirtela2(View view){
        Intent tela = new Intent(this, marmitando2.class);
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.anim1,R.anim.anim1);
        ActivityCompat.startActivity(MainActivity.this, tela, activityOptionsCompat.toBundle());
        //startActivity(tela);
    }

}