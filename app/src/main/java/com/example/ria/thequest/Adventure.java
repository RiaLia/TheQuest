package com.example.ria.thequest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;
import static android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP;

public class Adventure extends AppCompatActivity {

    ImageView rock;
    ImageView dragon;
    Button fight;
    Button run;
    Button tryButton;


  //  TheQuest holyGrail = new TheQuest();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);
        rock = (ImageView)findViewById(R.id.rock);
        dragon = (ImageView)findViewById(R.id.dragon);
        fight = (Button) findViewById(R.id.fightButton);
        run = (Button)findViewById(R.id.runButton);
        tryButton = (Button)findViewById(R.id.tryButton);
        start();

    }
    public void start(){
        rock.setVisibility(View.INVISIBLE);
        dragon.setVisibility(View.INVISIBLE);
        tryButton.setVisibility(View.INVISIBLE);
        fight.setVisibility(View.INVISIBLE);
        run.setVisibility(View.INVISIBLE);
        goFish();
    }



    public void goFish(){
        Random random = new Random();
        int chance = random.nextInt(2)+ 1;
        if (chance == 1){
            rock.setVisibility(View.VISIBLE);
            tryButton.setVisibility(View.VISIBLE);

        }
        else {dragon.setVisibility(View.VISIBLE);
            fight.setVisibility(View.VISIBLE);
            run.setVisibility(View.VISIBLE);

        }

    }

    public void tryClicked(View view){
       start();
    }

    public void fightClicked(View view){

    }

    public void runClicked(View view){
        Intent intent = new Intent(this, Game.class);
        intent.setFlags(FLAG_ACTIVITY_SINGLE_TOP | FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }




}
