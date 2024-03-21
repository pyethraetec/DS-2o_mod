package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnsegundatela;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btnsegundatela = (Button) findViewById(R.Id.btnsegundatela);
        btnsegundatela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(packageContext MainActivity.this, MainActivity2.class);
                startActiviy(intent);
            }
        });

    }
}