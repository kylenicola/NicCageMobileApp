package com.example.nicolascageapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity{

	// Splash screen timer
	private static int SPLASH_TIME_OUT = 3000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run()
			{
				Intent i = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(i);
				
				finish();
			}
		}, SPLASH_TIME_OUT);
	}
}
