package net.cloud95.android.lession.res06;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Res06Activity extends Activity {
	ImageView imageView01;
	AnimationListener animationListener;
    // Animation 動畫器
    Animation animFadein, animFadeout, animZoomin, animZoomout,
    			animCrossFade, animBlink, animRotate, animMove,
    			animSlideup, animSlidedown, animBounce, animSequential,
    			animTogether;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res06);
        imageView01=(ImageView)findViewById(R.id.imageView1);
        //設定動畫監聽的受委任者
        animationListener = new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				//Take any action after completing the animation
				
				Toast.makeText(Res06Activity.this, "動畫結束", Toast.LENGTH_LONG).show();
				
			}
		};
        // load the animation
		animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		 // set animation listener
		animFadein.setAnimationListener(animationListener);
		animFadeout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animFadeout.setAnimationListener(animationListener);
		animBlink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animBlink.setAnimationListener(animationListener);
		animZoomin = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animZoomin.setAnimationListener(animationListener);
		animZoomout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animZoomout.setAnimationListener(animationListener);
		animRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animRotate.setAnimationListener(animationListener);
		animMove = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animMove.setAnimationListener(animationListener);
		animSlideup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animSlideup.setAnimationListener(animationListener);
		animSlidedown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animSlidedown.setAnimationListener(animationListener);
		animBounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animBounce.setAnimationListener(animationListener);
		animSequential = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animSequential.setAnimationListener(animationListener);
		animTogether = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animTogether.setAnimationListener(animationListener);
       
    }
    public void btnBeClicked(View view){
    	switch (view.getId()){
    		//根據不同按鈕啟動不同動畫
    	case R.id.fadeinbtn:
    		imageView01.startAnimation(animFadein);
    		break;
    	case R.id.fadeoutbtn:
    		imageView01.startAnimation(animFadeout);
    		break;
    	case R.id.blinkbtn:
    		imageView01.startAnimation(animBlink);
    		break;
    	case R.id.zoominbtn:
    		imageView01.startAnimation(animZoomin);
    		break;
    	case R.id.zoomoutbtn:
    		imageView01.startAnimation(animZoomout);
    		break;
    	case R.id.rotatebtn:
    		imageView01.startAnimation(animRotate);
    		break;
    	case R.id.movebtn:
    		imageView01.startAnimation(animMove);
    		break;
    	case R.id.slideupbtn:
    		imageView01.startAnimation(animSlideup);
    		break;
    	case R.id.slidedownbtn:
    		imageView01.startAnimation(animSlidedown);
    		break;
    	case R.id.bouncebtn:
    		imageView01.startAnimation(animBounce);
    		break;
    	case R.id.sequentialbtn:
    		imageView01.startAnimation(animSequential);
    		break;
    	case R.id.togetherbtn:
    		imageView01.startAnimation(animTogether);
    		break;
    	}
    }
}
