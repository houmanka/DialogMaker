package com.houmanka.dialogmaker;

import java.util.HashMap;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;

public abstract class DialogMaker {

	Context activity;
	HashMap<Keys, String> params;

	public enum Type {
		STANDARD, NEUTRAL
	}

	public enum Keys {
		BUTTON_1, BUTTON_2, MESSAGE
	}

	Type type;
	Keys key;

	public DialogMaker(Context activity, HashMap<Keys, String> params, Type type) {
		this.activity = activity;
		this.params = params;
		this.type = type;

		if (this.type == null) {
			this.type = Type.STANDARD;
		}

		createDialog();

	}

	private void createDialog() {
		// prepare the alert box
		AlertDialog.Builder alertbox = new AlertDialog.Builder(this.activity);

		// set the message to display
		alertbox.setMessage(params.get(Keys.MESSAGE));

		Log.i("", "this.type" + this.type);

		// Check the type of DialogBox
		if (this.type == Type.STANDARD) {

			// This is standard 2 buttons
			// set a positive/yes button and create a listener
			alertbox.setPositiveButton(params.get(Keys.BUTTON_1),
					new DialogInterface.OnClickListener() {

						// do something when the button is clicked
						public void onClick(DialogInterface arg0, int arg1) {
							dealWithTheButton1();
						}
					});

			// set a negative/no button and create a listener
			alertbox.setNegativeButton(params.get(Keys.BUTTON_2),
					new DialogInterface.OnClickListener() {

						// do something when the button is clicked
						public void onClick(DialogInterface arg0, int arg1) {
							dealWithTheButton2();
						}
					});

		} else if (this.type == Type.NEUTRAL) {
			// This is neutral
			// add a neutral button to the alert box and assign a click listener
			alertbox.setNeutralButton(params.get(Keys.BUTTON_1),
					new DialogInterface.OnClickListener() {

						// click listener on the alert box
						public void onClick(DialogInterface arg0, int arg1) {
							// the button was clicked
							dealWithTheButton1();
						}
					});
		}

		// display box
		alertbox.show();
	}

	protected abstract void dealWithTheButton1();

	protected abstract void dealWithTheButton2();

}