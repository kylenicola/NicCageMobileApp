package com.example.nicolascageapp;
import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;


public class RattleTheCageVideo extends Activity
{
	//String SrcPath = "http://youtu.be/diQhM7HLNG8";
	VideoView myVideoView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.rattle_end_video);

		// all videos
		int[] videos = {R.raw.not_the_bees, R.raw.im_a_vampire, R.raw.love_me, R.raw.america_going_down_the_drain};

		// grab random video
		int video = videos[(int)(Math.random()*videos.length)];

		myVideoView = (VideoView)findViewById(R.id.RattleTheCageVideo);
		myVideoView.setMediaController(new MediaController(this));
		myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + video));
		myVideoView.start();
		myVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {

				// TODO Auto-generated method stub
				// need code to switch activities
				Intent intent = new Intent(RattleTheCageVideo.this, MainActivity.class);
				startActivity(intent);

			}
		});

		/*new Handler().postDelayed(new Runnable() 
	       {
	            @Override
	            public void run() {
	                setContentView(R.layout.cage_clues_main); 
	                }
	            }, 9250);*/
	}
	
	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

}
