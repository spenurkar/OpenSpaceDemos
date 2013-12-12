package com.demos.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.demos.app.R;

public class AnimateButtonDemo extends Activity implements OnClickListener {

	Animation animTranslate, animAlpha, animScale, animRotate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animate_button_demo);

		animTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
		animAlpha = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
		animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
		animRotate = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);

		Button btnTranslate = (Button) findViewById(R.id.translate);
		Button btnAlpha = (Button) findViewById(R.id.alpha);
		Button btnScale = (Button) findViewById(R.id.scale);
		Button btnRotate = (Button) findViewById(R.id.rotate);
		
		btnTranslate.setOnClickListener(this);
		btnAlpha.setOnClickListener(this);
		btnScale.setOnClickListener(this);
		btnRotate.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.animate_button_demo, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();

		switch (id) {
		case R.id.translate:
			v.startAnimation(animTranslate);
			break;
		case R.id.alpha:
			v.startAnimation(animAlpha);
			break;
		case R.id.scale:
			v.startAnimation(animScale);
			break;
		case R.id.rotate:
			v.startAnimation(animRotate);
			break;
		default:
			break;
		}
	}

}
