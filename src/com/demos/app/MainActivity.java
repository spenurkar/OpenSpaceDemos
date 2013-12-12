package com.demos.app;

import com.demos.ui.AnimateButtonDemo;
import com.demos.ui.SimplePopupWindowDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Button btnSimplePopupWindow = (Button) findViewById(R.id.btnSimplePopupWindow);
		btnSimplePopupWindow.setOnClickListener(this);
		
		Button btnAnimateButtons = (Button) findViewById(R.id.btnAnimateButtons);
		btnAnimateButtons.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.btnSimplePopupWindow:
			redirectTo(SimplePopupWindowDemo.class);
			break;
		case R.id.btnAnimateButtons:
			redirectTo(AnimateButtonDemo.class);
			break;
		default:
			break;
		}
	}
	
	private void redirectTo(Class clazz){
		Intent i = new Intent(this, clazz);
		startActivity(i);
	}

}
