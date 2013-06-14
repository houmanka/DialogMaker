package com.houmanka.dialogmaker;

import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.houmanka.dialogmaker.DialogMaker.Keys;
import com.houmanka.dialogmaker.DialogMaker.Type;

public class MainActivity extends Activity {

	public static final String TAG = MainActivity.class.getSimpleName();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public void openOneButton(View v) {
		
		HashMap<Keys, String> params = new HashMap<Keys, String>();
		params.put(Keys.BUTTON_1, "YES");
		params.put(Keys.BUTTON_2, "NO");
		params.put(Keys.MESSAGE, "This is a test");

		new DialogMaker(this, params, Type.STANDARD) {

			@Override
			protected void dealWithTheButton1() {
				Log.i(TAG,"Button 1 clicked");
			}

			@Override
			protected void dealWithTheButton2() {
				Log.i(TAG,"Button 2 clicked");
			}

		};
		
		
	}
	
	public void openStandard(View v) {
		HashMap<Keys, String> params = new HashMap<Keys, String>();
		params.put(Keys.BUTTON_1, "OK");
		params.put(Keys.MESSAGE, "This is a test");

		new DialogMaker(this, params, Type.STANDARD) {

			@Override
			protected void dealWithTheButton1() {
				Log.i(TAG,"Button 1 clicked");
			}

			@Override
			protected void dealWithTheButton2() {
				Log.i(TAG,"Nothing is going to happen :)");
			}

		};
	}
	
}
