package com.example.kossa.coursgestionproductivite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.kossa.coursgestionproductivite.R.layout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Button btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

//        Log.d("MainActivity", "Entrer dans la methode onCreate()");
//        Log.i("MainActivity", "Utilisateur connecté");
//        Log.e("MainActivity", "Connexion impossible!");
//
//        Toast.makeText(getApplicationContext(),"okoj",Toast.LENGTH_LONG).show();
//
//        println(Log.WARN, "MainActivity", "ghost c'est toi " );;



    }


    public void testUpload(){
        int i=1+1;
        int ii=3+3;
    }
}
