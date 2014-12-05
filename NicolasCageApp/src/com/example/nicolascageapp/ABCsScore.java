package com.example.nicolascageapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ABCsScore extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_abcs_score);
		
		SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
		Editor editor = prefs.edit();
		
		TextView mostRecentScore = (TextView)findViewById(R.id.mostRecentScoreABC);
		int most_recent_score = prefs.getInt("abc_most_recent_score", 0);
		mostRecentScore.setText(most_recent_score);
		
		if(prefs.getInt("abc_hi_score", 0) < most_recent_score) {
			editor.putInt("abc_hi_score", most_recent_score);
			editor.commit();
			int hi_score = prefs.getInt("abc_hi_score",0);
			TextView hiScore = (TextView)findViewById(R.id.hiScoreABC);
			hiScore.setText(hi_score);
		}
	}


}
