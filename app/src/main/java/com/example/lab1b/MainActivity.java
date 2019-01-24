package com.example.lab1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private String[] MysteryHelper;
    Random r = new Random();
    String currentString;

    {
        MysteryHelper = new String[22];
        MysteryHelper[0] = "you get knocked out";
        MysteryHelper[1] = "you go somewhere else";
        MysteryHelper[2] = "you find a dead man";
        MysteryHelper[3] = "you find a dead woman";
        MysteryHelper[4] = "you meet a buxom blonde";
        MysteryHelper[5] = "someone has searched the place";
        MysteryHelper[6] = "a crooked cop warns you";
        MysteryHelper[7] = "you are arrested";
        MysteryHelper[8] = "you find a gun";
        MysteryHelper[9] = "you find a knife";
        MysteryHelper[10] = "you find a frayed rope";
        MysteryHelper[11] = "a bullet whizzes past your ear!";
        MysteryHelper[12] = "you are almost run over";
        MysteryHelper[13] = "you are being followed";
        MysteryHelper[14] = "you smell familiar perfume";
        MysteryHelper[15] = "the telephone rings";
        MysteryHelper[16] = "there is a knock at the door";
        MysteryHelper[17] = "you hear footsteps behind you ...";
        MysteryHelper[18] = " you hear a gunshot!";
        MysteryHelper[19] = "you hear a scream!";
        MysteryHelper[20] = " you are not alone ...";
        MysteryHelper[21] = "... forget this story, it stinks!";






    }

    public void gethelp(View v) {

        TextView c = (TextView) findViewById(R.id.HelpMessage);




    }
}