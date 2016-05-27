package com.creation.anindya.beachesofbangladesh;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// METHOD Splash   
        
        /****** Create Thread that will sleep for 5 seconds *************/        
       Thread background = new Thread() {
           public void run() {
                
               try {
                   // Thread will sleep for 5 seconds
                   sleep(3*1000);
                    
                   // After 5 seconds redirect to another intent
                   Intent i=new Intent(getBaseContext(),WelcomeActivity.class);
                   startActivity(i);
                    
                   //Remove activity
                   finish();
                    
               } catch (Exception e) {
                
               }
           }
       };
        
       // start thread
       background.start();
        
   }
    
   @Override
   protected void onDestroy() {
        
       super.onDestroy();
        
   }

}
