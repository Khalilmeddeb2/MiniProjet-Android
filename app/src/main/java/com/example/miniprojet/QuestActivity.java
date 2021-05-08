package com.example.miniprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class QuestActivity extends AppCompatActivity {

    private Switch switch1;
    private Switch switch2;
    private EditText temp;
    RadioButton oui,non;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
        this.switch1 =(Switch)findViewById(R.id.switch1);
        this.switch2 =(Switch)findViewById(R.id.switch2);
        this.temp =(EditText)findViewById(R.id.temp);
        this.oui=(RadioButton)findViewById((R.id.oui));
        this.non=(RadioButton)findViewById((R.id.non));
    }


    public void Verifier(View v){
        float res1=Float.valueOf((temp.getText().toString()));
        if(switch1.isChecked() && res1 > 38 && switch2.isChecked() && oui.isChecked()) {
            Intent i = new Intent(QuestActivity.this, PositiveActivity.class);
            startActivity(i);
        }

        if(switch1.isChecked() && res1 > 38 && switch2.isChecked() && non.isChecked()) {
            Intent i = new Intent(QuestActivity.this, NegativeActivity.class);
            startActivity(i);
        }

        if(  res1 > 38 && switch2.isChecked() && oui.isChecked()) {
            Intent i = new Intent(QuestActivity.this, PositiveActivity.class);
            startActivity(i);
        }
        if( res1 > 38 && oui.isChecked()) {
            Intent i = new Intent(QuestActivity.this, PositiveActivity.class);
            startActivity(i);

        }
        if( res1 > 38 && non.isChecked()) {
            Intent i = new Intent(QuestActivity.this, NegativeActivity.class);
            startActivity(i);

        }
        if( res1 <38 && non.isChecked()) {
            Intent i = new Intent(QuestActivity.this, NegativeActivity.class);
            startActivity(i);}

        if(switch1.isChecked() && res1 < 38 && switch2.isChecked() && oui.isChecked()) {
            Intent i = new Intent(QuestActivity.this, PositiveActivity.class);
            startActivity(i);

        }

        if(switch1.isChecked() && res1 < 38 && oui.isChecked()) {
            Intent i = new Intent(QuestActivity.this, PositiveActivity.class);
            startActivity(i);

        }
        if( res1 < 38 && switch2.isChecked() && oui.isChecked()) {
            Intent i = new Intent(QuestActivity.this, NegativeActivity.class);
            startActivity(i);

        }



    }
}