package com.example.marmitando;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class marmitando2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marmitando2);
    }
    public void abrirtela3(View View){
        Intent tela2 = new Intent(marmitando2.this,marmitando3.class);
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.anim1,R.anim.anim1);
        ActivityCompat.startActivity(marmitando2.this, tela2, activityOptionsCompat.toBundle());
    }


}