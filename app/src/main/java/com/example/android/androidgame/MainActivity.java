package com.example.android.androidgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onClick2003 (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();

    }

    public void onClick2004 (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void onClick2005 (View view)
    {
        Toast.makeText(this, "Yes! Well done!", Toast.LENGTH_SHORT).show();
    }

    public void onClick2006 (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }
}
