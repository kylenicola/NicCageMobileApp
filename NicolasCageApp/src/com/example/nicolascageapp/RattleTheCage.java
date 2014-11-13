package com.example.nicolascageapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RattleTheCage extends Activity {
	
	private SensorManager mSensorManager;
	private ShakeEventListener mSensorListener;
	
	@Override 
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rattle_main);
		mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		mSensorListener = new ShakeEventListener();
		ImageView myImageView = (ImageView) findViewById(R.id.rattleImage);
		myImageView.setImageResource(R.drawable.shakeme_first);
		
		mSensorListener.setOnShakeListener(new ShakeEventListener.OnShakeListener() {
			
			@Override
			public void onShake() {
				// TODO Auto-generated method stub
				if(mSensorListener.mTotalDuration > 0)
				{
					ImageView myImageView = (ImageView) findViewById(R.id.rattleImage);
					myImageView.setImageResource(R.drawable.shakeme_second);
				}
						
				
			}
		});
		
	}
	
	@Override
	public void onBackPressed() {
		
	}
	
	@Override
	protected void onResume() 
	{
		super.onResume();
		mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_UI);
	}
	
	@Override
	protected void onPause() 
	{
		mSensorManager.unregisterListener(mSensorListener);
		super.onPause();
	}
	
	public void onClickReturnToMainMenu(View view) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

}
