package com.example.nicolascageapp;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
 

public class CageCluesVid extends Activity
{
	String SrcPath = "http://youtu.be/diQhM7HLNG8";
	 
	   /** Called when the activity is first created. */
	   @Override
	   public void onCreate(Bundle savedInstanceState) 
	   {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.cage_clues_video);
	       VideoView myVideoView = (VideoView)findViewById(R.id.videoView1);
	       myVideoView.setVideoURI(Uri.parse(SrcPath));
	       myVideoView.setMediaController(new MediaController(this));
	       myVideoView.requestFocus();
	       myVideoView.start();
	       
	       Intent i = new Intent(getApplicationContext(), CageClues.class);
           startActivity(i);
	   }
}