package com.example.ria.thequest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void adventureClicked(View view){
        Intent intent = new Intent (this, Adventure.class);
        startActivity(intent);
    }

    public void marketClicked(View view){
        Intent intent = new Intent (this, Marketplace.class);
        startActivity(intent);
    }

}
