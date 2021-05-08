package com.example.miniprojet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText mail;
    private EditText password;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.mail = (EditText)findViewById(R.id.identifiant);
        this.password = (EditText)findViewById(R.id.motdepasse);
        this.firebaseAuth = FirebaseAuth.getInstance();
    }


    public void Authentifier(View v){
        /*Intent i = new Intent(LoginActivity.this, QuestActivity.class);
        startActivity(i);*/
        String email = mail.getText().toString();
        String pas =  password.getText().toString();
        firebaseAuth.signInWithEmailAndPassword(email,pas).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(getApplicationContext(),QuestActivity.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"verfier votre adresse mail ou mot de passe",Toast.LENGTH_LONG).show();
                }
            }
        });

    }



}