package com.demos.ui;

import com.demos.app.R;
import com.demos.app.R.layout;
import com.demos.app.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SimplePopupWindowDemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_popup_window);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simple_popup_window, menu);
		return true;
	}

}
