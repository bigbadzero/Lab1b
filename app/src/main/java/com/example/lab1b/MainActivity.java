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
import java.util.Arrays;
import java.util.Random;


public class MainActivity extends AppCompatActivity {


    private final String[] messages = {"you get knocked out", "you go somewhere else", "you find a dead man", "you find a dead woman", "you meet a buxom blonde",
            "someone has searched the place", "a crooked cop warns you", "you are arrested", "you find a gun", "you find a knife", "you find a frayed rope",
            "a bullet whizzes past your ear!", "you are almost run over", "you are being followed", "you smell familiar perfume", "the telephone rings",
            "there is a knock at the door", "you hear footsteps behind you ...", "you hear a gunshot!", "you hear a scream!", "you are not alone ...",
            "... forget this story, it stinks!"};
    private ArrayList<String> availableMessages;
    Random r = new Random();


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
        availableMessages = new ArrayList<>(Arrays.asList(messages));
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


    public void gethelp(View v) {


        if (availableMessages.size() < 1) {
            availableMessages = new ArrayList<>(Arrays.asList(messages));
        }

        int random = r.nextInt(availableMessages.size());
        TextView c = (TextView) findViewById(R.id.HelpMessage);
        c.setText(availableMessages.get(random));

        availableMessages.remove(random);



        }
    }
