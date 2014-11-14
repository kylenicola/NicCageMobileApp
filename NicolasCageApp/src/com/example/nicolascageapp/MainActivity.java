package com.example.nicolascageapp;


import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.os.Build;

import java.util.Timer;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		
		final ImageButton rattleTheCageButton = (ImageButton) findViewById(R.id.imageButton1);
		rattleTheCageButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				rattleTheCageButton.setPressed(true);
				Handler handler = new Handler();
			    handler.postDelayed(new Runnable() {
			    	@Override
			        public void run() {
			    		Intent intent = new Intent(getBaseContext(), RattleTheCage.class);
			    		startActivity(intent);
			        }
			    }, 1000);
			    return true;
			}
		});
		
		final ImageButton abcButton = (ImageButton) findViewById(R.id.imageButton2);
		abcButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				abcButton.setPressed(true);
				Handler handler = new Handler();
			    handler.postDelayed(new Runnable() {
			    	@Override
			        public void run() {
			    		Intent intent = new Intent(getBaseContext(), AbcsWithNic.class);
			    		startActivity(intent);
			        }
			    }, 1000);
			    return true;
			}
		});
		
		final ImageButton cluesButton = (ImageButton) findViewById(R.id.imageButton3);
		cluesButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				cluesButton.setPressed(true);
				Handler handler = new Handler();
			    handler.postDelayed(new Runnable() {
			    	@Override
			        public void run() {
			    		Intent intent = new Intent(getBaseContext(), CageCluesVid.class);
			    		startActivity(intent);
			        }
			    }, 1000);
			    return true;
			}
		});
	}
	
	public void onClickSettings() {
		Intent intent = new Intent(this, Settings.class);
		startActivity(intent);
	}
	
	public void onClickHelp() {
		
	}
	
	public void onClickAbout() {
		
	}

	public void onClickQuit() {
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		
			case R.id.action_about:
				onClickAbout();
				return true;
			case R.id.action_help:
				onClickHelp();
				return true;
			case R.id.action_settings:
				onClickSettings();
				return true;
			case R.id.action_quit:
				onClickQuit();
				return true;
		}

		return super.onOptionsItemSelected(item);
	}
}		


