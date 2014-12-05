package com.example.nicolascageapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class RattleTheCageScore extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rattle_the_cage_score);
		
		SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
		Editor editor = prefs.edit();
		
		TextView mostRecentScore = (TextView)findViewById(R.id.mostRecentScoreRattle);
		int most_recent_score = prefs.getInt("rattle_most_recent_score", 0);
		mostRecentScore.setText(most_recent_score);
		
		if(prefs.getInt("rattle_hi_score", 0) < most_recent_score) {
			editor.putInt("rattle_hi_score", most_recent_score);
			editor.commit();
			int hi_score = prefs.getInt("rattle_hi_score", 0);
			TextView hiScore = (TextView)findViewById(R.id.hiScoreRattle);
			hiScore.setText(hi_score);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rattle_the_cage_score, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
