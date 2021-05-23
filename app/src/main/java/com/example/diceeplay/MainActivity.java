package com.example.diceeplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbtn = findViewById(R.id.rollbutton);
        ImageView leftdiceimg = findViewById(R.id.dice1);
        ImageView rightdiceimg = findViewById(R.id.dice2);

        final int[] diceArrayImage = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        rollbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomnumgenerator = new Random();
                int num = randomnumgenerator.nextInt(6);
                leftdiceimg.setImageResource(diceArrayImage[num]);

                Random randomgenerator2 = new Random();
                int num2 = randomgenerator2.nextInt(6);
                rightdiceimg.setImageResource(diceArrayImage[num2]);

                Log.d("Diccee","Tested Log in Logcat terminal");
                Toast.makeText(MainActivity.this, "Dice Rolled !", Toast.LENGTH_SHORT).show();

            }
        });

    }
}