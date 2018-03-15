package com.example.kossa.coursgestionproductivite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        String s="Entrer dans la methode onCreate()";
        Log.i("Main2Activity",s);
        Log.w("Main2Activity", "connexion reussie");
        Log.e("Main2Activity", "Authentification echoué!");

        Button btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
}
