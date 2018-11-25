package com.example.dimasaryam.orcaid;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppBarLayout myAppbar = (AppBarLayout) findViewById(R.id.appbar);
        setSupportActionBar(myAppbar);
        ImageButton img1 = (ImageButton) findViewById(R.id.picbut1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, polygone.class);
                startActivity(intent);
            }
        });
        ImageButton img2 = (ImageButton) findViewById(R.id.picbut2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,usanetwork.class);
                startActivity(x);
            }
        });
        ImageButton img3 = (ImageButton) findViewById(R.id.picbut3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,round.class);
                startActivity(x);
            }
        });
        ImageButton img4 = (ImageButton) findViewById(R.id.picbut4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Movers.class);
                startActivity(i);
            }
        });
        ImageButton img5 = (ImageButton) findViewById(R.id.picbut5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,clap.class);
                startActivity(i);
            }
        });
        ImageButton img6 = (ImageButton) findViewById(R.id.picbut6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this, RR.class);
                startActivity(x);
            }
        });
    }

    private void setSupportActionBar(AppBarLayout myAppbar) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
