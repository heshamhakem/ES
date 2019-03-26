package com.example.etrading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
 Button Log_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log_out = findViewById(R.id.Logout);

    }

    public void OnLogOutClick(View view) {
       LoginActivity.SingOut();
        startActivity(new Intent(HomeActivity.this,LoginActivity.class));
        finish();

    }
}
