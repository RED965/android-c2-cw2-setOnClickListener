package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1 = findViewById(R.id.firstnumb);
        EditText number2 = findViewById(R.id.secondnumb);

        TextView tot = findViewById(R.id.total);

        Button add = findViewById(R.id.add);
        Button minimize = findViewById(R.id.minimize);
        Button divide = findViewById(R.id.divide);
        Button kick = findViewById(R.id.kick);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int res1 = Integer.parseInt(number1.getText().toString()) ;
            int res2 = Integer.parseInt(number2.getText().toString()) ;
                 tot.setText(res1 + res2 + " ");
            }
        });


        minimize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res1 = Integer.parseInt(number1.getText().toString()) ;
                int res2 = Integer.parseInt(number2.getText().toString()) ;
                tot.setText(res1 - res2 + " ");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res1 = Integer.parseInt(number1.getText().toString()) ;
                int res2 = Integer.parseInt(number2.getText().toString()) ;
                tot.setText(res1 / res2 + " ");
            }
        });


        kick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res1 = Integer.parseInt(number1.getText().toString()) ;
                int res2 = Integer.parseInt(number2.getText().toString()) ;
                tot.setText(res1 * res2 + " ");
            }
        });

    }
}