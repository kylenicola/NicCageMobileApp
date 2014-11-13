package com.example.nicolascageapp;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.os.Build;

public class CageClues extends Activity
{
	
   private RadioGroup rg = null;
	
   protected void onCreate(Bundle savedInstanceState)
   {
	   
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cage_clues_main);
		rg = (RadioGroup) findViewById(R.id.gameResponse);
		rg.clearCheck();

		OnClickListener listener = new OnClickListener() 
		{
        	@Override
        	public void onClick(View v) 
        	{
                RadioButton rb = (RadioButton) v;
                Toast.makeText(CageClues.this, rb.getText(), 
                Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                
        	}
		};

		RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
		rb1.setOnClickListener(listener);

		RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
		rb2.setOnClickListener(listener);

		RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
		rb3.setOnClickListener(listener);
	    
   }
}