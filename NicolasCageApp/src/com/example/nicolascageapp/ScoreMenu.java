package com.example.nicolascageapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ScoreMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_score_menu);
	}


	
	public void onClickRattleTheCageScore(View view) {
		Intent intent = new Intent(this, RattleTheCageScore.class);
		startActivity(intent);
	}
	
	public void onClickABCsScore(View view) {
		Intent intent = new Intent(this, ABCsScore.class);
		startActivity(intent);
	}
	
	public void onClickCageCluesScore(View view) {
		Intent intent = new Intent(this, CageCluesScore.class);
		startActivity(intent);
	}		
}
