package com.example.nicolascageapp;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;
import android.os.Build;

public class Settings extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
	}

	TextView reject;
	public void rejectSetting(View view) {
		reject = (TextView)findViewById(R.id.rejectSlowDownABCs);
		reject.setVisibility(View.VISIBLE);
		reject.postDelayed(new Runnable() {
	        public void run() {
	            reject.setVisibility(View.GONE);
	        }
	    }, 5000);

	}

}

