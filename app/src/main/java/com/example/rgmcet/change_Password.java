package com.example.rgmcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class change_Password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change__password);
    }

    public void back_to_login(View view) {

        Intent i= new Intent(change_Password.this,LoginActivity.class);
        startActivity(i);
        finish();
    }
}
