package com.example.nicolascageapp;
import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
 

public class AbcsWithNic extends Activity
{
	   VideoView myVideoView;
	   public int playerScore;
	 
	   /** Called when the activity is first created. */
	   @Override
	   public void onCreate(Bundle savedInstanceState) 
	   {
	       super.onCreate(savedInstanceState);
	      
	       setContentView(R.layout.activity_abcs_with_nic);
	       getActionBar().setDisplayHomeAsUpEnabled(true);
	       
	       myVideoView = (VideoView)findViewById(R.id.abcs_videoView);
	       myVideoView.setMediaController(new MediaController(this));
	       myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.i_lost_my_hand2));
	       myVideoView.start();
	       myVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() 
	       {
	    	   @Override
	    	   public void onCompletion(MediaPlayer mp) 
	    	   {

	    		   Handler handler = new Handler();
	    		   handler.postDelayed(new Runnable() 
	    		   {
	    			   @Override
	    			   public void run() 
	    			   {
	    				   String endToast = "Your score was: " + getPlayerScore();
	    				   Toast.makeText(AbcsWithNic.this, endToast, 
	    						   Toast.LENGTH_SHORT).show();
	    				   Intent intent = new Intent(getBaseContext(), ABCsScore.class);
	    				   startActivity(intent);
	    			   }
			    	
	    		   }, 500);
	    	   }
		   });

	       
	       final long startTime = System.currentTimeMillis();
	       
	       final Button keyA = (Button) findViewById(R.id.ButtonA);
	         keyA.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long aTime = System.currentTimeMillis();
	                if (startTime - aTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - aTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyB = (Button) findViewById(R.id.ButtonB);
	         keyB.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long bTime = System.currentTimeMillis();
	                if (startTime - bTime >= 0 && startTime - bTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - bTime >= 0 && startTime - bTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyC = (Button) findViewById(R.id.ButtonC);
	         keyC.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long cTime = System.currentTimeMillis();
	                if (startTime - cTime >= 0 && startTime - cTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - cTime >= 0 && startTime - cTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyD = (Button) findViewById(R.id.ButtonD);
	         keyD.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long dTime = System.currentTimeMillis();
	                if (startTime - dTime >= 0 && startTime - dTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - dTime >= 0 && startTime - dTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyE = (Button) findViewById(R.id.ButtonE);
	         keyE.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long eTime = System.currentTimeMillis();
	                if (startTime - eTime >= 0 && startTime - eTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - eTime >= 0 && startTime - eTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyF = (Button) findViewById(R.id.ButtonF);
	         keyF.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long fTime = System.currentTimeMillis();
	                if (startTime - fTime >= 0 && startTime - fTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - fTime >= 0 && startTime - fTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyG = (Button) findViewById(R.id.ButtonG);
	         keyG.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long gTime = System.currentTimeMillis();
	                if (startTime - gTime >= 0 && startTime - gTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - gTime >= 0 && startTime - gTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyH = (Button) findViewById(R.id.ButtonH);
	         keyH.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long hTime = System.currentTimeMillis();
	                if (startTime - hTime >= 0 && startTime - hTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - hTime >= 0 && startTime - hTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyI = (Button) findViewById(R.id.ButtonI);
	         keyI.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long iTime = System.currentTimeMillis();
	                if (startTime - iTime >= 0 && startTime - iTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - iTime >= 0 && startTime - iTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyJ = (Button) findViewById(R.id.ButtonJ);
	         keyJ.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long jTime = System.currentTimeMillis();
	                if (startTime - jTime >= 0 && startTime - jTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - jTime >= 0 && startTime - jTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyK = (Button) findViewById(R.id.ButtonK);
	         keyK.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long kTime = System.currentTimeMillis();
	                if (startTime - kTime >= 0 && startTime - kTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - kTime >= 0 && startTime - kTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyL = (Button) findViewById(R.id.ButtonL);
	         keyL.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long lTime = System.currentTimeMillis();
	                if (startTime - lTime >= 0 && startTime - lTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - lTime >= 0 && startTime - lTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyM = (Button) findViewById(R.id.ButtonM);
	         keyM.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long mTime = System.currentTimeMillis();
	                if (startTime - mTime >= 0 && startTime - mTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - mTime >= 0 && startTime - mTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyN = (Button) findViewById(R.id.ButtonN);
	         keyN.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long nTime = System.currentTimeMillis();
	                if (startTime - nTime >= 0 && startTime - nTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - nTime >= 0 && startTime - nTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyO = (Button) findViewById(R.id.ButtonO);
	         keyO.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long oTime = System.currentTimeMillis();
	                if (startTime - oTime >= 0 && startTime - oTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - oTime >= 0 && startTime - oTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyP = (Button) findViewById(R.id.ButtonP);
	         keyP.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long pTime = System.currentTimeMillis();
	                if (startTime - pTime >= 0 && startTime - pTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - pTime >= 0 && startTime - pTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyQ = (Button) findViewById(R.id.buttonQ);
	         keyQ.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long qTime = System.currentTimeMillis();
	                if (startTime - qTime >= 0 && startTime - qTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - qTime >= 0 && startTime - qTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyR = (Button) findViewById(R.id.ButtonR);
	         keyR.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long rTime = System.currentTimeMillis();
	                if (startTime - rTime >= 0 && startTime - rTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - rTime >= 0 && startTime - rTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyS = (Button) findViewById(R.id.ButtonS);
	         keyS.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long sTime = System.currentTimeMillis();
	                if (startTime - sTime >= 0 && startTime - sTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - sTime >= 0 && startTime - sTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyT = (Button) findViewById(R.id.ButtonT);
	         keyT.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long tTime = System.currentTimeMillis();
	                if (startTime - tTime >= 0 && startTime - tTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - tTime >= 0 && startTime - tTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyU = (Button) findViewById(R.id.ButtonU);
	         keyU.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long uTime = System.currentTimeMillis();
	                if (startTime - uTime >= 0 && startTime - uTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - uTime >= 0 && startTime - uTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyV = (Button) findViewById(R.id.ButtonV);
	         keyV.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long vTime = System.currentTimeMillis();
	                if (startTime - vTime >= 0 && startTime - vTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - vTime >= 0 && startTime - vTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyW = (Button) findViewById(R.id.ButtonW);
	         keyW.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long wTime = System.currentTimeMillis();
	                if (startTime - wTime >= 0 && startTime - wTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - wTime >= 0 && startTime - wTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyX= (Button) findViewById(R.id.ButtonX);
	         keyX.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long xTime = System.currentTimeMillis();
	                if (startTime - xTime >= 0 && startTime - xTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - xTime >= 0 && startTime - xTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyY = (Button) findViewById(R.id.ButtonY);
	         keyY.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long yTime = System.currentTimeMillis();
	                if (startTime - yTime >= 0 && startTime -yTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - yTime >= 0 && startTime - yTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	         final Button keyZ = (Button) findViewById(R.id.ButtonZ);
	         keyZ.setOnClickListener(new View.OnClickListener() 
	         {
	             public void onClick(View v) 
	             {
	                long zTime = System.currentTimeMillis();
	                if (startTime - zTime >= 0 && startTime -zTime <= .25)
	                {
	                	playerScore += 100;
	                }
	                else if (startTime - zTime >= 0 && startTime - zTime <= .5)
	                {
	                	playerScore += 50;
	                }
	             }
	         });
	       
	   }
	   
	   public int getPlayerScore()
	   {
		   return playerScore;
	   }
	   
	   public void backToMain(View view) {
			Intent intent = new Intent(this, MainActivity.class);
			startActivity(intent);
	   }
	   
}

