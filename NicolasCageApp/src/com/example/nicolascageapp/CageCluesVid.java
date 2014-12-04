package com.example.nicolascageapp;
import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
 

public class CageCluesVid extends Activity
{
	//String SrcPath = "http://youtu.be/diQhM7HLNG8";
	VideoView myVideoView;
	 
	   /** Called when the activity is first created. */
	   @Override
	   public void onCreate(Bundle savedInstanceState) 
	   {
	       super.onCreate(savedInstanceState);
	      
	       setContentView(R.layout.cage_clues_video);
	       getActionBar().setDisplayHomeAsUpEnabled(true);
	       
	       myVideoView = (VideoView)findViewById(R.id.videoView1);
	       myVideoView.setMediaController(new MediaController(this));
	       myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.i_lost_my_hand2));
	       myVideoView.start();
	       
	       /*new Handler().postDelayed(new Runnable() 
	       {
	            @Override
	            public void run() {
	                setContentView(R.layout.cage_clues_main); 
	                }
	            }, 9250);*/
	   }
	   
	   public void moveToQuiz(View view) {
			Intent intent = new Intent(this, CageClues.class);
			startActivity(intent);
	   }
}
