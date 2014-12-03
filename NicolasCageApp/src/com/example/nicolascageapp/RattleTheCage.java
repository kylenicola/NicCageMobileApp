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
import android.os.Vibrator;

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
		myImageView.setTag(R.drawable.shakeme_first);
		
		mSensorListener.setOnShakeListener(new ShakeEventListener.OnShakeListener() {
			
			@Override
			public void onShake(long totalDuration, boolean hasStopped) {
				ImageView myImageView = (ImageView) findViewById(R.id.rattleImage);
				Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				
				long sixth_time = 13;
				long fifth_time = 10;
				long fourth_time = 7;
				long third_time = 4;
				long second_time = 2;
				
				

				if(totalDuration > (sixth_time * 1000))
				{
					Intent intent = new Intent(RattleTheCage.this, RattleTheCageVideo.class);
					startActivity(intent);
					// Move to video activity
				}
				else if(totalDuration > (fifth_time * 1000))
				{
					if(!myImageView.getTag().equals(R.drawable.shakeme_fifth))
					{
						long[] patterns = {0, 400, 100, 400, 100, 400, 100, 400, 100, 400, 100, 400, 100};
						myImageView.setImageResource(R.drawable.shakeme_fifth);
						v.vibrate(patterns, -1);
						myImageView.setTag(R.drawable.shakeme_fifth);
					}
				}
				else if(totalDuration > (fourth_time * 1000))
				{
					if(!myImageView.getTag().equals(R.drawable.shakeme_fourth))
					{
						long[] patterns = {0, 300, 100, 350, 250, 300, 100, 350, 250, 300, 100, 350, 250};
						myImageView.setImageResource(R.drawable.shakeme_fourth);
						v.vibrate(patterns, -1);
						myImageView.setTag(R.drawable.shakeme_fourth);
					}
				}
				else if(totalDuration > (third_time * 1000))
				{
					if(!myImageView.getTag().equals(R.drawable.shakeme_third))
					{
						long[] patterns = {0, 220, 100, 230, 500, 220, 100, 230, 500, 220, 100, 230, 350};
						myImageView.setImageResource(R.drawable.shakeme_third);
						v.vibrate(patterns, -1);
						myImageView.setTag(R.drawable.shakeme_third);
					}
				}
				else if(totalDuration > (second_time * 1000))
				{
					if(!myImageView.getTag().equals(R.drawable.shakeme_second))
					{
						long[] patterns = {0, 200, 100, 200, 1500};
						myImageView.setImageResource(R.drawable.shakeme_second);
						v.vibrate(patterns, -1);
						myImageView.setTag(R.drawable.shakeme_second);
					}
				}
				else
				{
					if(!myImageView.getTag().equals(R.drawable.shakeme_first))
					{
						myImageView.setImageResource(R.drawable.shakeme_first);
						myImageView.setTag(R.drawable.shakeme_first);
					}
				}

			}
		});
		
	}
	
	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
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
